package com.example.demo.member.service;

import com.example.demo.member.entity.Member;
import com.example.demo.member.exception.MemberErrorCode;
import com.example.demo.member.exception.MemberException;
import com.example.demo.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createMember(Member member) {

        Member savedMember = memberRepository.save(member);

        return savedMember;
    }

    public Member login(String idNumber) {
        return memberRepository.findByIdNumber(idNumber)
                               .orElseThrow(() -> new MemberException(MemberErrorCode.NOT_FOUND_MEMBER));
    }
}
