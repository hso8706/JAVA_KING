package com.example.demo.member.entity;

public enum Role {

    NONE("초기"),
    APPROVER("결재 권한자"),
    EMPLOYEE("일반 직원");

    private final String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
