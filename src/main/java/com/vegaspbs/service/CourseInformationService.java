package com.vegaspbs.service;

import com.vegaspbs.exceptions.CourseIdNotFoundException;
import com.vegaspbs.types.ed2go.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class CourseInformationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CourseInformationService.class);

    private static final String API_KEY = "${career_SB_spi_key}";

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public Course getCourseByVendorId(String vendorCourseId) throws CourseIdNotFoundException{

        ArrayOfString codes = new ArrayOfString();
        codes.getCourseCode().add(vendorCourseId);

        CoursesFilter filter = new CoursesFilter();
        filter.setCourseCodes(codes);

        ArrayOfCourseIncludeField fields = new ArrayOfCourseIncludeField();
        fields.getFieldName().add(CourseIncludeField.TITLE);

        GetCourses request = new GetCourses();
        request.setAPIKey(API_KEY);
        request.setCoursesFilter(filter);
        request.setIncludeFields(fields);

        GetCoursesResponse response = (GetCoursesResponse) webServiceTemplate.marshalSendAndReceive(request);

        if (!response.getCoursesGetResponse().getResult().isSuccess()){
            throw new CourseIdNotFoundException(vendorCourseId);
        }

        return response.getCoursesGetResponse().getCourses().getCourse().get(0);
    }
}
