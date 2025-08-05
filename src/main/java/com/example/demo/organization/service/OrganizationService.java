package com.example.demo.organization.service;

import com.example.demo.member.entity.Member;
import com.example.demo.member.exception.MemberErrorCode;
import com.example.demo.member.exception.MemberException;
import com.example.demo.member.repository.MemberRepository;
import com.example.demo.organization.entity.Organization;
import com.example.demo.organization.exception.OrganizationErrorCode;
import com.example.demo.organization.exception.OrganizationException;
import com.example.demo.organization.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrganizationService {

    private final MemberRepository memberRepository;
    private final OrganizationRepository organizationRepository;

    public Organization findMyOrganizationByMemberId (Long memberId) {
        Member findVerifiedMember = memberRepository.findByMemberId(memberId)
                                        .orElseThrow(() -> new MemberException(MemberErrorCode.NOT_FOUND_MEMBER));

        return organizationRepository.findByOrganizationId(findVerifiedMember.getOrganizationId())
                                     .orElseThrow(() -> new OrganizationException(OrganizationErrorCode.NOT_FOUND_ORGANIZATION));
    }

    public Organization findOrganizationIdByDepartmentAndTeam (String department, String team) {
        return organizationRepository.findByDepartmentAndTeam(department, team)
                                     .orElseThrow(() -> new OrganizationException(OrganizationErrorCode.NOT_FOUND_ORGANIZATION));
    }
}
