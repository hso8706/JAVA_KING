package com.example.demo.Hello.controller;

import com.example.demo.Hello.service.HelloService;
import com.example.demo.common.response.ResponseFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hellos")
@RequiredArgsConstructor
public class HelloController {


    //생성
    @PostMapping
    public ResponseEntity<?> helloCreation(){

        return ResponseFactory.success("Hello Creation");
    }

    //전체조회
    @GetMapping
    public ResponseEntity<?> helloList(){

        return ResponseFactory.success("Hello List");
    }

    //상세조회
    @GetMapping("/{hello-id}")
    public ResponseEntity<?> helloDetails(@PathVariable("hello-id") Long helloId){

        return ResponseFactory.success("Hello details");
    }

    //수정
    @PatchMapping("/{hello-id}")
    public ResponseEntity<?> helloModification(@PathVariable("hello-id") Long helloId){

        return ResponseFactory.success("Hello Modification");
    }

    //삭제
    @DeleteMapping("/{hello-id}")
    public ResponseEntity<?> helloRemoval(@PathVariable("hello-id") Long helloId){

        return ResponseFactory.success("Hello Removal");
    }


}
