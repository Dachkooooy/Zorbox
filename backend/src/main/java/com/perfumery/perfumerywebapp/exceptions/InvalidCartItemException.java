package com.perfumery.perfumerywebapp.exceptions;

public class InvalidCartItemException extends RuntimeException{

    public InvalidCartItemException(String message) {
        super(message);
    }
}
