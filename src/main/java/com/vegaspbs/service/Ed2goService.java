package com.vegaspbs.service;

import com.vegaspbs.types.ed2go.Course;
import com.vegaspbs.types.ed2go.GetCourses;
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

    public Course getCourseByVendorId() {
        GetCourses request = new GetCourses();
    }
}
