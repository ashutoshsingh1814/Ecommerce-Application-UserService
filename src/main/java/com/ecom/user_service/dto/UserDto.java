package com.ecom.user_service.dto;

import com.ecom.user_service.entity.Credential;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String contact;
    private Credential credential;
}
