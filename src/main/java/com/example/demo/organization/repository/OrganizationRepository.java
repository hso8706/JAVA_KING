package com.example.demo.organization.repository;

import com.example.demo.organization.entity.Organization;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    Optional<Organization> findByOrganizationId(Long organizationId);

    // department와 team을 기준으로 organizationId를 찾는 메서드
    Optional<Organization> findByDepartmentAndTeam(String department, String team);
}
