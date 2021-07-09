package com.example.springbootcrudoperation.service;

import com.example.springbootcrudoperation.dto.PersonDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class PersonServiceImpl implements PersonService{


    @Override
    public PersonDto getPersonById(UUID personId) {
        return PersonDto.builder()
                .id(UUID.randomUUID())
                .email("example.com")
                .build();
    }

    @Override
    public PersonDto saveNewPerson(PersonDto personDto) {
        return PersonDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void deleteById(UUID personId) {

    }

    @Override
    public void updatePeron(UUID personId, PersonDto personDto) {

    }
}
