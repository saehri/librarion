package com.librarion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @Column(nullable = false)
    private int pages;

    @Column(nullable = false)
    private String title;

    @Column(length = 13, unique = true, nullable = false)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "publisher_id")
    private Publishers publishers;

    @Column(nullable = false, length = 4)
    private String year_published;

    private int copies_available;

    @Column(columnDefinition = "TEXT")
    private String description;

    @CreationTimestamp
    private Date created_on;

    @UpdateTimestamp
    private Date updated_on;
}
