package com.mosco.javacpp_cuda_math;

import static org.bytedeco.javacpp.cuda.*;

import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.LongPointer;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.*;

import static com.mosco.javacpp_cuda_math.AbstractCudaMath.checkResult;

public class CudaMathDoubleTest {
    private static final int N = 2000;
    private static CudaMathDouble cudaMathDouble;
    private static LongPointer x, y;
    private static LongPointer result;

    @Test
    public void testacos() {
        cudaMathDouble.acos(N, x, result);
    }

    @Test
    public void testacosh() {
        cudaMathDouble.acosh(N, x, result);
    }

    @Test
    public void testasin() {
        cudaMathDouble.asin(N, x, result);
    }

    @Test
    public void testasinh() {
        cudaMathDouble.asinh(N, x, result);
    }

    @Test
    public void testatan() {
        cudaMathDouble.atan(N, x, result);
    }

    @Test
    public void testatanh() {
        cudaMathDouble.atanh(N, x, result);
    }

    @Test
    public void testcbrt() {
        cudaMathDouble.cbrt(N, x, result);
    }

    @Test
    public void testceil() {
        cudaMathDouble.ceil(N, x, result);
    }

    @Test
    public void testcos() {
        cudaMathDouble.cos(N, x, result);
    }

    @Test
    public void testcosh() {
        cudaMathDouble.cosh(N, x, result);
    }

    @Test
    public void testcospi() {
        cudaMathDouble.cospi(N, x, result);
    }

    @Test
    public void testcyl_bessel_i0() {
        cudaMathDouble.cyl_bessel_i0(N, x, result);
    }

    @Test
    public void testcyl_bessel_i1() {
        cudaMathDouble.cyl_bessel_i1(N, x, result);
    }

    @Test
    public void testerf() {
        cudaMathDouble.erf(N, x, result);
    }

    @Test
    public void testerfc() {
        cudaMathDouble.erfc(N, x, result);
    }

    @Test
    public void testerfcinv() {
        cudaMathDouble.erfcinv(N, x, result);
    }

    @Test
    public void testerfcx() {
        cudaMathDouble.erfcx(N, x, result);
    }

    @Test
    public void testerfinv() {
        cudaMathDouble.erfinv(N, x, result);
    }

    @Test
    public void testexp() {
        cudaMathDouble.exp(N, x, result);
    }

    @Test
    public void testexp10() {
        cudaMathDouble.exp10(N, x, result);
    }

    @Test
    public void testexp2() {
        cudaMathDouble.exp2(N, x, result);
    }

    @Test
    public void testexpm1() {
        cudaMathDouble.expm1(N, x, result);
    }

    @Test
    public void testfabs() {
        cudaMathDouble.fabs(N, x, result);
    }

    @Test
    public void testfloor() {
        cudaMathDouble.floor(N, x, result);
    }

    @Test
    public void testj0() {
        cudaMathDouble.j0(N, x, result);
    }

    @Test
    public void testj1() {
        cudaMathDouble.j1(N, x, result);
    }

    @Test
    public void testlgamma() {
        cudaMathDouble.lgamma(N, x, result);
    }

    @Test
    public void testlog() {
        cudaMathDouble.log(N, x, result);
    }

    @Test
    public void testlog10() {
        cudaMathDouble.log10(N, x, result);
    }

    @Test
    public void testlog1p() {
        cudaMathDouble.log1p(N, x, result);
    }

    @Test
    public void testlog2() {
        cudaMathDouble.log2(N, x, result);
    }

    @Test
    public void testlogb() {
        cudaMathDouble.logb(N, x, result);
    }

    @Test
    public void testnearbyint() {
        cudaMathDouble.nearbyint(N, x, result);
    }

    @Test
    public void testnormcdf() {
        cudaMathDouble.normcdf(N, x, result);
    }

    @Test
    public void testnormcdfinv() {
        cudaMathDouble.normcdfinv(N, x, result);
    }

    @Test
    public void testrcbrt() {
        cudaMathDouble.rcbrt(N, x, result);
    }

    @Test
    public void testrint() {
        cudaMathDouble.rint(N, x, result);
    }

    @Test
    public void testround() {
        cudaMathDouble.round(N, x, result);
    }

    @Test
    public void testrsqrt() {
        cudaMathDouble.rsqrt(N, x, result);
    }

    @Test
    public void testsin() {
        cudaMathDouble.sin(N, x, result);
    }

    @Test
    public void testsinh() {
        cudaMathDouble.sinh(N, x, result);
    }

    @Test
    public void testsinpi() {
        cudaMathDouble.sinpi(N, x, result);
    }

    @Test
    public void testsqrt() {
        cudaMathDouble.sqrt(N, x, result);
    }

    @Test
    public void testtan() {
        cudaMathDouble.tan(N, x, result);
    }

    @Test
    public void testtanh() {
        cudaMathDouble.tanh(N, x, result);
    }

    @Test
    public void testtgamma() {
        cudaMathDouble.tgamma(N, x, result);
    }

    @Test
    public void testtrunc() {
        cudaMathDouble.trunc(N, x, result);
    }

    @Test
    public void testy0() {
        cudaMathDouble.y0(N, x, result);
    }

    @Test
    public void testy1() {
        cudaMathDouble.y1(N, x, result);
    }

    @Test
    public void testatan2() {
        cudaMathDouble.atan2(N, x, y, result);
    }

    @Test
    public void testcopysign() {
        cudaMathDouble.copysign(N, x, y, result);
    }

    @Test
    public void testfdim() {
        cudaMathDouble.fdim(N, x, y, result);
    }

    @Test
    public void testfmin() {
        cudaMathDouble.fmin(N, x, y, result);
    }

    @Test
    public void testfmod() {
        cudaMathDouble.fmod(N, x, y, result);
    }

    @Test
    public void testnextafter() {
        cudaMathDouble.nextafter(N, x, y, result);
    }

    @Test
    public void testpow() {
        cudaMathDouble.pow(N, x, y, result);
    }

    @Test
    public void testremainder() {
        cudaMathDouble.remainder(N, x, y, result);
    }

    @Test
    public void testrhypot() {
        cudaMathDouble.rhypot(N, x, y, result);
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

        cudaMathDouble = new CudaMathDouble();

        double[] xArray = new double[N];
        for (int i = 0; i < N; i++) {
            xArray[i] = i;
        }

        x = new LongPointer(1);
        checkResult(cuMemAlloc(x, N * Double.BYTES));
        checkResult(cuMemcpyHtoD(x.get(), new DoublePointer(xArray), N * Double.BYTES));

        double[] yArray = new double[N];
        for (int i = 0; i < N; i++) {
            yArray[i] = i;
        }

        y = new LongPointer(1);
        checkResult(cuMemAlloc(y, N * Double.BYTES));
        checkResult(cuMemcpyHtoD(y.get(), new DoublePointer(yArray), N * Double.BYTES));

        result = new LongPointer(1);
        checkResult(cuMemAlloc(result, N * Double.BYTES));
    }

}
