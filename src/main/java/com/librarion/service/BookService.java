package com.librarion.service;

import com.librarion.dto.BookDto;
import com.librarion.models.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<BookDto> findAllBooks();
    Books saveNewBook(BookDto bookDto);
}
