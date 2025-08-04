package com.example.demo.member.exception;

import com.example.demo.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public enum MemberErrorCode implements ErrorCode {
    NOT_FOUND_MEMBER("해당 Member 찾을 수 없습니다", "MBR_001", 404),
    ;

    private final String message;
    private final String errorCode;
    private final int statusCode;

    MemberErrorCode(String message, String errorCode, int statusCode) {
        this.message = message;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }
}
