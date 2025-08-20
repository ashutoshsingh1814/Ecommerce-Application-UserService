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
    private Integer userId;
    private String firstName;
    private String lastName;
    @Email
    @Column(unique = true)
    private String email;
    private String phone;

    //Don't load related data Immediately when main entity is loaded - load it only when we access
    //Crediential entity owns the relationship and User field in it holds the foreign key
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Credential credential;

}
