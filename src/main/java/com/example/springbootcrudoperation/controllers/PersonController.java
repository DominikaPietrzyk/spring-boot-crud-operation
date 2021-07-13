package com.example.springbootcrudoperation.controllers;

import com.example.springbootcrudoperation.dto.PersonDto;
import com.example.springbootcrudoperation.service.PersonService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
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
        return new ResponseEntity<>(personService.getPersonById(personId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody PersonDto personDto){
        PersonDto personDto1 =personService.saveNewPerson(personDto);

        return ResponseEntity.created(URI.create("/" + personDto1.getId())).body(personDto1);
    }

}
