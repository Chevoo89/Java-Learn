package de.bht.pr2.lab01;

public class StudentParseException extends Exception{
    public StudentParseException(String dateRow){
        super("Parsing error in date row: " + dateRow);
    }
}
