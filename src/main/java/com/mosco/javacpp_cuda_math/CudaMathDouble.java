package com.mosco.javacpp_cuda_math;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.Pointer;

import java.io.IOException;

public class CudaMathDouble extends AbstractCudaMath {
    public CudaMathDouble() throws IOException {
        super("double");
    }

    public void acos(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.acos, n, result, x);
    }

    public void acosh(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.acosh, n, result, x);
    }

    public void asin(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.asin, n, result, x);
    }

    public void asinh(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.asinh, n, result, x);
    }

    public void atan(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.atan, n, result, x);
    }

    public void atanh(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.atanh, n, result, x);
    }

    public void cbrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.cbrt, n, result, x);
    }

    public void ceil(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.ceil, n, result, x);
    }

    public void cos(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.cos, n, result, x);
    }

    public void cosh(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.cosh, n, result, x);
    }

    public void cospi(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.cospi, n, result, x);
    }

    public void cyl_bessel_i0(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.cyl_bessel_i0, n, result, x);
    }

    public void cyl_bessel_i1(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.cyl_bessel_i1, n, result, x);
    }

    public void erf(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.erf, n, result, x);
    }

    public void erfc(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.erfc, n, result, x);
    }

    public void erfcinv(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.erfcinv, n, result, x);
    }

    public void erfcx(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.erfcx, n, result, x);
    }

    public void erfinv(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.erfinv, n, result, x);
    }

    public void exp(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.exp, n, result, x);
    }

    public void exp10(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.exp10, n, result, x);
    }

    public void exp2(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.exp2, n, result, x);
    }

    public void expm1(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.expm1, n, result, x);
    }

    public void fabs(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.fabs, n, result, x);
    }

    public void floor(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.floor, n, result, x);
    }

    public void j0(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.j0, n, result, x);
    }

    public void j1(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.j1, n, result, x);
    }

    public void lgamma(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.lgamma, n, result, x);
    }

    public void log(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.log, n, result, x);
    }

    public void log10(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.log10, n, result, x);
    }

    public void log1p(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.log1p, n, result, x);
    }

    public void log2(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.log2, n, result, x);
    }

    public void logb(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.logb, n, result, x);
    }

    public void nearbyint(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.nearbyint, n, result, x);
    }

    public void normcdf(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.normcdf, n, result, x);
    }

    public void normcdfinv(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.normcdfinv, n, result, x);
    }

    public void rcbrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.rcbrt, n, result, x);
    }

    public void rint(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.rint, n, result, x);
    }

    public void round(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.round, n, result, x);
    }

    public void rsqrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.rsqrt, n, result, x);
    }

    public void sin(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.sin, n, result, x);
    }

    public void sinh(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.sinh, n, result, x);
    }

    public void sinpi(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.sinpi, n, result, x);
    }

    public void sqrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.sqrt, n, result, x);
    }

    public void tan(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.tan, n, result, x);
    }

    public void tanh(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.tanh, n, result, x);
    }

    public void tgamma(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.tgamma, n, result, x);
    }

    public void trunc(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.trunc, n, result, x);
    }

    public void y0(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.y0, n, result, x);
    }

    public void y1(int n, LongPointer x, LongPointer result) {
        call(FunctionsDouble.y1, n, result, x);
    }

    public void atan2(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.atan2, n, result, x, y);
    }

    public void copysign(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.copysign, n, result, x, y);
    }

    public void fdim(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.fdim, n, result, x, y);
    }

    public void fmin(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.fmin, n, result, x, y);
    }

    public void fmod(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.fmod, n, result, x, y);
    }

    public void nextafter(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.nextafter, n, result, x, y);
    }

    public void pow(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.pow, n, result, x, y);
    }

    public void remainder(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.remainder, n, result, x, y);
    }

    public void rhypot(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsDouble.rhypot, n, result, x, y);
    }



    private void call(FunctionsDouble f, int n, Pointer... pointers) {
        Pointer[] all = new Pointer[pointers.length + 1];
        all[0] = new IntPointer(new int[]{n});
        for (int i = 0; i < pointers.length; i++) {
            all[i + 1] = pointers[i];
        }
        super.call(f.name(), n, all);
    }
}
