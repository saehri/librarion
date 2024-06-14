package com.librarion.service.impl;

import com.librarion.dto.BookDto;
import com.librarion.models.Books;
import com.librarion.repository.BookRepository;
import com.librarion.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDto> findAllBooks() {
        List<Books> books = bookRepository.findAll();
        return books.stream().map(this::mapToBookDto).collect(Collectors.toList());
    }

    public BookDto mapToBookDto(Books book) {
        return BookDto.builder()
                .book_id(book.getBook_id())
                .title(book.getTitle())
                .isbn(book.getIsbn())
                .year_published(book.getYear_published())
                .pages(book.getPages())
                .copies_available(book.getCopies_available())
                .updated_on(book.getUpdated_on())
                .created_on(book.getCreated_on())
                .description(book.getDescription())
                .build();
    }
}
