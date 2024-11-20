package Classes.Polymorphism;

public class DinosaurStudy {
    public static void main(String[] args) {
        Dinosaur[] dinosaurs = new Dinosaur[]{
            new TRex(false),      // Fossil T-Rex
            new TRex(true),       // Live T-Rex
            new Stegosaurus(false), // Fossil Stegosaurus
            new Stegosaurus(true),   // Live Stegosaurus
            new Velociraptor(true),  // Live Velociraptor
        };
        
        for (Dinosaur dino : dinosaurs) {
            dino.displayInfo();
            dino.examine();
            System.out.println("Sound: " + dino.getSound());
            System.out.println("Movement: " + dino.getMovement());
            
            if (dino instanceof PackBehavior) {
                System.out.println("Pack Behavior: " + ((PackBehavior) dino).getPackBehavior());
                }
            }
        }
    }