package com.example.springbootcrudoperation.mapper;

import com.example.springbootcrudoperation.dto.UserDto;
import com.example.springbootcrudoperation.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    public void testToDto() {
        User entity = new User(1L,"Test","Test1");

        UserMapper mapper = new UserMapper();
        UserDto dto=mapper.toDto(entity);

        assertEquals(dto.getId(),entity.getId());
        assertEquals(dto.getFirstName(),entity.getName());
        assertEquals(dto.getLastName(),entity.getLastName());
    }

    @Test
    public void testToEntity(){
        UserDto dto = new UserDto(2L,"Test2","Test");

        UserMapper mapper = new UserMapper();
        User entity = mapper.toEntity(dto);

        assertEquals(entity.getId(),dto.getId());
        assertEquals(entity.getName(),dto.getFirstName());
        assertEquals(entity.getLastName(),dto.getLastName());

    }
}