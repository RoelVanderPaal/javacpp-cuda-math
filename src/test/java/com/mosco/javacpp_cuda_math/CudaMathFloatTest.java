package com.mosco.javacpp_cuda_math;

import static org.bytedeco.javacpp.cuda.*;

import org.bytedeco.javacpp.FloatPointer;
import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.cuda;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.*;

import static com.mosco.javacpp_cuda_math.AbstractCudaMath.checkResult;

public class CudaMathFloatTest {
    private static final int N = 2000;
    private static CudaMathFloat cudaMathFloat;
    private static LongPointer input;
    private static LongPointer result;

    @Test
    public void testacosf() {
        cudaMathFloat.acos(N, input, result);
    }

    @Test
    public void testacoshf() {
        cudaMathFloat.acosh(N, input, result);
    }

    @Test
    public void testasinf() {
        cudaMathFloat.asin(N, input, result);
    }

    @Test
    public void testasinhf() {
        cudaMathFloat.asinh(N, input, result);
    }

    @Test
    public void testatanf() {
        cudaMathFloat.atan(N, input, result);
    }

    @Test
    public void testatanhf() {
        cudaMathFloat.atanh(N, input, result);
    }

    @Test
    public void testcbrtf() {
        cudaMathFloat.cbrt(N, input, result);
    }

    @Test
    public void testceilf() {
        cudaMathFloat.ceil(N, input, result);
    }

    @Test
    public void testcosf() {
        cudaMathFloat.cos(N, input, result);
    }

    @Test
    public void testcoshf() {
        cudaMathFloat.cosh(N, input, result);
    }

    @Test
    public void testcospif() {
        cudaMathFloat.cospi(N, input, result);
    }

    @Test
    public void testcyl_bessel_i0f() {
        cudaMathFloat.cyl_bessel_i0(N, input, result);
    }

    @Test
    public void testcyl_bessel_i1f() {
        cudaMathFloat.cyl_bessel_i1(N, input, result);
    }

    @Test
    public void testerfcf() {
        cudaMathFloat.erfc(N, input, result);
    }

    @Test
    public void testerfcinvf() {
        cudaMathFloat.erfcinv(N, input, result);
    }

    @Test
    public void testerfcxf() {
        cudaMathFloat.erfcx(N, input, result);
    }

    @Test
    public void testerff() {
        cudaMathFloat.erf(N, input, result);
    }

    @Test
    public void testerfinvf() {
        cudaMathFloat.erfinv(N, input, result);
    }

    @Test
    public void testexp10f() {
        cudaMathFloat.exp10(N, input, result);
    }

    @Test
    public void testexp2f() {
        cudaMathFloat.exp2(N, input, result);
    }

    @Test
    public void testexpf() {
        cudaMathFloat.exp(N, input, result);
    }

    @Test
    public void testexpm1f() {
        cudaMathFloat.expm1(N, input, result);
    }

    @Test
    public void testfabsf() {
        cudaMathFloat.fabs(N, input, result);
    }

    @Test
    public void testfloorf() {
        cudaMathFloat.floor(N, input, result);
    }

    @Test
    public void testj0f() {
        cudaMathFloat.j0(N, input, result);
    }

    @Test
    public void testj1f() {
        cudaMathFloat.j1(N, input, result);
    }

    @Test
    public void testlgammaf() {
        cudaMathFloat.lgamma(N, input, result);
    }

    @Test
    public void testlog10f() {
        cudaMathFloat.log10(N, input, result);
    }

    @Test
    public void testlog1pf() {
        cudaMathFloat.log1p(N, input, result);
    }

    @Test
    public void testlog2f() {
        cudaMathFloat.log2(N, input, result);
    }

    @Test
    public void testlogbf() {
        cudaMathFloat.logb(N, input, result);
    }

    @Test
    public void testlogf() {
        cudaMathFloat.log(N, input, result);
    }

    @Test
    public void testnearbyintf() {
        cudaMathFloat.nearbyint(N, input, result);
    }

    @Test
    public void testnormcdff() {
        cudaMathFloat.normcdf(N, input, result);
    }

    @Test
    public void testnormcdfinvf() {
        cudaMathFloat.normcdfinv(N, input, result);
    }

    @Test
    public void testrcbrtf() {
        cudaMathFloat.rcbrt(N, input, result);
    }

    @Test
    public void testrintf() {
        cudaMathFloat.rint(N, input, result);
    }

    @Test
    public void testroundf() {
        cudaMathFloat.round(N, input, result);
    }

    @Test
    public void testrsqrtf() {
        cudaMathFloat.rsqrt(N, input, result);
    }

    @Test
    public void testsinf() {
        cudaMathFloat.sin(N, input, result);
    }

    @Test
    public void testsinhf() {
        cudaMathFloat.sinh(N, input, result);
    }

    @Test
    public void testsinpif() {
        cudaMathFloat.sinpi(N, input, result);
    }

    @Test
    public void testsqrtf() {
        cudaMathFloat.sqrt(N, input, result);
    }

    @Test
    public void testtanf() {
        cudaMathFloat.tan(N, input, result);
    }

    @Test
    public void testtanhf() {
        cudaMathFloat.tanh(N, input, result);
    }

    @Test
    public void testtgammaf() {
        cudaMathFloat.tgamma(N, input, result);
    }

    @Test
    public void testtruncf() {
        cudaMathFloat.trunc(N, input, result);
    }

    @Test
    public void testy0f() {
        cudaMathFloat.y0(N, input, result);
    }

    @Test
    public void testy1f() {
        cudaMathFloat.y1(N, input, result);
    }



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

        cudaMathFloat = new CudaMathFloat();

        float[] inputArray = new float[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = i;
        }

        input = new LongPointer(1);
        checkResult(cuMemAlloc(input, N * Float.BYTES));
        checkResult(cuMemcpyHtoD(input.get(), new FloatPointer(inputArray), N * Float.BYTES));

        result = new LongPointer(1);
        checkResult(cuMemAlloc(result, N * Float.BYTES));
    }

}
