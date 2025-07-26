package com.example.demo.task.entity;

public enum Importance {

    LEVEL_1("매우낮음"),
    LEVEL_2("낮음"),
    LEVEL_3("중간"),
    LEVEL_4("높음"),
    LEVEL_5("매우높음");

    private final String description;

    Importance(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
