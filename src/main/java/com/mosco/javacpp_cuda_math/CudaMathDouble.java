package com.mosco.javacpp_cuda_math;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.LongPointer;

import java.io.IOException;

public class CudaMathDouble extends AbstractCudaMath {
    public CudaMathDouble() throws IOException {
        super("double");
    }

    public void acos(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.acos, n, new IntPointer(new int[]{n}), result, x);
    }

    public void acosh(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.acosh, n, new IntPointer(new int[]{n}), result, x);
    }

    public void asin(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.asin, n, new IntPointer(new int[]{n}), result, x);
    }

    public void asinh(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.asinh, n, new IntPointer(new int[]{n}), result, x);
    }

    public void atan(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.atan, n, new IntPointer(new int[]{n}), result, x);
    }

    public void atanh(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.atanh, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cbrt(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.cbrt, n, new IntPointer(new int[]{n}), result, x);
    }

    public void ceil(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.ceil, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cos(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.cos, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cosh(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.cosh, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cospi(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.cospi, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cyl_bessel_i0(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.cyl_bessel_i0, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cyl_bessel_i1(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.cyl_bessel_i1, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erf(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.erf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfc(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.erfc, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfcinv(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.erfcinv, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfcx(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.erfcx, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfinv(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.erfinv, n, new IntPointer(new int[]{n}), result, x);
    }

    public void exp(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.exp, n, new IntPointer(new int[]{n}), result, x);
    }

    public void exp10(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.exp10, n, new IntPointer(new int[]{n}), result, x);
    }

    public void exp2(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.exp2, n, new IntPointer(new int[]{n}), result, x);
    }

    public void expm1(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.expm1, n, new IntPointer(new int[]{n}), result, x);
    }

    public void fabs(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.fabs, n, new IntPointer(new int[]{n}), result, x);
    }

    public void floor(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.floor, n, new IntPointer(new int[]{n}), result, x);
    }

    public void j0(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.j0, n, new IntPointer(new int[]{n}), result, x);
    }

    public void j1(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.j1, n, new IntPointer(new int[]{n}), result, x);
    }

    public void lgamma(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.lgamma, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.log, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log10(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.log10, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log1p(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.log1p, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log2(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.log2, n, new IntPointer(new int[]{n}), result, x);
    }

    public void logb(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.logb, n, new IntPointer(new int[]{n}), result, x);
    }

    public void nearbyint(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.nearbyint, n, new IntPointer(new int[]{n}), result, x);
    }

    public void normcdf(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.normcdf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void normcdfinv(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.normcdfinv, n, new IntPointer(new int[]{n}), result, x);
    }

    public void rcbrt(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.rcbrt, n, new IntPointer(new int[]{n}), result, x);
    }

    public void rint(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.rint, n, new IntPointer(new int[]{n}), result, x);
    }

    public void round(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.round, n, new IntPointer(new int[]{n}), result, x);
    }

    public void rsqrt(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.rsqrt, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sin(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.sin, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sinh(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.sinh, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sinpi(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.sinpi, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sqrt(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.sqrt, n, new IntPointer(new int[]{n}), result, x);
    }

    public void tan(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.tan, n, new IntPointer(new int[]{n}), result, x);
    }

    public void tanh(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.tanh, n, new IntPointer(new int[]{n}), result, x);
    }

    public void tgamma(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.tgamma, n, new IntPointer(new int[]{n}), result, x);
    }

    public void trunc(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.trunc, n, new IntPointer(new int[]{n}), result, x);
    }

    public void y0(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.y0, n, new IntPointer(new int[]{n}), result, x);
    }

    public void y1(int n, LongPointer x, LongPointer result) {
        call(OneParamDouble.y1, n, new IntPointer(new int[]{n}), result, x);
    }



    private void call(OneParamDouble f, int n, IntPointer intPointer, LongPointer result, LongPointer x) {
        super.call(f.name(), n, intPointer, result, x);
    }
}
