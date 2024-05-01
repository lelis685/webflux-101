package com.example.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @Size(min = 3, max = 50)
        @NotBlank
        String name,
        @Email
        String email,
        @Size(min = 3, max = 20)
        @NotBlank
        String password
) {

}
