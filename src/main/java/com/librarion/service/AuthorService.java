package com.librarion.service;

import com.librarion.dto.AuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    List<AuthorDto> findAllAuthors();
}
