package com.librarion.service.impl;

import com.librarion.dto.AuthorDto;
import com.librarion.models.Authors;
import com.librarion.repository.AuthorRepository;
import com.librarion.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorDto> findAllAuthors() {
        List<Authors> authors = authorRepository.findAll();
        return authors.stream().map(this::mapToAuthorDto).collect(Collectors.toList());
    }

    public AuthorDto mapToAuthorDto(Authors authors) {
        return AuthorDto.builder()
                .author_id(authors.getAuthor_id())
                .first_name(authors.getFirst_name())
                .last_name(authors.getLast_name())
                .biography(authors.getBiography())
                .Gender(authors.getGender())
                .birth_date(authors.getBirth_date())
                .death_date(authors.getDeath_date())
                .build();
    }

}

//    public BookDto mapToBookDto(Books book) {
//        return BookDto.builder()
//                .book_id(book.getBook_id())
//                .title(book.getTitle())
//                .isbn(book.getIsbn())
//                .year_published(book.getYear_published())
//                .pages(book.getPages())
//                .copies_available(book.getCopies_available())
//                .updated_on(book.getUpdated_on())
//                .created_on(book.getCreated_on())
//                .description(book.getDescription())
//                .build();
//    }
//}
