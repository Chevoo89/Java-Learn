package de.bht.pr2.lab01;

public class WrongCourseOfStudiesException extends Exception{
    public WrongCourseOfStudiesException (String coursOfStudies){
        super("Invalid course of Studies: " + coursOfStudies);
    }
}
