package com.example.demo.member.controller;

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
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {


    //생성
    @PostMapping
    public ResponseEntity<?> memberCreation(){



        return ResponseFactory.success("member Creation");
    }

    //로그인
    @GetMapping
    public ResponseEntity<?> memberLogin(){



        return ResponseFactory.success("member Login");
    }

//    //전체조회
//    @GetMapping
//    public ResponseEntity<?> memberList(){
//
//        return ResponseFactory.success("member List");
//    }
//
//    //상세조회
//    @GetMapping("/{member-id}")
//    public ResponseEntity<?> memberDetails(@PathVariable("member-id") Long memberId){
//
//        return ResponseFactory.success("member details");
//    }
//
//    //수정
//    @PatchMapping("/{member-id}")
//    public ResponseEntity<?> memberModification(@PathVariable("member-id") Long memberId){
//
//        return ResponseFactory.success("member Modification");
//    }
//
//    //삭제
//    @DeleteMapping("/{member-id}")
//    public ResponseEntity<?> memberRemoval(@PathVariable("member-id") Long memberId){
//
//        return ResponseFactory.success("member Removal");
//    }


}
