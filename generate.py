#!/usr/bin/python
from bs4 import BeautifulSoup
from string import Template

docDir = '/Developer/NVIDIA/CUDA-7.0/doc/html/cuda-math-api/'

one_template = """extern "C"
__global__ void math_${f}(size_t n, $t *result, $t  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = ${f}(x[id]);
    }
}

"""

two_template = """extern "C"
__global__ void math_${f}(size_t n, $t *result, $t  *x, $t  *y) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = ${f}(x[id],y[id]);
    }
}

"""

enum_template = """package com.mosco.javacpp_cuda_math;

public enum Functions$t {
    $enums
}
"""

main_java_template = """package com.mosco.javacpp_cuda_math;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.Pointer;

import java.io.IOException;

public class CudaMath$tc extends AbstractCudaMath {
    public CudaMath${tc}() throws IOException {
        super("$t");
    }

$body

    private void call(Functions$tc f, int n, Pointer... pointers) {
        Pointer[] all = new Pointer[pointers.length + 1];
        all[0] = new IntPointer(new int[]{n});
        for (int i = 0; i < pointers.length; i++) {
            all[i + 1] = pointers[i];
        }
        super.call(f.name(), n, all);
    }
}
"""

test_java_template = """package com.mosco.javacpp_cuda_math;

import static org.bytedeco.javacpp.cuda.*;

import org.bytedeco.javacpp.${tc}Pointer;
import org.bytedeco.javacpp.LongPointer;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.*;

import static com.mosco.javacpp_cuda_math.AbstractCudaMath.checkResult;

public class CudaMath${tc}Test {
    private static final int N = 2000;
    private static CudaMath${tc} cudaMath${tc};
    private static LongPointer x, y;
    private static LongPointer result;

$body

    @BeforeClass
    public static void setUp() throws Exception {
        Logger logger = Logger.getLogger(AbstractCudaMath.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
        logger.addHandler(handler);
        handler.setLevel(Level.FINE);
        logger.setLevel(Level.FINE);

        checkResult(cuInit(0));

        CUctx_st context = new CUctx_st();
        checkResult(cuCtxCreate(context, 0, 0));

        cudaMath${tc} = new CudaMath${tc}();

        ${t}[] xArray = new ${t}[N];
        for (int i = 0; i < N; i++) {
            xArray[i] = i;
        }

        x = new LongPointer(1);
        checkResult(cuMemAlloc(x, N * ${tc}.BYTES));
        checkResult(cuMemcpyHtoD(x.get(), new ${tc}Pointer(xArray), N * ${tc}.BYTES));

        ${t}[] yArray = new ${t}[N];
        for (int i = 0; i < N; i++) {
            yArray[i] = i;
        }

        y = new LongPointer(1);
        checkResult(cuMemAlloc(y, N * ${tc}.BYTES));
        checkResult(cuMemcpyHtoD(y.get(), new ${tc}Pointer(yArray), N * ${tc}.BYTES));

        result = new LongPointer(1);
        checkResult(cuMemAlloc(result, N * ${tc}.BYTES));
    }

}
"""


def parseDocumentation(filename, n_type):
    soup = BeautifulSoup(open(filename))
    result = {'one': [], 'two': [], 'rest': [], 'error': []}
    for dt in soup.body.dl.find_all("dt"):
        contents = dt.span.contents
        if len(contents) >= 3:
            r_type = contents[3].strip().strip(u'\u200B').strip()
            contents2 = dt.contents[1].contents
            params = [contents2[i].strip(' (,') for i in range(1, len(contents2) - 1, 3)]
            mName = dt.contents[1].a.string
            if r_type == n_type and params == [n_type]:
                result['one'].append(mName)
            elif r_type == n_type and params == [n_type, n_type]:
                result['two'].append(mName)
            else:
                result['rest'].append(mName)

        else:
            result['error'].append(dt)
            # print("hier probleem " + contents[0])
    return result


def updateCuFile(results, nType):
    with open('src/main/resources/cuda_math_' + nType + '.cu', 'w+') as cuFile:
        cuFile.seek(0)
        t_one = Template(one_template)
        for fName in results['one']:
            cuFile.write(t_one.substitute(f=fName, t=nType))
        t_two = Template(two_template)
        for fName in results['two']:
            cuFile.write(t_two.substitute(f=fName, t=nType))
        cuFile.truncate()


def updateEnum(results, nType):
    with open('src/main/java/com/mosco/javacpp_cuda_math/Functions' + nType.capitalize() + '.java', 'w+') as file:
        file.seek(0)
        file.write(Template(enum_template).substitute(enums=','.join(results['one']) + ',' + ','.join(results['two']),
                                                      t=nType.capitalize()))
        file.truncate()


def updateMainJavaFile(results, nType):
    with open('src/main/java/com/mosco/javacpp_cuda_math/CudaMath' + nType.capitalize() + '.java', 'w+') as file:
        file.seek(0)
        body = ''
        one_t = Template("""    public void ${fNameM}(int n, LongPointer x, LongPointer result) {
        call(Functions${tc}.$fName, n, result, x);
    }

""")
        for fName in results['one']:
            body += one_t.substitute(fName=fName, fNameM=fName[:-1] if nType == 'float' else fName,
                                     tc=nType.capitalize())
        two_t = Template("""    public void ${fNameM}(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(Functions${tc}.$fName, n, result, x, y);
    }

""")
        for fName in results['two']:
            body += two_t.substitute(fName=fName, fNameM=fName[:-1] if nType == 'float' else fName,
                                     tc=nType.capitalize())

        file.write(Template(main_java_template).substitute(f='', t=nType, tc=nType.capitalize(), body=body))
        file.truncate()


def updateTestJavaFile(results, nType):
    with open('src/test/java/com/mosco/javacpp_cuda_math/CudaMath' + nType.capitalize() + 'Test.java', 'w+') as file:
        file.seek(0)
        body = ''
        one_t = Template("""    @Test
    public void test${fName}() {
        cudaMath${tc}.${fNameM}(N, x, result);
    }

""")
        for fName in results['one']:
            body += one_t.substitute(fName=fName, fNameM=fName[:-1] if nType == 'float' else fName, t=nType,
                                     tc=nType.capitalize())
        two_t = Template("""    @Test
    public void test${fName}() {
        cudaMath${tc}.${fNameM}(N, x, y, result);
    }

""")
        for fName in results['two']:
            body += two_t.substitute(fName=fName, fNameM=fName[:-1] if nType == 'float' else fName, t=nType,
                                     tc=nType.capitalize())

        file.write(Template(test_java_template).substitute(f='', t=nType, tc=nType.capitalize(), body=body))
        file.truncate()


for aType in [{'t': 'float', 'd': 'SINGLE'}, {'t': 'double', 'd': 'DOUBLE'}]:
    nType = aType['t']
    results = parseDocumentation(docDir + 'group__CUDA__MATH__' + aType['d'] + '.html', nType)
    updateCuFile(results, nType)
    updateEnum(results, nType)
    updateMainJavaFile(results, nType)
    updateTestJavaFile(results, nType)

# for key, value in resultFloat.iteritems():
#     print("%s: %i" % (key, len(value)))
# resultDouble = parseDocumentation(docDir + 'group__CUDA__MATH__DOUBLE.html', 'double')
# for key, value in resultDouble.iteritems():
#     print("%s: %i" % (key, len(value)))
