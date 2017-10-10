package com.vegaspbs.service;

import com.vegaspbs.types.ed2go.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class Ed2goService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Ed2goService.class);

    private static final String API_KEY = "${career_SB_spi_key}";

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public Course getCourseByVendorId(String vendorId) {

        ArrayOfString codes = new ArrayOfString();
        codes.getCourseCode().add(vendorId);

        CoursesFilter filter = new CoursesFilter();
        filter.setCourseCodes(codes);

        ArrayOfCourseIncludeField fields = new ArrayOfCourseIncludeField();
        fields.getFieldName().add(CourseIncludeField.TITLE);

        GetCourses request = new GetCourses();
        request.setAPIKey(API_KEY);
        request.setCoursesFilter(filter);
        request.setIncludeFields(fields);

        GetCoursesResponse response = (GetCoursesResponse) webServiceTemplate.marshalSendAndReceive(request);
        Course course = response.getCoursesGetResponse().getCourses().getCourse().get(0);

        return course;
    }
}
