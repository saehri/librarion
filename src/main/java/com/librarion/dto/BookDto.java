package com.librarion.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class BookDto {
    private Long book_id;
    private String title;
    private String isbn;
    private String year_published;
    private int pages;
    private int copies_available;
    private String description;
    private Date created_on;
    private Date updated_on;
}
