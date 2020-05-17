package com.QuoteTool.QuoteTool.Models;

import com.QuoteTool.QuoteTool.Enums.UserRole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity @Table(name="Users")
public class User {

    private String companyName;
    private String email;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private UserRole role;

    public UserRole getRole() {
        return role;
    }



}