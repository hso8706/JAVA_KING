package com.example.demo.task.entity;

import com.example.demo.common.model.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Task extends BaseTimeEntity {

    /*
    key section
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "epic_id")
    private Long epicId;

    /*
    column section
     */

//    제목, title
    @Column(name = "title")
    private String title;

//    시작일자, start_date
    @Column(name = "start_date")
    private LocalDateTime startDate;

//    마감일자, end_date
    @Column(name = "end_date")
    private LocalDateTime endDate;

//    중요도, importance
    @Column(name = "importance")
    private Importance importance;

//    상세설명, task_details
    @Column(name = "task_detail")
    private String taskDetail;

//    진행공유 코멘트, progress_comment
    @Column(name = "progress_comment")
    private String progressComment;

//    변경 히스토리, history_log
    @Column(name = "history_log")
    private String historyLog;

//    구역, section
    @Column(name = "section")
    private Section section;

//    결재상태, approval_status
    @Column(name = "approval_status")
    private ApprovalStatus approvalStatus;



}
