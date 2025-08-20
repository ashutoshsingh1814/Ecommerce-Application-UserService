package com.ecom.user_service.mapper;

import com.ecom.user_service.dto.CredientialDto;
import com.ecom.user_service.entity.Credential;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CredientialMapper {

    CredientialDto toDto(Credential credential);

    Credential toEntity(CredientialDto credientialDto);
}
