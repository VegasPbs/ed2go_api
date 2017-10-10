package com.vegaspbs.ed2goInterface.service;

import com.vegaspbs.ed2goInterface.types.ed2go.*;
import com.vegaspbs.ed2goInterface.exceptions.CourseCodeNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class CourseInformationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CourseInformationService.class);

    @Value("${career_SB_api_key}")
    private String apiKey;

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public Course getCourseByCourseCode(String courseCode) throws CourseCodeNotFoundException {
        ObjectFactory factory = new ObjectFactory();

        ArrayOfString codes = factory.createArrayOfString();
        codes.getCourseCode().add(courseCode);

        CoursesFilter filter = factory.createCoursesFilter();
        filter.setCourseCodes(codes);

        ArrayOfCourseIncludeField fields = factory.createArrayOfCourseIncludeField();
        fields.getFieldName().add(CourseIncludeField.TITLE);

        GetCourses request = factory.createGetCourses();
        request.setAPIKey(apiKey);
        request.setCoursesFilter(filter);
        request.setIncludeFields(fields);

        GetCoursesResponse response = (GetCoursesResponse) webServiceTemplate.marshalSendAndReceive(request, new SoapActionCallback("https://api.ed2go.com/GetCourses"));

        if (!response.getCoursesGetResponse().getResult().isSuccess()){
            throw new CourseCodeNotFoundException(courseCode);
        }

        return response.getCoursesGetResponse().getCourses().getCourse().get(0);
    }
}
