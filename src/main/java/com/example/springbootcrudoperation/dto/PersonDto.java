package com.example.springbootcrudoperation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDto {

    private UUID id;

    @NotBlank
    @Size(min = 8, max = 20)
    private String password;
    @NotBlank
    private String email;
    private String isActive;
    private String identityProvider;
    private String nick;

}
