package com.librarion.service;

import com.librarion.dto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
    List<MemberDto> findAllMember();
}