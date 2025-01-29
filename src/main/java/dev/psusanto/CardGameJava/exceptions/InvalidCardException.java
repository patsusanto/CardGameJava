package dev.psusanto.CardGameJava.exceptions;

public class InvalidCardException extends Exception {
    public InvalidCardException(String errorMessage) {
        super(errorMessage);
    }
}
