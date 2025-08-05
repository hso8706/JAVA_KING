package com.example.demo.member.controller;

import com.example.demo.common.response.ResponseFactory;
import com.example.demo.member.dto.MemberCreationRequestDto;
import com.example.demo.member.dto.MemberDetailsResponseDto;
import com.example.demo.member.dto.MemberLoginRequestDto;
import com.example.demo.member.entity.Member;
import com.example.demo.member.service.MemberService;
import com.example.demo.organization.entity.Organization;
import com.example.demo.organization.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final OrganizationService organizationService;

    //생성
    @PostMapping
    public ResponseEntity<?> memberCreation(@RequestBody MemberCreationRequestDto request){

        Organization myOrganization = organizationService.findOrganizationIdByDepartmentAndTeam(request.getDepartment(), request.getTeam());
        Member result = memberService.createMember(MemberCreationRequestDto.to(request, myOrganization.getOrganizationId()));


        return ResponseFactory.success("member Creation", MemberDetailsResponseDto.from(result, myOrganization));
    }

    //로그인
    @GetMapping("/login")
    public ResponseEntity<?> memberLogin(@RequestBody MemberLoginRequestDto request){

        System.out.println(request.getIdNumber());

        Member result = memberService.login(request.getIdNumber());
        Organization myOrganization = organizationService.findMyOrganizationByMemberId(result.getMemberId());

        return ResponseFactory.success("member Login", MemberDetailsResponseDto.from(result, myOrganization));
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
