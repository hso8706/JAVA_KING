package com.example.demo.member.dto;

import com.example.demo.member.entity.Grade;
import com.example.demo.member.entity.Role;
import com.example.demo.member.entity.Status;
import lombok.Builder;

public class MemberDetailsResponseDto {

    private Long memberId;

    private Long organizationId;
    private String department;
    private String team;
    private String unit;

    private String name;
    private Grade grade;
    private Role role;
    private Status status;

    @Builder
    public MemberDetailsResponseDto(Long memberId, Long organizationId, String department,
            String team,
            String unit, String name, Grade grade, Role role, Status status) {
        this.memberId = memberId;
        this.organizationId = organizationId;
        this.department = department;
        this.team = team;
        this.unit = unit;
        this.name = name;
        this.grade = grade;
        this.role = role;
        this.status = status;
    }

}
