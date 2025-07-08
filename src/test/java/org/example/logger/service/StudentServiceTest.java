package org.example.logger.service;


import org.example.logger.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentServiceTest {

    @Test
    void testProcessStudent() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(org.example.logger.AppConfig.class);

        StudentService service = context.getBean(StudentService.class);
        service.processStudent();

        // Optional assertions
        Student student = new Student(101, "Rahul", "B.Tech");
        assertNotNull(student);

        context.close();
    }
}
