package com.example.demo.task.repository;

import com.example.demo.task.dto.FilterRequestDto;
import com.example.demo.task.entity.Task;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TaskRepositoryCustom {

    /*

     */
    List<Task> findTasksByFilters(FilterRequestDto filterRequestDto);
}
