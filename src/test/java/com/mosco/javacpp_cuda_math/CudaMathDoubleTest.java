package com.mosco.javacpp_cuda_math;

import static org.bytedeco.javacpp.cuda.*;

import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.cuda;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.*;

import static com.mosco.javacpp_cuda_math.AbstractCudaMath.checkResult;

public class CudaMathDoubleTest {
    private static final int N = 2000;
    private static CudaMathDouble cudaMathDouble;
    private static LongPointer input;
    private static LongPointer result;

    @Test
    public void testacos() {
        cudaMathDouble.acos(N, input, result);
    }

    @Test
    public void testacosh() {
        cudaMathDouble.acosh(N, input, result);
    }

    @Test
    public void testasin() {
        cudaMathDouble.asin(N, input, result);
    }

    @Test
    public void testasinh() {
        cudaMathDouble.asinh(N, input, result);
    }

    @Test
    public void testatan() {
        cudaMathDouble.atan(N, input, result);
    }

    @Test
    public void testatanh() {
        cudaMathDouble.atanh(N, input, result);
    }

    @Test
    public void testcbrt() {
        cudaMathDouble.cbrt(N, input, result);
    }

    @Test
    public void testceil() {
        cudaMathDouble.ceil(N, input, result);
    }

    @Test
    public void testcos() {
        cudaMathDouble.cos(N, input, result);
    }

    @Test
    public void testcosh() {
        cudaMathDouble.cosh(N, input, result);
    }

    @Test
    public void testcospi() {
        cudaMathDouble.cospi(N, input, result);
    }

    @Test
    public void testcyl_bessel_i0() {
        cudaMathDouble.cyl_bessel_i0(N, input, result);
    }

    @Test
    public void testcyl_bessel_i1() {
        cudaMathDouble.cyl_bessel_i1(N, input, result);
    }

    @Test
    public void testerf() {
        cudaMathDouble.erf(N, input, result);
    }

    @Test
    public void testerfc() {
        cudaMathDouble.erfc(N, input, result);
    }

    @Test
    public void testerfcinv() {
        cudaMathDouble.erfcinv(N, input, result);
    }

    @Test
    public void testerfcx() {
        cudaMathDouble.erfcx(N, input, result);
    }

    @Test
    public void testerfinv() {
        cudaMathDouble.erfinv(N, input, result);
    }

    @Test
    public void testexp() {
        cudaMathDouble.exp(N, input, result);
    }

    @Test
    public void testexp10() {
        cudaMathDouble.exp10(N, input, result);
    }

    @Test
    public void testexp2() {
        cudaMathDouble.exp2(N, input, result);
    }

    @Test
    public void testexpm1() {
        cudaMathDouble.expm1(N, input, result);
    }

    @Test
    public void testfabs() {
        cudaMathDouble.fabs(N, input, result);
    }

    @Test
    public void testfloor() {
        cudaMathDouble.floor(N, input, result);
    }

    @Test
    public void testj0() {
        cudaMathDouble.j0(N, input, result);
    }

    @Test
    public void testj1() {
        cudaMathDouble.j1(N, input, result);
    }

    @Test
    public void testlgamma() {
        cudaMathDouble.lgamma(N, input, result);
    }

    @Test
    public void testlog() {
        cudaMathDouble.log(N, input, result);
    }

    @Test
    public void testlog10() {
        cudaMathDouble.log10(N, input, result);
    }

    @Test
    public void testlog1p() {
        cudaMathDouble.log1p(N, input, result);
    }

    @Test
    public void testlog2() {
        cudaMathDouble.log2(N, input, result);
    }

    @Test
    public void testlogb() {
        cudaMathDouble.logb(N, input, result);
    }

    @Test
    public void testnearbyint() {
        cudaMathDouble.nearbyint(N, input, result);
    }

    @Test
    public void testnormcdf() {
        cudaMathDouble.normcdf(N, input, result);
    }

    @Test
    public void testnormcdfinv() {
        cudaMathDouble.normcdfinv(N, input, result);
    }

    @Test
    public void testrcbrt() {
        cudaMathDouble.rcbrt(N, input, result);
    }

    @Test
    public void testrint() {
        cudaMathDouble.rint(N, input, result);
    }

    @Test
    public void testround() {
        cudaMathDouble.round(N, input, result);
    }

    @Test
    public void testrsqrt() {
        cudaMathDouble.rsqrt(N, input, result);
    }

    @Test
    public void testsin() {
        cudaMathDouble.sin(N, input, result);
    }

    @Test
    public void testsinh() {
        cudaMathDouble.sinh(N, input, result);
    }

    @Test
    public void testsinpi() {
        cudaMathDouble.sinpi(N, input, result);
    }

    @Test
    public void testsqrt() {
        cudaMathDouble.sqrt(N, input, result);
    }

    @Test
    public void testtan() {
        cudaMathDouble.tan(N, input, result);
    }

    @Test
    public void testtanh() {
        cudaMathDouble.tanh(N, input, result);
    }

    @Test
    public void testtgamma() {
        cudaMathDouble.tgamma(N, input, result);
    }

    @Test
    public void testtrunc() {
        cudaMathDouble.trunc(N, input, result);
    }

    @Test
    public void testy0() {
        cudaMathDouble.y0(N, input, result);
    }

    @Test
    public void testy1() {
        cudaMathDouble.y1(N, input, result);
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

        double[] inputArray = new double[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = i;
        }

        input = new LongPointer(1);
        checkResult(cuMemAlloc(input, N * Double.BYTES));
        checkResult(cuMemcpyHtoD(input.get(), new DoublePointer(inputArray), N * Double.BYTES));

        result = new LongPointer(1);
        checkResult(cuMemAlloc(result, N * Double.BYTES));
    }

}
