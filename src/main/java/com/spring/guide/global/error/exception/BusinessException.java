package com.spring.guide.global.error.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BusinessException extends RuntimeException {

    private final ErrorCode errorCode;

    public BusinessException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    @Override
    public void printStackTrace() {
        log.error("error code : {}, message : {}", this.getErrorCode(), this.getMessage());
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}
