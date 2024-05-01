package com.example.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationError extends StandardError implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final List<FieldError> errors = new ArrayList<>();

    public void addError(String fieldName, String message){
        errors.add(new FieldError(fieldName, message));
    }

    public ValidationError(StandardError standardError) {
        super(standardError.getTimestamp(), standardError.getPath(),
                standardError.getStatus(), standardError.getError(),
                standardError.getMessage());
    }

    @Getter
    @AllArgsConstructor
    private static class FieldError {
        private String fieldName;
        private String message;
    }

}
