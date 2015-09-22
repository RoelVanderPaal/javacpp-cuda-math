extern "C"
__global__ void math_acosf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = acosf(x[id]);
    }
}

extern "C"
__global__ void math_acoshf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = acoshf(x[id]);
    }
}

extern "C"
__global__ void math_asinf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = asinf(x[id]);
    }
}

extern "C"
__global__ void math_asinhf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = asinhf(x[id]);
    }
}

extern "C"
__global__ void math_atanf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = atanf(x[id]);
    }
}

extern "C"
__global__ void math_atanhf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = atanhf(x[id]);
    }
}

extern "C"
__global__ void math_cbrtf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cbrtf(x[id]);
    }
}

extern "C"
__global__ void math_ceilf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = ceilf(x[id]);
    }
}

extern "C"
__global__ void math_cosf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cosf(x[id]);
    }
}

extern "C"
__global__ void math_coshf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = coshf(x[id]);
    }
}

extern "C"
__global__ void math_cospif(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cospif(x[id]);
    }
}

extern "C"
__global__ void math_cyl_bessel_i0f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cyl_bessel_i0f(x[id]);
    }
}

extern "C"
__global__ void math_cyl_bessel_i1f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = cyl_bessel_i1f(x[id]);
    }
}

extern "C"
__global__ void math_erfcf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfcf(x[id]);
    }
}

extern "C"
__global__ void math_erfcinvf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfcinvf(x[id]);
    }
}

extern "C"
__global__ void math_erfcxf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfcxf(x[id]);
    }
}

extern "C"
__global__ void math_erff(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erff(x[id]);
    }
}

extern "C"
__global__ void math_erfinvf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = erfinvf(x[id]);
    }
}

extern "C"
__global__ void math_exp10f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = exp10f(x[id]);
    }
}

extern "C"
__global__ void math_exp2f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = exp2f(x[id]);
    }
}

extern "C"
__global__ void math_expf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = expf(x[id]);
    }
}

extern "C"
__global__ void math_expm1f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = expm1f(x[id]);
    }
}

extern "C"
__global__ void math_fabsf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = fabsf(x[id]);
    }
}

extern "C"
__global__ void math_floorf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = floorf(x[id]);
    }
}

extern "C"
__global__ void math_j0f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = j0f(x[id]);
    }
}

extern "C"
__global__ void math_j1f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = j1f(x[id]);
    }
}

extern "C"
__global__ void math_lgammaf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = lgammaf(x[id]);
    }
}

extern "C"
__global__ void math_log10f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = log10f(x[id]);
    }
}

extern "C"
__global__ void math_log1pf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = log1pf(x[id]);
    }
}

extern "C"
__global__ void math_log2f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = log2f(x[id]);
    }
}

extern "C"
__global__ void math_logbf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = logbf(x[id]);
    }
}

extern "C"
__global__ void math_logf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = logf(x[id]);
    }
}

extern "C"
__global__ void math_nearbyintf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = nearbyintf(x[id]);
    }
}

extern "C"
__global__ void math_normcdff(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = normcdff(x[id]);
    }
}

extern "C"
__global__ void math_normcdfinvf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = normcdfinvf(x[id]);
    }
}

extern "C"
__global__ void math_rcbrtf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = rcbrtf(x[id]);
    }
}

extern "C"
__global__ void math_rintf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = rintf(x[id]);
    }
}

extern "C"
__global__ void math_roundf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = roundf(x[id]);
    }
}

extern "C"
__global__ void math_rsqrtf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = rsqrtf(x[id]);
    }
}

extern "C"
__global__ void math_sinf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sinf(x[id]);
    }
}

extern "C"
__global__ void math_sinhf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sinhf(x[id]);
    }
}

extern "C"
__global__ void math_sinpif(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sinpif(x[id]);
    }
}

extern "C"
__global__ void math_sqrtf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = sqrtf(x[id]);
    }
}

extern "C"
__global__ void math_tanf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = tanf(x[id]);
    }
}

extern "C"
__global__ void math_tanhf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = tanhf(x[id]);
    }
}

extern "C"
__global__ void math_tgammaf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = tgammaf(x[id]);
    }
}

extern "C"
__global__ void math_truncf(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = truncf(x[id]);
    }
}

extern "C"
__global__ void math_y0f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = y0f(x[id]);
    }
}

extern "C"
__global__ void math_y1f(size_t n, float *result, float  *x) {
    int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < n)
    {
        result[id] = y1f(x[id]);
    }
}

