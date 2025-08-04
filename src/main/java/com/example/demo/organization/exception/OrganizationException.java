package com.example.demo.organization.exception;

import com.example.demo.common.exception.CustomException;
import com.example.demo.common.exception.ErrorCode;

public class OrganizationException extends CustomException {

    public OrganizationException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public OrganizationException(ErrorCode errorCode) {
        super(errorCode);
    }
}
