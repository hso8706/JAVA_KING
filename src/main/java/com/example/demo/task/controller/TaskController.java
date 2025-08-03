package com.example.demo.task.controller;

import com.example.demo.common.response.ResponseFactory;
import com.example.demo.task.dto.FilterListResponseDto;
import com.example.demo.task.dto.FilterRequestDto;
import com.example.demo.task.dto.TaskCreationRequestDto;
import com.example.demo.task.dto.TaskDetailResponseDto;
import com.example.demo.task.entity.Task;
import com.example.demo.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;

    /*
    # Task 생성
    - title 만 제공하여 TODO_SECTION 에 생성
     */
    @PostMapping
    public ResponseEntity<?> taskCreation(@RequestBody TaskCreationRequestDto request){

        Task result = taskService.createTask(TaskCreationRequestDto.to(request));

        return ResponseFactory.success("task Creation", TaskDetailResponseDto.from(result));
    }

    //상세조회
    @GetMapping("/{task-id}")
    public ResponseEntity<?> taskDetail(@PathVariable("task-id") Long taskId){

        Task result = taskService.findTask(taskId);

        return ResponseFactory.success("task Detail", TaskDetailResponseDto.from(result));
    }

    /*
    # 전체조회
    - 필터링 전체 조회를 기본으로 한다.
    - default 필터링은 member 의 부, 팀까지만 제공된 상태로 조회해야겠다.
     */
    @GetMapping
    public ResponseEntity<?> taskList(@RequestBody FilterRequestDto filterRequestDto){
        

        return ResponseFactory.success("task List");
    }

    //수정
    @PatchMapping("/{task-id}")
    public ResponseEntity<?> taskModification(@PathVariable("task-id") Long taskId){

        return ResponseFactory.success("task Modification");
    }

    //삭제
    @DeleteMapping("/{task-id}")
    public ResponseEntity<?> taskRemoval(@PathVariable("task-id") Long taskId){

        return ResponseFactory.success("task Removal");
    }


    /*
    # 필터링 목록 제공
    - 첫 화면 시작 시 호출함.
    - 전체 필터링 목록을 제공하여 +버튼 누르는 경우 해당 값들을 띄움
    - 항목 선택 후 이후 추가로 필터링 목록을 조회할 경우, 프론트에서 상태를 체크하여 체크된 항목을 제외하고 목록을 띄움
     */
    @GetMapping("/filters")
    public ResponseEntity<?> filterList(){

        return ResponseFactory.success("filter List", FilterListResponseDto.toDtoList());
    }
}
