package org.digital.nurture.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentGettersAndSetters() {
        Student student = new Student("John Doe", "12345", "A");

        student.setName("Jane Doe");
        student.setId("67890");
        student.setGrade("B");

        assertEquals("Jane Doe", student.getName());
        assertEquals("67890", student.getId());
        assertEquals("B", student.getGrade());
    }
}
