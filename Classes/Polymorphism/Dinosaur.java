package Classes.Polymorphism;

public abstract class Dinosaur {
    String species;
    String diet;
    double lengthInMeters;
    String eraLived;
    boolean isAlive;
    
    public abstract void examine();
    public abstract String getSound();
    public abstract String getMovement();
    
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Diet: " + diet);
        System.out.println("Length: " + lengthInMeters + " meters");
        System.out.println("Era: " + eraLived);
        System.out.println("Status: " + (isAlive ? "Alive" : "Fossil"));
    }
}
