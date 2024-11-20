package Classes.Polymorphism;

public class Stegosaurus extends Dinosaur {
    public Stegosaurus(boolean isAlive) {
        this.species = "Stegosaurus";
        this.diet = "Herbivore";
        this.lengthInMeters = 9.0;
        this.eraLived = "Late Jurassic";
        this.isAlive = isAlive;
    }
    
    @Override
    public void examine() {
        if (isAlive) {
            System.out.println("Studying live Stegosaurus plate function and behavior");
        } else {
            System.out.println("Examining Stegosaurus fossil plates and thagomizer");
        }
    }
    
    @Override
    public String getSound() {
        return isAlive ? "Low, rumbling vocalization" : "N/A (Fossil)";
    }
    
    @Override
    public String getMovement() {
        return isAlive ? "Slow, quadrupedal gait" : "N/A (Fossil)";
    }
}