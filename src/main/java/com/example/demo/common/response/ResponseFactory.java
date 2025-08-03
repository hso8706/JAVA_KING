package com.example.demo.common.response;

import com.example.demo.common.exception.ErrorCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class ResponseFactory {


    public static ResponseEntity<?> success(String message, Object data) {

        SuccessResponseDto successResponse = new SuccessResponseDto(message, data);

        return ResponseEntity.status(200)
                             .body(successResponse);
    }

    public static ResponseEntity<?> success(String message) {

        SuccessResponseDto successResponse = new SuccessResponseDto(message, new ArrayList<>());

        return ResponseEntity.status(200)
                             .body(successResponse);
    }

    public static ResponseEntity<?> fail(ErrorCode errorCode) {
        FailResponseDto failResponse = new FailResponseDto(errorCode.getMessage(),
                errorCode.getErrorCode());
        return ResponseEntity.status(errorCode.getStatusCode())
                             .body(failResponse);
    }

    public static ResponseEntity<?> fail(String message, String errorCode, int statusCode) {
        FailResponseDto failResponse = new FailResponseDto(message, errorCode);
        return ResponseEntity.status(statusCode)
                             .body(failResponse);
    }

    public static void fail(HttpServletResponse response, String message, ErrorCode errorCode)
            throws IOException {
        FailResponseDto failResponse = new FailResponseDto(message, errorCode.getErrorCode());
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(errorCode.getStatusCode());
        response.setCharacterEncoding("UTF-8");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter()
                .write(mapper.writeValueAsString(failResponse));

    }
}
