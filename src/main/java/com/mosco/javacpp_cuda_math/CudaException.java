package com.mosco.javacpp_cuda_math;

public class CudaException extends RuntimeException {
    private int errorCode;

    public CudaException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode + ": " + super.getMessage();
    }
}
