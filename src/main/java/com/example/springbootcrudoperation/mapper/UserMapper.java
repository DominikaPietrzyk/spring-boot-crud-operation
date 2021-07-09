package com.example.springbootcrudoperation.mapper;

import com.example.springbootcrudoperation.dto.UserDto;
import com.example.springbootcrudoperation.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto dto){
        User entity =new User();

        entity.setId(dto.getId());
        entity.setName(dto.getFirstName());
        entity.setLastName(dto.getLastName());

        return entity;
    }

    public UserDto toDto(User entity){
        UserDto dto =new UserDto();

        dto.setId(entity.getId());
        dto.setFirstName(entity.getName());
        dto.setLastName(entity.getLastName());

        return dto;
    }
}
