package com.example.demo.member.dto;

import com.example.demo.member.entity.Grade;
import com.example.demo.member.entity.Member;
import com.example.demo.member.entity.Role;
import com.example.demo.member.entity.Status;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class MemberCreationRequestDto {

    private String department;
    private String team;
    private String name;
    private String idNumber;
    private String grade;
    private String role;
    private String status;

    @Builder
    public MemberCreationRequestDto(String department, String team, String name, String idNumber,
            String grade, String role, String status) {
        this.department = department;
        this.team = team;
        this.name = name;
        this.idNumber = idNumber;
        this.grade = grade;
        this.role = role;
        this.status = status;
    }

    public static Member to(MemberCreationRequestDto request, Long organizationId) {
        return Member.builder()
                     .organizationId(organizationId)
                     .name(request.getName())
                     .idNumber(request.getIdNumber())
                     .grade(Grade.valueOf(request.getGrade()))
                     .role(Role.valueOf(request.getRole()))
                     .status(Status.valueOf(request.getStatus()))
                     .build();
    }
}
