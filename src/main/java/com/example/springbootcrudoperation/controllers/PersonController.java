package com.example.springbootcrudoperation.controllers;


import com.example.springbootcrudoperation.dto.PersonDto;
import com.example.springbootcrudoperation.model.Person;
import com.example.springbootcrudoperation.service.PersonService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/person")
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{personId}")
    public ResponseEntity<PersonDto> getPerson(@PathVariable("personId")UUID personId){
        return new ResponseEntity<>(personService.getPersonById(personId), HttpStatus.ACCEPTED);  //HttpStatus.OK ?
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody PersonDto personDto){
        PersonDto personDto1 =personService.saveNewPerson(personDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location","/api/person/"+personDto1.getId().toString());

        return new ResponseEntity(httpHeaders,HttpStatus.CREATED);
    }



}
