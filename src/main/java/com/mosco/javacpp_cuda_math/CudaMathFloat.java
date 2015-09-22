package com.mosco.javacpp_cuda_math;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.LongPointer;

import java.io.IOException;

public class CudaMathFloat extends AbstractCudaMath {
    public CudaMathFloat() throws IOException {
        super("float");
    }

    public void acos(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.acosf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void acosh(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.acoshf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void asin(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.asinf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void asinh(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.asinhf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void atan(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.atanf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void atanh(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.atanhf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cbrt(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.cbrtf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void ceil(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.ceilf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cos(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.cosf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cosh(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.coshf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cospi(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.cospif, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cyl_bessel_i0(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.cyl_bessel_i0f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void cyl_bessel_i1(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.cyl_bessel_i1f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfc(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.erfcf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfcinv(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.erfcinvf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfcx(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.erfcxf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erf(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.erff, n, new IntPointer(new int[]{n}), result, x);
    }

    public void erfinv(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.erfinvf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void exp10(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.exp10f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void exp2(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.exp2f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void exp(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.expf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void expm1(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.expm1f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void fabs(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.fabsf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void floor(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.floorf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void j0(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.j0f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void j1(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.j1f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void lgamma(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.lgammaf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log10(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.log10f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log1p(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.log1pf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log2(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.log2f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void logb(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.logbf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void log(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.logf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void nearbyint(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.nearbyintf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void normcdf(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.normcdff, n, new IntPointer(new int[]{n}), result, x);
    }

    public void normcdfinv(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.normcdfinvf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void rcbrt(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.rcbrtf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void rint(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.rintf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void round(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.roundf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void rsqrt(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.rsqrtf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sin(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.sinf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sinh(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.sinhf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sinpi(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.sinpif, n, new IntPointer(new int[]{n}), result, x);
    }

    public void sqrt(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.sqrtf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void tan(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.tanf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void tanh(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.tanhf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void tgamma(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.tgammaf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void trunc(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.truncf, n, new IntPointer(new int[]{n}), result, x);
    }

    public void y0(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.y0f, n, new IntPointer(new int[]{n}), result, x);
    }

    public void y1(int n, LongPointer x, LongPointer result) {
        call(OneParamFloat.y1f, n, new IntPointer(new int[]{n}), result, x);
    }



    private void call(OneParamFloat f, int n, IntPointer intPointer, LongPointer result, LongPointer x) {
        super.call(f.name(), n, intPointer, result, x);
    }
}
