#!/usr/bin/env bash
nvcc -ptx src/main/resources/cuda_math_float.cu -m32 -o src/main/resources/cuda_math_float_32.ptx
nvcc -ptx src/main/resources/cuda_math_float.cu -m64 -o src/main/resources/cuda_math_float_64.ptx
nvcc -ptx src/main/resources/cuda_math_double.cu -m32 -o src/main/resources/cuda_math_double_32.ptx
nvcc -ptx src/main/resources/cuda_math_double.cu -m64 -o src/main/resources/cuda_math_double_64.ptx