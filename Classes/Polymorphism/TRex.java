package Classes.Polymorphism;

public class TRex extends Dinosaur {
    public TRex(boolean isAlive) {
        this.species = "Tyrannosaurus Rex";
        this.diet = "Carnivore";
        this.lengthInMeters = 12.3;
        this.eraLived = "Late Cretaceous";
        this.isAlive = isAlive;
    }
    
    @Override
    public void examine() {
        if (isAlive) {
            System.out.println("Observing live T-Rex behavior and hunting patterns");
        } else {
            System.out.println("Analyzing T-Rex fossil teeth marks and bone structure");
        }
    }
    
    @Override
    public String getSound() {
        return isAlive ? "Loud, terrifying roar" : "N/A (Fossil)";
    }
    
    @Override
    public String getMovement() {
        return isAlive ? "Runs on two powerful legs" : "N/A (Fossil)";
    }
}
