package org.example.logger.service;

import lombok.extern.slf4j.Slf4j;
import org.example.logger.model.Student;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StudentService {

    public void processStudent() {
        log.trace("TRACE: Entered processStudent() method");

        log.debug("DEBUG: Creating new Student object");
        Student student = new Student(101, "Rahul", "B.Tech");

        log.info("INFO: Student created: {}", student);

        if ("MBA".equalsIgnoreCase(student.getCourse())) {
            log.warn("WARN: MBA course requires additional approvals.");
        }

        try {
            simulateError();
        } catch (Exception e) {
            log.error("ERROR: Something went wrong: {}", e.getMessage());
        }

        log.trace("TRACE: Finished processStudent() method");
    }

    private void simulateError() throws Exception {
        throw new Exception("Simulated exception in StudentService");
    }
}
