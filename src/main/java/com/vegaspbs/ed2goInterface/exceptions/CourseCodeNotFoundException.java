package com.vegaspbs.ed2goInterface.exceptions;

public class CourseCodeNotFoundException extends Exception {

    private String courseCode;
    private String message;

    public CourseCodeNotFoundException(String courseCode){
        this.courseCode = courseCode;
        this.message = "No course was found at Course Code: " + courseCode;
    }
}
