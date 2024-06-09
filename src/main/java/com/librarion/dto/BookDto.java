package com.librarion.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Builder
public class BookDto {
    private Long book_id;
    private String title;
    private String description;
    private Date year_published;
    private int copies_available;
    private String isbn;
    private int pages;
    private LocalDateTime created_on;
    private LocalDateTime updated_on;
}
