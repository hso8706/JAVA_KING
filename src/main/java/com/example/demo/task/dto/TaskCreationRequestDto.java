package com.example.demo.task.dto;

import com.example.demo.task.entity.Importance;
import com.example.demo.task.entity.Section;
import com.example.demo.task.entity.Task;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class TaskCreationRequestDto {

    private String title;
    private Long memberId;
    private Long epicId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Importance importance;
    private String taskDetail;

    public TaskCreationRequestDto(String title, Long memberId, Long epicId, LocalDate startDate,
            LocalDate endDate, Importance importance, String taskDetail) {
        this.title = title;
        this.memberId = memberId;
        this.epicId = epicId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.importance = importance;
        this.taskDetail = taskDetail;
    }

    public static Task to (TaskCreationRequestDto request){

        return Task.builder()
                .memberId(request.getMemberId())
                .epicId(request.getEpicId())
                .title(request.getTitle())
                .startDate(request.getStartDate())
                .endDate(request.getEndDate())
                .importance(request.getImportance())
                .taskDetail(request.getTaskDetail())
                .section(Section.TODO) // default
                   .build();
    }
}
