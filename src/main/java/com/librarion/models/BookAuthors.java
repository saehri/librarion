package com.librarion.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "BookAuthors")
@IdClass(BookAuthorsId.class)
public class BookAuthors {
    @Id
    @Column(name = "book_id")
    private Long book_id;

    @Id
    @Column(name = "author_id")
    private Long author_id;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Books books;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    private Authors authors;
}