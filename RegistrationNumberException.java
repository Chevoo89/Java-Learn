package de.bht.pr2.lab01;

public class RegistrationNumberException extends Exception {
    public RegistrationNumberException (String registrationNumber) {
        super("Invalid registration number: " + registrationNumber);
    }
}