package com.example.model.request;

import com.example.validator.TrimString;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @Size(min = 3, max = 50)
        @NotBlank
        @TrimString
        String name,
        @Email
        @TrimString
        String email,
        @Size(min = 3, max = 20)
        @NotBlank
        @TrimString
        String password
) {

}
