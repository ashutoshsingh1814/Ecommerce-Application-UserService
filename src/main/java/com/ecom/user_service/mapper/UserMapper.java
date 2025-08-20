package com.ecom.user_service.mapper;

import com.ecom.user_service.dto.UserDto;
import com.ecom.user_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "email", target = "emailAddress")
    @Mapping(source = "phone", target ="contact")
    UserDto toDto(User user);

    @Mapping(source = "emailAddress", target = "email")
    @Mapping(source = "contact", target = "phone")
    User toEntity(UserDto userDto);
}
