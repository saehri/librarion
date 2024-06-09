package com.librarion.service;

import com.librarion.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<BookDto> findAllBooks();
}
