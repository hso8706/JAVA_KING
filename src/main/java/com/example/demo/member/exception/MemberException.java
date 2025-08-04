package com.example.demo.member.exception;

import com.example.demo.common.exception.CustomException;
import com.example.demo.common.exception.ErrorCode;

public class MemberException extends CustomException {

    public MemberException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public MemberException(ErrorCode errorCode) {
        super(errorCode);
    }
}
