package com.librarion.models;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;
    private String title;
    private String description;
    private Date year_published;
    private int copies_available;
    private String isbn;
    private int pages;
    @CreationTimestamp
    private LocalDateTime created_on;
    @UpdateTimestamp
    private LocalDateTime updated_on;
}
