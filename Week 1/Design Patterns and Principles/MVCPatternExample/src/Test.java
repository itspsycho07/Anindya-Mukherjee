public class Test {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("1", "Anindya", "A");

        // Create a Student view
        StudentView view = new StudentView();

        // Create a Student controller
        StudentController controller = new StudentController(student, view);

        // Display the initial student details
        controller.updateView();

        // Update student details
        controller.setStudentId("2");
        controller.setStudentName("Rupsha");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
