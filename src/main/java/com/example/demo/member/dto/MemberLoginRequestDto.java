package com.example.demo.member.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class MemberLoginRequestDto {

    private String idNumber;

    public MemberLoginRequestDto(String idNumber) {
        this.idNumber = idNumber;
    }
}
