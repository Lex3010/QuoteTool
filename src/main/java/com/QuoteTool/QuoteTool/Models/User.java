package com.QuoteTool.QuoteTool.Models;

import com.QuoteTool.QuoteTool.Enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class User {

    private String companyName;
    private String email;

    @Enumerated(EnumType.ORDINAL)
    private UserRole role;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
}