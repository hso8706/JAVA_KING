package com.example.demo.report.entity;

import com.example.demo.common.model.BaseTimeEntity;
import com.example.demo.organization.entity.Organization;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Report extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long reportId;

    @Column(name = "organization_id")
    private Long organizationId;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String lastWeekSummary;

    @Column(columnDefinition = "TEXT")
    private String thisWeekPlan;

    private String createdYear;
    private String createdWeek;

}
