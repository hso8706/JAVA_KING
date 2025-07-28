package com.example.demo.task.entity;

public enum ApprovalStatus {

    COMPLETED("결재 완료"),
    PENDING("결재 미완료"),
    IN_PROGRESS("결재 중");

    private final String description;

    ApprovalStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
