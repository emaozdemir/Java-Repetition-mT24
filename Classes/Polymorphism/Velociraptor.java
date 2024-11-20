package Classes.Polymorphism;

public class Velociraptor extends Dinosaur implements PackBehavior {
    public Velociraptor(boolean isAlive) {
        this.species = "Velociraptor";
        this.diet = "Carnivore";
        this.lengthInMeters = 2.0;
        this.eraLived = "Late Cretaceous";
        this.isAlive = isAlive;
    }

    @Override
    public void examine() {
        if (isAlive) {
            System.out.println("Observing pack hunting and agile movement of Velociraptor");
        } else {
            System.out.println("Analyzing Velociraptor fossil claws and bone structure");
        }
    }

    @Override
    public String getSound() {
        return isAlive ? "Screeching, sharp call" : "N/A (Fossil)";
    }

    @Override
    public String getMovement() {
        return isAlive ? "Fast, agile, running on two legs" : "N/A (Fossil)";
    }

    @Override
    public String getPackBehavior() {
        return isAlive ? "Moves and hunts in packs" : "N/A (Fossil)";
    }
}
