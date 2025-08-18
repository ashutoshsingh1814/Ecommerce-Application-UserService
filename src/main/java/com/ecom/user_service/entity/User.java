package com.ecom.user_service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class User {

    // JPA requires a public or protected no-argument constructor
    public User() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Email
    @Column(unique = true)
    private String email;
}
