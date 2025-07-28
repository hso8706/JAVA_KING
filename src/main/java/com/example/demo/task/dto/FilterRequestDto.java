package com.example.demo.task.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class FilterRequestDto {
    private List<String> epic;
    private List<String> importance;
    private List<String> member;
    private List<String> department;
    private List<String> team;
    private List<String> unit;

    @Builder
    public FilterRequestDto(List<String> epic, List<String> importance, List<String> member,
            List<String> department, List<String> team, List<String> unit) {
        this.epic = epic;
        this.importance = importance;
        this.member = member;
        this.department = department;
        this.team = team;
        this.unit = unit;
    }
}
