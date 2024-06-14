package com.librarion.service.impl;

import com.librarion.dto.MemberDto;
import com.librarion.models.Members;
import com.librarion.repository.MemberRepository;
import com.librarion.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<MemberDto> findAllMember() {
        List<Members> members = memberRepository.findAll();
        return members.stream().map(this::mapToMemberDto).collect(Collectors.toList());
    }

    public MemberDto mapToMemberDto(Members members) {
        return MemberDto.builder()
                .member_id(members.getMember_id())
                .first_name(members.getFirst_name())
                .last_name(members.getLast_name())
                .address(members.getAddress())
                .email(members.getEmail())
                .created_on(members.getCreated_on())
                .membership_date(members.getMembership_date())
                .membership_expiry_date(members.getMembership_expiry_date())
                .build();
    }
}