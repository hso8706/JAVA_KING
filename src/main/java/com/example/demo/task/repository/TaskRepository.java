package com.example.demo.task.repository;

import com.example.demo.member.entity.Member;
import com.example.demo.organization.entity.Organization;
import com.example.demo.task.entity.Task;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query("""
                SELECT t FROM Task t
                JOIN Member m ON t.memberId = m.memberId
                WHERE m.organizationId = :organizationId
            """)
    List<Task> findAllByOrganizationId(@Param("organizationId") Long OrganizationId);
}
