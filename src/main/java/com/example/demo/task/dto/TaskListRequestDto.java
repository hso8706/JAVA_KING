package com.example.demo.task.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class TaskListRequestDto {

    private Long memberId;

    public TaskListRequestDto(Long memberId) {
        this.memberId = memberId;
    }
}
