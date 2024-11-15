package Classes.BasicsClasses;

public class Student {
    // Private instance variables - can only be reached inside of the same class
    private int id;

    // Protected instance variables - can only be reached inside of the same package
    protected String enrolledInProgram;

    // Public instance variables - can be reached from our entire program
    public String name;
    
    public Student(int id, String name, String enrolledInProgram) {
        this.id = id;
        this.name = name;
        this.enrolledInProgram = enrolledInProgram;
    }

    // We use a getter to be able to get the id of our student
    public int getId(){
        return id;
    }
}
