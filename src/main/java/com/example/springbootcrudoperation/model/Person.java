package com.example.springbootcrudoperation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

private UUID id;
private String password;
private String email;
private String isActive;
private String identityProvider;
private String nick;




  /*  public UserId Id { get; private set; }

    public string Password { get; private set; }

    public string Email { get; private set; }

    public bool IsActive { get; private set; }

    public string IdentityProvider { get; private set; }

    public string Nick { get; set; }*/
}
