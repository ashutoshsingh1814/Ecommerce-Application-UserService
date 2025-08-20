package com.ecom.user_service.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Credential {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer credentialId;
    @Column(unique = true)
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private RoleBasedAuthority roleBasedAuthority;

    @JsonIgnore
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    public Credential() {
    }

    public Integer getCredentialId() {
        return credentialId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public RoleBasedAuthority getRoleBasedAuthority() {
        return roleBasedAuthority;
    }

    public User getUser() {
        return user;
    }

    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoleBasedAuthority(RoleBasedAuthority roleBasedAuthority) {
        this.roleBasedAuthority = roleBasedAuthority;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
