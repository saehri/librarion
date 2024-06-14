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
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservation_id;

    private Date reservation_date;
    private Date expiry_date;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Books books;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private Members members;
}