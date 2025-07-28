package com.example.demo.task.service;


import com.example.demo.task.entity.Task;
import com.example.demo.task.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;

    public Page<Task> findAllTask(Long memberId, int page, int size) {

        return makeTaskPage(memberId, page, size);
    }

    /*
    query dsl 학습 필요
     */
    private Page<Task> makeTaskPage(Long memberId, int page, int size) {

        return taskRepository.findAllByMemberId(memberId, PageRequest.of(page, size, Sort.by("id").descending()));
    }
}
