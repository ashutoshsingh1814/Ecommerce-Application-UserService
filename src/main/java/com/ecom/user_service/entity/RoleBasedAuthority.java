package com.ecom.user_service.entity;

public enum RoleBasedAuthority {
    ROLE_USER("USER"),
    ROLE_ADMIN("ADMIN");

    private final String role;

    private String getRole() {
        return role;
    }

    private RoleBasedAuthority(String role) {
        this.role = role;
    }
}
