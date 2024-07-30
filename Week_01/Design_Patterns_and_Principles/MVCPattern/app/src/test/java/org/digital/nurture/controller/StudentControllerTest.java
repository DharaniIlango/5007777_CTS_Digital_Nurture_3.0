package org.digital.nurture.controller;

import org.digital.nurture.model.Student;
import org.digital.nurture.view.StudentView;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentControllerTest {

    @Test
    public void testStudentController() {
        Student student = new Student("John Doe", "12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.setStudentName("Jane Doe");
        controller.setStudentId("67890");
        controller.setStudentGrade("B");

        assertEquals("Jane Doe", controller.getStudentName());
        assertEquals("67890", controller.getStudentId());
        assertEquals("B", controller.getStudentGrade());
    }
}
