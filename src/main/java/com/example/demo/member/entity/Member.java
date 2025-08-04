package com.example.demo.member.entity;

import com.example.demo.common.model.BaseTimeEntity;
import com.example.demo.organization.entity.Organization;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "organization_id")
    private Long organizationId;

    @Column(name = "name")
    private String name;

    @Column(name = "id_number")
    private String idNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "grade")
    private Grade grade = Grade.NONE;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role = Role.NONE;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status = Status.NONE;

    @Builder
    public Member(Long memberId, Long organizationId, String name, String idNumber, Grade grade, Role role,
            Status status) {
        this.memberId = memberId;
        this.organizationId = organizationId;
        this.name = name;
        this.idNumber = idNumber;
        this.grade = grade;
        this.role = role;
        this.status = status;
    }
}
