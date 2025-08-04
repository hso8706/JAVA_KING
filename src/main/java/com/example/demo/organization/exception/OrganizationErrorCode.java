package com.example.demo.organization.exception;

import com.example.demo.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public enum OrganizationErrorCode implements ErrorCode {
    NOT_FOUND_ORGANIZATION("해당 Organization 찾을 수 없습니다", "ORZ_001", 404),
    ;

    private final String message;
    private final String errorCode;
    private final int statusCode;

    OrganizationErrorCode(String message, String errorCode, int statusCode) {
        this.message = message;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }
}
