package com.example.demo.member.entity;

public enum Grade {
//    VICE_PRESIDENT("부행장"),
//    DIRECTOR("부장"),
//    GENERAL_MANAGER("국장"),
//    TEAM_LEADER("팀장"),
//    DEPUTY_GENERAL_MANAGER("차장"),
//    MANAGER("과장"),
//    ASSISTANT_MANAGER("과장(보)"),
//    SECTION_CHIEF("계장");

    NONE("초기"),
    GRADE_M("M급"),
    GRADE_3("3급"),
    GRADE_4("4급"),
    GRADE_5("5급"),
    GRADE_6("6급"),
    GRADE_7("7급");

    private final String description;

    Grade(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
