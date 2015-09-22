package com.mosco.javacpp_cuda_math;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.Pointer;

import java.io.IOException;

public class CudaMathFloat extends AbstractCudaMath {
    public CudaMathFloat() throws IOException {
        super("float");
    }

    public void acos(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.acosf, n, result, x);
    }

    public void acosh(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.acoshf, n, result, x);
    }

    public void asin(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.asinf, n, result, x);
    }

    public void asinh(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.asinhf, n, result, x);
    }

    public void atan(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.atanf, n, result, x);
    }

    public void atanh(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.atanhf, n, result, x);
    }

    public void cbrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.cbrtf, n, result, x);
    }

    public void ceil(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.ceilf, n, result, x);
    }

    public void cos(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.cosf, n, result, x);
    }

    public void cosh(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.coshf, n, result, x);
    }

    public void cospi(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.cospif, n, result, x);
    }

    public void cyl_bessel_i0(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.cyl_bessel_i0f, n, result, x);
    }

    public void cyl_bessel_i1(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.cyl_bessel_i1f, n, result, x);
    }

    public void erfc(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.erfcf, n, result, x);
    }

    public void erfcinv(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.erfcinvf, n, result, x);
    }

    public void erfcx(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.erfcxf, n, result, x);
    }

    public void erf(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.erff, n, result, x);
    }

    public void erfinv(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.erfinvf, n, result, x);
    }

    public void exp10(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.exp10f, n, result, x);
    }

    public void exp2(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.exp2f, n, result, x);
    }

    public void exp(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.expf, n, result, x);
    }

    public void expm1(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.expm1f, n, result, x);
    }

    public void fabs(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.fabsf, n, result, x);
    }

    public void floor(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.floorf, n, result, x);
    }

    public void j0(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.j0f, n, result, x);
    }

    public void j1(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.j1f, n, result, x);
    }

    public void lgamma(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.lgammaf, n, result, x);
    }

    public void log10(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.log10f, n, result, x);
    }

    public void log1p(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.log1pf, n, result, x);
    }

    public void log2(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.log2f, n, result, x);
    }

    public void logb(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.logbf, n, result, x);
    }

    public void log(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.logf, n, result, x);
    }

    public void nearbyint(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.nearbyintf, n, result, x);
    }

    public void normcdf(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.normcdff, n, result, x);
    }

    public void normcdfinv(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.normcdfinvf, n, result, x);
    }

    public void rcbrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.rcbrtf, n, result, x);
    }

    public void rint(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.rintf, n, result, x);
    }

    public void round(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.roundf, n, result, x);
    }

    public void rsqrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.rsqrtf, n, result, x);
    }

    public void sin(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.sinf, n, result, x);
    }

    public void sinh(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.sinhf, n, result, x);
    }

    public void sinpi(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.sinpif, n, result, x);
    }

    public void sqrt(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.sqrtf, n, result, x);
    }

    public void tan(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.tanf, n, result, x);
    }

    public void tanh(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.tanhf, n, result, x);
    }

    public void tgamma(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.tgammaf, n, result, x);
    }

    public void trunc(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.truncf, n, result, x);
    }

    public void y0(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.y0f, n, result, x);
    }

    public void y1(int n, LongPointer x, LongPointer result) {
        call(FunctionsFloat.y1f, n, result, x);
    }

    public void atan2(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.atan2f, n, result, x, y);
    }

    public void copysign(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.copysignf, n, result, x, y);
    }

    public void fdim(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.fdimf, n, result, x, y);
    }

    public void fmax(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.fmaxf, n, result, x, y);
    }

    public void fmin(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.fminf, n, result, x, y);
    }

    public void fmod(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.fmodf, n, result, x, y);
    }

    public void nextafter(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.nextafterf, n, result, x, y);
    }

    public void pow(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.powf, n, result, x, y);
    }

    public void remainder(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.remainderf, n, result, x, y);
    }

    public void rhypot(int n, LongPointer x, LongPointer y, LongPointer result) {
        call(FunctionsFloat.rhypotf, n, result, x, y);
    }



    private void call(FunctionsFloat f, int n, Pointer... pointers) {
        Pointer[] all = new Pointer[pointers.length + 1];
        all[0] = new IntPointer(new int[]{n});
        for (int i = 0; i < pointers.length; i++) {
            all[i + 1] = pointers[i];
        }
        super.call(f.name(), n, all);
    }
}
