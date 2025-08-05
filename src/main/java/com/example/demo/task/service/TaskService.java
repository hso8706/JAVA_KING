package com.example.demo.task.service;


import com.example.demo.organization.entity.Organization;
import com.example.demo.organization.service.OrganizationService;
import com.example.demo.task.entity.Task;
import com.example.demo.task.exception.TaskErrorCode;
import com.example.demo.task.exception.TaskException;
import com.example.demo.task.repository.TaskRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;
    private final OrganizationService organizationService;

    public Task createTask(Task task) {

        Task savedTask = taskRepository.save(task);

        return savedTask;
    }

    public Task findTask(Long taskId) {

        return findVerifiedTask(taskId);
    }

    private Task findVerifiedTask(Long taskId) {

        return taskRepository.findById(taskId).orElseThrow(
                () -> new TaskException(TaskErrorCode.NOT_FOUND_TASK)
        );
    }

    public List<Task> findAllTasks (Long memberId) {

        Organization findVerifiedMyOrganizationId = organizationService.findMyOrganizationByMemberId(memberId);

        return taskRepository.findAllByOrganizationId(
                findVerifiedMyOrganizationId.getOrganizationId());
    }

}
