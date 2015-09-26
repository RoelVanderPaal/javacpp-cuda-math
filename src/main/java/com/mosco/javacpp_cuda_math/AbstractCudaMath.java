package com.mosco.javacpp_cuda_math;

import org.bytedeco.javacpp.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.bytedeco.javacpp.cuda.*;

abstract class AbstractCudaMath {
    private static final Logger LOGGER = Logger.getLogger(AbstractCudaMath.class.getName());
    private cuda.CUmod_st module;
    private int blockDimX;

    AbstractCudaMath(String nType) throws IOException {
        super();
        cuda.CUctx_st context = new cuda.CUctx_st();
        LOGGER.log(Level.FINE, "Checking if CUDA context exists");
        checkResult(cuCtxGetCurrent(context));
        if (context.equals(new cuda.CUctx_st())) {
            throw new RuntimeException("Please create CUDA context before instantiating CudaUtils");
        }

        IntPointer device = new IntPointer(1);
        cuCtxGetDevice(device);
        LOGGER.log(Level.FINE, "Device used: " + device.get());

        IntPointer maxBlockDimXPointer = new IntPointer(1);
        cuDeviceGetAttribute(maxBlockDimXPointer, CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X, device.get());
        blockDimX = maxBlockDimXPointer.get();
        LOGGER.log(Level.FINE, "MAX_BLOCK_DIM_X: " + blockDimX);

        String kernelFileName = "/cuda_math_" + nType + "_" + System.getProperty("sun.arch.data.model") + ".ptx";
        LOGGER.log(Level.FINE, "Opening kernel: " + kernelFileName);
        InputStream ptxStream = AbstractCudaMath.class.getResourceAsStream(kernelFileName);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];
        while ((nRead = ptxStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        ptxStream.close();
        buffer.write('\0');
        buffer.flush();
        byte[] bytes = buffer.toByteArray();

        this.module = new CUmod_st();
        checkResult(cuModuleLoadDataEx(module, new BytePointer(bytes), 0, new int[]{0}, new Pointer()));
        LOGGER.log(Level.FINE, "Loaded module");
    }

    public static void checkResult(int cuResult) {
        if (cuResult != CUDA_SUCCESS) {
            BytePointer errorName = new BytePointer();
            cuGetErrorName(cuResult, errorName);
            throw new CudaException(cuResult, errorName.getString());
        }
    }

    void call(String functionName, int n, Pointer... pointers) {
        cuda.CUfunc_st function = new cuda.CUfunc_st();
        checkResult(cuda.cuModuleGetFunction(function, this.module, "math_" + functionName));
        @SuppressWarnings("unchecked") PointerPointer pointerPointer = new PointerPointer(pointers);

        int gridDimX = (int) Math.ceil((double) n / blockDimX);
        LOGGER.log(Level.FINE, "Launching kernel 'math_" + functionName + "' with gridDimX/blockDimX: " + gridDimX + "/" + blockDimX);
        checkResult(cuda.cuLaunchKernel(function, gridDimX, 1, 1, blockDimX, 1, 1, 0, new cuda.CUstream_st(), pointerPointer, null));
    }
}
