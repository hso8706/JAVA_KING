package com.example.demo.task.repository;

import com.example.demo.member.entity.Member;
import com.example.demo.task.dto.FilterRequestDto;
import com.example.demo.task.entity.ApprovalStatus;
import com.example.demo.task.entity.Task;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /*

     */
    Page<Task> findAllByMemberId(Long memberId, Pageable pageable);
    List<Task> findTasksMyFilters(FilterRequestDto filterRequestDto);
}
