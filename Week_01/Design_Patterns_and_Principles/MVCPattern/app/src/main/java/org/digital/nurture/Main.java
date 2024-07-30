package org.digital.nurture;

import org.digital.nurture.controller.StudentController;
import org.digital.nurture.model.Student;
import org.digital.nurture.view.StudentView;

public class Main {
    public static void main(String[] args) {
        Student model = new Student("John Doe", "12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
