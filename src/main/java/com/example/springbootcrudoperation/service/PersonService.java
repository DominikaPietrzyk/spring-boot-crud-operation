package com.example.springbootcrudoperation.service;

import com.example.springbootcrudoperation.dto.PersonDto;

import java.util.UUID;

public interface PersonService {

    PersonDto getPersonById(UUID personId);
    PersonDto saveNewPerson(PersonDto personDto);

    void deleteById(UUID personId);
    void updatePeron(UUID personId,PersonDto personDto);
}
