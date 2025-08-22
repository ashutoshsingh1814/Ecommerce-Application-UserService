package com.ecom.user_service.service;

import com.ecom.user_service.dto.UserDto;
import org.springframework.stereotype.Service;


public interface UserService {

    UserDto saveUser(UserDto userDto);
    UserDto findById(Integer UserId);
    UserDto update(Integer userId, UserDto userDto);
}
