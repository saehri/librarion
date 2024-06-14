package com.librarion.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class AuthorDto {
    private Long author_id;
    private String last_name;
    private String first_name;
    private String Gender;
    private String biography;
    private Date birth_date;
    private Date death_date;
}
