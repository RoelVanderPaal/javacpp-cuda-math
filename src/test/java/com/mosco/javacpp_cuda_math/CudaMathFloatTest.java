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
    private static LongPointer x, y;
    private static LongPointer result;

    @Test
    public void testacosf() {
        cudaMathFloat.acos(N, x, result);
    }

    @Test
    public void testacoshf() {
        cudaMathFloat.acosh(N, x, result);
    }

    @Test
    public void testasinf() {
        cudaMathFloat.asin(N, x, result);
    }

    @Test
    public void testasinhf() {
        cudaMathFloat.asinh(N, x, result);
    }

    @Test
    public void testatanf() {
        cudaMathFloat.atan(N, x, result);
    }

    @Test
    public void testatanhf() {
        cudaMathFloat.atanh(N, x, result);
    }

    @Test
    public void testcbrtf() {
        cudaMathFloat.cbrt(N, x, result);
    }

    @Test
    public void testceilf() {
        cudaMathFloat.ceil(N, x, result);
    }

    @Test
    public void testcosf() {
        cudaMathFloat.cos(N, x, result);
    }

    @Test
    public void testcoshf() {
        cudaMathFloat.cosh(N, x, result);
    }

    @Test
    public void testcospif() {
        cudaMathFloat.cospi(N, x, result);
    }

    @Test
    public void testcyl_bessel_i0f() {
        cudaMathFloat.cyl_bessel_i0(N, x, result);
    }

    @Test
    public void testcyl_bessel_i1f() {
        cudaMathFloat.cyl_bessel_i1(N, x, result);
    }

    @Test
    public void testerfcf() {
        cudaMathFloat.erfc(N, x, result);
    }

    @Test
    public void testerfcinvf() {
        cudaMathFloat.erfcinv(N, x, result);
    }

    @Test
    public void testerfcxf() {
        cudaMathFloat.erfcx(N, x, result);
    }

    @Test
    public void testerff() {
        cudaMathFloat.erf(N, x, result);
    }

    @Test
    public void testerfinvf() {
        cudaMathFloat.erfinv(N, x, result);
    }

    @Test
    public void testexp10f() {
        cudaMathFloat.exp10(N, x, result);
    }

    @Test
    public void testexp2f() {
        cudaMathFloat.exp2(N, x, result);
    }

    @Test
    public void testexpf() {
        cudaMathFloat.exp(N, x, result);
    }

    @Test
    public void testexpm1f() {
        cudaMathFloat.expm1(N, x, result);
    }

    @Test
    public void testfabsf() {
        cudaMathFloat.fabs(N, x, result);
    }

    @Test
    public void testfloorf() {
        cudaMathFloat.floor(N, x, result);
    }

    @Test
    public void testj0f() {
        cudaMathFloat.j0(N, x, result);
    }

    @Test
    public void testj1f() {
        cudaMathFloat.j1(N, x, result);
    }

    @Test
    public void testlgammaf() {
        cudaMathFloat.lgamma(N, x, result);
    }

    @Test
    public void testlog10f() {
        cudaMathFloat.log10(N, x, result);
    }

    @Test
    public void testlog1pf() {
        cudaMathFloat.log1p(N, x, result);
    }

    @Test
    public void testlog2f() {
        cudaMathFloat.log2(N, x, result);
    }

    @Test
    public void testlogbf() {
        cudaMathFloat.logb(N, x, result);
    }

    @Test
    public void testlogf() {
        cudaMathFloat.log(N, x, result);
    }

    @Test
    public void testnearbyintf() {
        cudaMathFloat.nearbyint(N, x, result);
    }

    @Test
    public void testnormcdff() {
        cudaMathFloat.normcdf(N, x, result);
    }

    @Test
    public void testnormcdfinvf() {
        cudaMathFloat.normcdfinv(N, x, result);
    }

    @Test
    public void testrcbrtf() {
        cudaMathFloat.rcbrt(N, x, result);
    }

    @Test
    public void testrintf() {
        cudaMathFloat.rint(N, x, result);
    }

    @Test
    public void testroundf() {
        cudaMathFloat.round(N, x, result);
    }

    @Test
    public void testrsqrtf() {
        cudaMathFloat.rsqrt(N, x, result);
    }

    @Test
    public void testsinf() {
        cudaMathFloat.sin(N, x, result);
    }

    @Test
    public void testsinhf() {
        cudaMathFloat.sinh(N, x, result);
    }

    @Test
    public void testsinpif() {
        cudaMathFloat.sinpi(N, x, result);
    }

    @Test
    public void testsqrtf() {
        cudaMathFloat.sqrt(N, x, result);
    }

    @Test
    public void testtanf() {
        cudaMathFloat.tan(N, x, result);
    }

    @Test
    public void testtanhf() {
        cudaMathFloat.tanh(N, x, result);
    }

    @Test
    public void testtgammaf() {
        cudaMathFloat.tgamma(N, x, result);
    }

    @Test
    public void testtruncf() {
        cudaMathFloat.trunc(N, x, result);
    }

    @Test
    public void testy0f() {
        cudaMathFloat.y0(N, x, result);
    }

    @Test
    public void testy1f() {
        cudaMathFloat.y1(N, x, result);
    }

    @Test
    public void testatan2f() {
        cudaMathFloat.atan2(N, x, y, result);
    }

    @Test
    public void testcopysignf() {
        cudaMathFloat.copysign(N, x, y, result);
    }

    @Test
    public void testfdimf() {
        cudaMathFloat.fdim(N, x, y, result);
    }

    @Test
    public void testfmaxf() {
        cudaMathFloat.fmax(N, x, y, result);
    }

    @Test
    public void testfminf() {
        cudaMathFloat.fmin(N, x, y, result);
    }

    @Test
    public void testfmodf() {
        cudaMathFloat.fmod(N, x, y, result);
    }

    @Test
    public void testnextafterf() {
        cudaMathFloat.nextafter(N, x, y, result);
    }

    @Test
    public void testpowf() {
        cudaMathFloat.pow(N, x, y, result);
    }

    @Test
    public void testremainderf() {
        cudaMathFloat.remainder(N, x, y, result);
    }

    @Test
    public void testrhypotf() {
        cudaMathFloat.rhypot(N, x, y, result);
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

        float[] xArray = new float[N];
        for (int i = 0; i < N; i++) {
            xArray[i] = i;
        }

        x = new LongPointer(1);
        checkResult(cuMemAlloc(x, N * Float.BYTES));
        checkResult(cuMemcpyHtoD(x.get(), new FloatPointer(xArray), N * Float.BYTES));

        float[] yArray = new float[N];
        for (int i = 0; i < N; i++) {
            yArray[i] = i;
        }

        y = new LongPointer(1);
        checkResult(cuMemAlloc(y, N * Float.BYTES));
        checkResult(cuMemcpyHtoD(y.get(), new FloatPointer(yArray), N * Float.BYTES));

        result = new LongPointer(1);
        checkResult(cuMemAlloc(result, N * Float.BYTES));
    }

}
