package com.QuoteTool.QuoteTool.Models;

import com.QuoteTool.QuoteTool.Enums.UserRole;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity @Table(name="Users")
public class User {

    private String companyName;
    private String email;

    @Enumerated(EnumType.ORDINAL)
    private UserRole role;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public User(String companyName, String email, UserRole role) {
    }
}