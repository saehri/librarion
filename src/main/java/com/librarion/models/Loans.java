package com.librarion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "loans")
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loans_id;

    @Column(nullable = false)
    private Date loand_date;

    @Column(nullable = false)
    private Date due_date;

    private Date return_date;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private Members members;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Books books;
}
