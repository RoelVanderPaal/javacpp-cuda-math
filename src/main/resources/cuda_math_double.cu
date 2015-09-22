extern "C"
__global__ void math_acos(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = acos(x[id]);
    }
}

extern "C"
__global__ void math_acosh(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = acosh(x[id]);
    }
}

extern "C"
__global__ void math_asin(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = asin(x[id]);
    }
}

extern "C"
__global__ void math_asinh(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = asinh(x[id]);
    }
}

extern "C"
__global__ void math_atan(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = atan(x[id]);
    }
}

extern "C"
__global__ void math_atanh(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = atanh(x[id]);
    }
}

extern "C"
__global__ void math_cbrt(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cbrt(x[id]);
    }
}

extern "C"
__global__ void math_ceil(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = ceil(x[id]);
    }
}

extern "C"
__global__ void math_cos(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cos(x[id]);
    }
}

extern "C"
__global__ void math_cosh(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cosh(x[id]);
    }
}

extern "C"
__global__ void math_cospi(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cospi(x[id]);
    }
}

extern "C"
__global__ void math_cyl_bessel_i0(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cyl_bessel_i0(x[id]);
    }
}

extern "C"
__global__ void math_cyl_bessel_i1(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cyl_bessel_i1(x[id]);
    }
}

extern "C"
__global__ void math_erf(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erf(x[id]);
    }
}

extern "C"
__global__ void math_erfc(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfc(x[id]);
    }
}

extern "C"
__global__ void math_erfcinv(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfcinv(x[id]);
    }
}

extern "C"
__global__ void math_erfcx(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfcx(x[id]);
    }
}

extern "C"
__global__ void math_erfinv(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfinv(x[id]);
    }
}

extern "C"
__global__ void math_exp(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = exp(x[id]);
    }
}

extern "C"
__global__ void math_exp10(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = exp10(x[id]);
    }
}

extern "C"
__global__ void math_exp2(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = exp2(x[id]);
    }
}

extern "C"
__global__ void math_expm1(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = expm1(x[id]);
    }
}

extern "C"
__global__ void math_fabs(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = fabs(x[id]);
    }
}

extern "C"
__global__ void math_floor(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = floor(x[id]);
    }
}

extern "C"
__global__ void math_j0(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = j0(x[id]);
    }
}

extern "C"
__global__ void math_j1(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = j1(x[id]);
    }
}

extern "C"
__global__ void math_lgamma(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = lgamma(x[id]);
    }
}

extern "C"
__global__ void math_log(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = log(x[id]);
    }
}

extern "C"
__global__ void math_log10(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = log10(x[id]);
    }
}

extern "C"
__global__ void math_log1p(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = log1p(x[id]);
    }
}

extern "C"
__global__ void math_log2(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = log2(x[id]);
    }
}

extern "C"
__global__ void math_logb(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = logb(x[id]);
    }
}

extern "C"
__global__ void math_nearbyint(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = nearbyint(x[id]);
    }
}

extern "C"
__global__ void math_normcdf(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = normcdf(x[id]);
    }
}

extern "C"
__global__ void math_normcdfinv(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = normcdfinv(x[id]);
    }
}

extern "C"
__global__ void math_rcbrt(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = rcbrt(x[id]);
    }
}

extern "C"
__global__ void math_rint(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = rint(x[id]);
    }
}

extern "C"
__global__ void math_round(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = round(x[id]);
    }
}

extern "C"
__global__ void math_rsqrt(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = rsqrt(x[id]);
    }
}

extern "C"
__global__ void math_sin(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sin(x[id]);
    }
}

extern "C"
__global__ void math_sinh(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sinh(x[id]);
    }
}

extern "C"
__global__ void math_sinpi(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sinpi(x[id]);
    }
}

extern "C"
__global__ void math_sqrt(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sqrt(x[id]);
    }
}

extern "C"
__global__ void math_tan(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = tan(x[id]);
    }
}

extern "C"
__global__ void math_tanh(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = tanh(x[id]);
    }
}

extern "C"
__global__ void math_tgamma(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = tgamma(x[id]);
    }
}

extern "C"
__global__ void math_trunc(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = trunc(x[id]);
    }
}

extern "C"
__global__ void math_y0(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = y0(x[id]);
    }
}

extern "C"
__global__ void math_y1(size_t n, double *result, double  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = y1(x[id]);
    }
}

