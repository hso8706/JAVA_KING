package com.example.demo.task.controller;

import com.example.demo.common.response.ResponseFactory;
import com.example.demo.task.dto.TaskCreationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    /*
    # Task 생성
    - title 만 제공하여 TODO_SECTION 에 생성
     */
    @PostMapping
    public ResponseEntity<?> taskCreation(@RequestBody TaskCreationRequestDto request){

        return ResponseFactory.success("task Creation");
    }
    
    //전체조회
    @GetMapping
    public ResponseEntity<?> taskList(){

        return ResponseFactory.success("task List");
    }

    //상세조회
    @GetMapping("/{task-id}")
    public ResponseEntity<?> taskDetails(@PathVariable("task-id") Long taskId){

        return ResponseFactory.success("task details");
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
}
