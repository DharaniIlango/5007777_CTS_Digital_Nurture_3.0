package org.digital.nurture.view;

import org.digital.nurture.model.Student;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class StudentViewTest {

    @Test
    public void testDisplayStudentDetails() {
        Student student = new Student("John Doe", "12345", "A");
        StudentView view = new StudentView();

        assertDoesNotThrow(() -> view.displayStudentDetails(student));
    }
}
