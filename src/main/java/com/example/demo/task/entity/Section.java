package com.example.demo.task.entity;

public enum Section {

    TODO("해야할 일"),
    IN_PROGRESS("진행중인 일"),
    DONE("완료된 일");

    private final String description;

    Section(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
