package Classes.Inheritance;

public class Demo {
    public static void main(String[] args) {
        // Create a regular student
        Student student = new Student("John", 1001);
        student.study();  // Output: John is studying

        // Demonstrate polymorphism by creating a polyStudent from student
        Student polyStudent = new GraduateStudent("Bob", 2002, "AI Ethics");
        polyStudent.study(); // Will call GraduateStudent's study method
        
    
        // Create a graduate student
        GraduateStudent gradStudent = new GraduateStudent("Alice", 2001, "Machine Learning");
        gradStudent.study();  // Output: Alice is studying
                             //  Working on thesis: Machine Learning
        gradStudent.learn(); // Output: Alice is learning advanced concepts
        gradStudent.practice(); // Output: Practicing...
        

        // instanceof and casting
        if (polyStudent instanceof GraduateStudent) {
            GraduateStudent castedGrad = (GraduateStudent) polyStudent;
            System.out.println("Thesis: " + castedGrad.getThesis());
        }
    }
}