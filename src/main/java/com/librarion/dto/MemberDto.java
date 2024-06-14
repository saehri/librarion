package com.librarion.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class MemberDto {
    private Long member_id;
    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phone_number;
    private Date membership_date;
    private Date membership_expiry_date;
    private Date created_on;
}
