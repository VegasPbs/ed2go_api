package com.vegaspbs.ed2goInterface.integration;

import com.vegaspbs.ed2goInterface.service.CourseInformationService;
import com.vegaspbs.ed2goInterface.types.ed2go.ObjectFactory;
import com.vegaspbs.ed2goInterface.exceptions.CourseCodeNotFoundException;
import com.vegaspbs.ed2goInterface.types.ed2go.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseInformationServiceTest {

    private static final String courseCode = "GES503";
    private static final String title = "Digital Arts Certificate";

    @Autowired
    private CourseInformationService courseInfo;

    private Course course = new ObjectFactory().createCourse();

    @Test
    public void shouldReturnCourse() throws CourseCodeNotFoundException{
        course = courseInfo.getCourseByCourseCode(courseCode);

        assertNotNull(course);
        assertEquals(course.getTitle().getContent(), title);
        assertEquals(course.getCourseCode(), courseCode);

    }
}
