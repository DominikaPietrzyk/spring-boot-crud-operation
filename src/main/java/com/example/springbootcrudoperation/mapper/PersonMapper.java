package com.example.springbootcrudoperation.mapper;

import com.example.springbootcrudoperation.dto.PersonDto;
import com.example.springbootcrudoperation.model.Person;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
    Person personDtoToCustomer(PersonDto dto);
    PersonDto personDtoToPerson(Person person);
}
