package com.example.demo.common.response;

import java.util.ArrayList;
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
}
