package com.example.demo.task.exception;

import com.example.demo.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public enum TaskErrorCode implements ErrorCode {
    NOT_FOUND_TASK("해당 Task를 찾을 수 없습니다", "TSK_001", 404),
    ;

    private final String message;
    private final String errorCode;
    private final int statusCode;

    TaskErrorCode(String message, String errorCode, int statusCode) {
        this.message = message;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }
}
