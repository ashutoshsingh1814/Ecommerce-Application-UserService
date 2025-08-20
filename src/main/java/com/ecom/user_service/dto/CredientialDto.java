package com.ecom.user_service.dto;

import com.ecom.user_service.entity.RoleBasedAuthority;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CredientialDto {


    private String username;
    private String password;
    private RoleBasedAuthority roleBasedAuthority;
}
