package com.example.demo.member.entity;

import com.example.demo.common.model.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
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

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "grade")
    private Grade grade = Grade.NONE;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role = Role.NONE;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status = Status.NONE;

    public Member(Long memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

// 항목 업데이트용 메서드 필요
}
