package com.example.demo.task.dto;

import com.example.demo.task.entity.ApprovalStatus;
import com.example.demo.task.entity.Importance;
import com.example.demo.task.entity.Section;
import com.example.demo.task.entity.Task;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class TaskDetailResponseDto {

    private Long taskId;
    private Long memberId;
    private Long epicId;
    private Long approvalId;
    private String title;
    private Importance importance;
    private LocalDate startDate;
    private LocalDate endDate;
    private String taskDetail;
    private String progressComment;
    private String historyLog;
    private Section section;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public TaskDetailResponseDto(Long taskId, Long memberId, Long epicId, Long approvalId,
            String title,
            Importance importance, LocalDate startDate, LocalDate endDate, String taskDetail,
            String progressComment, String historyLog, Section section, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.taskId = taskId;
        this.memberId = memberId;
        this.epicId = epicId;
        this.approvalId = approvalId;
        this.title = title;
        this.importance = importance;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskDetail = taskDetail;
        this.progressComment = progressComment;
        this.historyLog = historyLog;
        this.section = section;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public static TaskDetailResponseDto from(Task task) {
        return TaskDetailResponseDto.builder()
                                    .taskId(task.getTaskId())
                                    .memberId(task.getMemberId())
                                    .epicId(task.getEpicId())
                                    .approvalId(task.getApprovalId())
                                    .title(task.getTitle())
                                    .importance(task.getImportance())
                                    .startDate(task.getStartDate())
                                    .endDate(task.getEndDate())
                                    .taskDetail(task.getTaskDetail())
                                    .progressComment(task.getProgressComment())
                                    .historyLog(task.getHistoryLog())
                                    .section(task.getSection())
                                    .createdAt(task.getCreateAt())
                                    .updatedAt(task.getUpdateAt())
                                    .build();
    }
}
