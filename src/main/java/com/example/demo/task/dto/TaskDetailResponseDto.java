package com.example.demo.task.dto;

import com.example.demo.task.entity.ApprovalStatus;
import com.example.demo.task.entity.Importance;
import com.example.demo.task.entity.Section;
import com.example.demo.task.entity.Task;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class TaskDetailResponseDto {

    private Long taskId;
    private Long memberId;
    private Long epicId;
    private String title;
    private Importance importance;
    private String taskDetail;
    private String progressComment;
    private String historyLog;
    private Section section;
    private ApprovalStatus approvalStatus;

    @Builder
    public TaskDetailResponseDto(Long taskId, Long memberId, Long epicId, String title,
            Importance importance, String taskDetail, String progressComment, String historyLog,
            Section section, ApprovalStatus approvalStatus) {
        this.taskId = taskId;
        this.memberId = memberId;
        this.epicId = epicId;
        this.title = title;
        this.importance = importance;
        this.taskDetail = taskDetail;
        this.progressComment = progressComment;
        this.historyLog = historyLog;
        this.section = section;
        this.approvalStatus = approvalStatus;
    }

    public static TaskDetailResponseDto from(Task task) {
        return TaskDetailResponseDto.builder()
                                    .taskId(task.getTaskId())
                                    .memberId(task.getMemberId())
                                    .epicId(task.getEpicId())
                                    .title(task.getTitle())
                                    .importance(task.getImportance())
                                    .taskDetail(task.getTaskDetail())
                                    .progressComment(task.getProgressComment())
                                    .historyLog(task.getHistoryLog())
                                    .section(task.getSection())
                                    .approvalStatus(task.getApprovalStatus())
                                    .build();
    }
}
