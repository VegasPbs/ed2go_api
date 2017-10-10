package com.vegaspbs.exceptions;

public class CourseIdNotFoundException extends Exception {

    private String vendorCourseId;
    private String message;

    public CourseIdNotFoundException(String vendorCourseID){
        this.vendorCourseId = vendorCourseID;
        this.message = "No course was found at Id: " + vendorCourseID;
    }
}
