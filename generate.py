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

enum_template = """package com.mosco.javacpp_cuda_math;

public enum OneParam$t {
    $enums
}
"""

main_java_template = """package com.mosco.javacpp_cuda_math;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.LongPointer;

import java.io.IOException;

public class CudaMath$tc extends AbstractCudaMath {
    public CudaMath${tc}() throws IOException {
        super("$t");
    }

$body

    private void call(OneParam$tc f, int n, IntPointer intPointer, LongPointer result, LongPointer x) {
        super.call(f.name(), n, intPointer, result, x);
    }
}
"""

test_java_template = """package com.mosco.javacpp_cuda_math;

import static org.bytedeco.javacpp.cuda.*;

import org.bytedeco.javacpp.${tc}Pointer;
import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.cuda;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.*;

import static com.mosco.javacpp_cuda_math.AbstractCudaMath.checkResult;

public class CudaMath${tc}Test {
    private static final int N = 2000;
    private static CudaMath${tc} cudaMath${tc};
    private static LongPointer input;
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

        ${t}[] inputArray = new ${t}[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = i;
        }

        input = new LongPointer(1);
        checkResult(cuMemAlloc(input, N * ${tc}.BYTES));
        checkResult(cuMemcpyHtoD(input.get(), new ${tc}Pointer(inputArray), N * ${tc}.BYTES));

        result = new LongPointer(1);
        checkResult(cuMemAlloc(result, N * ${tc}.BYTES));
    }

}
"""


def parseDocumentation(filename, nType):
    soup = BeautifulSoup(open(filename))
    result = {'one': [], 'two': [], 'rest': [], 'error': []}
    for dt in soup.body.dl.find_all("dt"):
        contents = dt.span.contents
        if len(contents) >= 3:
            rType = contents[3].strip().strip(u'\u200B').strip()
            contents2 = dt.contents[1].contents
            params = [contents2[i].strip(' (,') for i in range(1, len(contents2) - 1, 3)]
            mName = dt.contents[1].a.string
            if (rType == nType and params == [nType]):
                result['one'].append(mName)
            elif (rType == nType and params == [nType, nType]):
                result['two'].append(mName)
            else:
                result['rest'].append(mName)

        else:
            result['error'].append(dt)
            # print("hier probleem " + contents[0])
    return result


def updateCuFile(fNames, nType):
    with open('src/main/resources/cuda_math_' + nType + '.cu', 'w+') as file:
        file.seek(0)
        s = Template(one_template)
        for fName in fNames:
            file.write(s.substitute(f=fName, t=nType))
        file.truncate()


def updateEnum(fNames, nType):
    with open('src/main/java/com/mosco/javacpp_cuda_math/OneParam' + nType.capitalize() + '.java', 'w+') as file:
        file.seek(0)
        file.write(Template(enum_template).substitute(enums=','.join(fNames), t=nType.capitalize()))
        file.truncate()


def updateMainJavaFile(fNames, nType):
    with open('src/main/java/com/mosco/javacpp_cuda_math/CudaMath' + nType.capitalize() + '.java', 'w+') as file:
        file.seek(0)
        funt = Template("""    public void ${fNameM}(int n, LongPointer x, LongPointer result) {
        call(OneParam${tc}.$fName, n, new IntPointer(new int[]{n}), result, x);
    }

""")
        body = ''
        for fName in fNames:
            body += funt.substitute(fName=fName, fNameM=fName[:-1] if nType == 'float' else fName, tc=nType.capitalize())

        file.write(Template(main_java_template).substitute(f='', t=nType, tc=nType.capitalize(), body=body))
        file.truncate()


def updateTestJavaFile(fNames, nType):
    with open('src/test/java/com/mosco/javacpp_cuda_math/CudaMath' + nType.capitalize() + 'Test.java', 'w+') as file:
        file.seek(0)
        funt = Template("""    @Test
    public void test${fName}() {
        cudaMath${tc}.${fNameM}(N, input, result);
    }

""")
        body = ''
        for fName in fNames:
            body += funt.substitute(fName=fName, fNameM=fName[:-1] if nType == 'float' else fName, t=nType, tc=nType.capitalize())

        file.write(Template(test_java_template).substitute(f='', t=nType, tc=nType.capitalize(), body=body))
        file.truncate()


for aType in [{'t': 'float', 'd': 'SINGLE'}, {'t': 'double', 'd': 'DOUBLE'}]:
    nType = aType['t']
    results = parseDocumentation(docDir + 'group__CUDA__MATH__' + aType['d'] + '.html', nType)
    updateCuFile(results['one'], nType)
    updateEnum(results['one'], nType)
    updateMainJavaFile(results['one'], nType)
    updateTestJavaFile(results['one'], nType)

# for key, value in resultFloat.iteritems():
#     print("%s: %i" % (key, len(value)))
# resultDouble = parseDocumentation(docDir + 'group__CUDA__MATH__DOUBLE.html', 'double')
# for key, value in resultDouble.iteritems():
#     print("%s: %i" % (key, len(value)))
