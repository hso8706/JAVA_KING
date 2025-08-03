package com.example.demo.organization.entity;

import com.example.demo.common.model.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Organization extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organization_id")
    private Long organizationId;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String team;

    @Column(nullable = false)
    private String unit;
}
