package com.example.demo.member.entity;

public enum Status {

    NONE("초기"),
    AVAILABLE("업무 가능"), // 재직 상태
    UNAVAILABLE("업무 불가능"); // 휴가, 휴무, 출장, 휴직 등 재직중이 아닌 상태

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
