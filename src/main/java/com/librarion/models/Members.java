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
@Table(name = "members")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    @Column(nullable = false, length = 50)
    private String first_name;

    @Column(nullable = false, length = 50)
    private String last_name;

    @Column(nullable = true, length = 150)
    private String email;

    @Column(nullable = false, length = 16)
    private String phone_number;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String address;

    private Date membership_date;
    private Date membership_expiry_date;

    @CreationTimestamp
    private Date created_on;

    @UpdateTimestamp
    private Date updated_on;
}
