package com.example.demo.member.dto;

import com.example.demo.member.entity.Grade;
import com.example.demo.member.entity.Member;
import com.example.demo.member.entity.Role;
import com.example.demo.member.entity.Status;
import com.example.demo.organization.entity.Organization;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
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

    public static Object from(Member member, Organization organization) {

        return MemberDetailsResponseDto.builder()
                                       .memberId(member.getMemberId())
                                       .organizationId(member.getOrganizationId())
                                       .department(organization.getDepartment())
                                       .team(organization.getTeam())
                                       .unit(organization.getUnit())
                                       .name(member.getName())
                                       .grade(member.getGrade())
                                       .role(member.getRole())
                                       .status(member.getStatus())
                                       .build();
    }
}
