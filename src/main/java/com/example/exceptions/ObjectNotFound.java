package com.example.exceptions;

public class ObjectNotFound extends RuntimeException{

    public ObjectNotFound(String message) {
        super(message);
    }
}
