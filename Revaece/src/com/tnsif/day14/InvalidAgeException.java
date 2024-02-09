package com.tnsif.day14;

public class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("Invalid age.");
    }

    InvalidAgeException(String message) {
        super(message);
    }
}