package com.example.demo.task.exception;

import com.example.demo.common.exception.CustomException;
import com.example.demo.common.exception.ErrorCode;

public class TaskException extends CustomException {

    public TaskException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public TaskException(ErrorCode errorCode) {
        super(errorCode);
    }
}
