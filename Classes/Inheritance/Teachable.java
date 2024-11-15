package Classes.Inheritance;

public interface Teachable {
    void learn();
    default void practice() {
        System.out.println("Practicing...");
    }
}