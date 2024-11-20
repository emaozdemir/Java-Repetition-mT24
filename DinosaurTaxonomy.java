// Please do not try to understand all of this code, it's not worth it


// Base class for all archosaurs
abstract class Archosaur {
    protected String name;
    protected String period;
    
    public Archosaur(String name, String period) {
        this.name = name;
        this.period = period;
    }
    
    abstract String getDiet();
}

// Dinosauriformes level
abstract class Dinosauriform extends Archosaur {
    protected boolean bipedal;
    
    public Dinosauriform(String name, String period, boolean bipedal) {
        super(name, period);
        this.bipedal = bipedal;
    }
}

// Main dinosaur groups
abstract class Dinosauria extends Dinosauriform {
    protected double estimatedLength; // in meters
    
    public Dinosauria(String name, String period, boolean bipedal, double estimatedLength) {
        super(name, period, bipedal);
        this.estimatedLength = estimatedLength;
    }
}

// Two main branches
abstract class Saurischia extends Dinosauria {
    protected String hipStructure = "lizard-hipped";
    
    public Saurischia(String name, String period, boolean bipedal, double estimatedLength) {
        super(name, period, bipedal, estimatedLength);
    }
}

abstract class Ornithischia extends Dinosauria {
    protected String hipStructure = "bird-hipped";
    
    public Ornithischia(String name, String period, boolean bipedal, double estimatedLength) {
        super(name, period, bipedal, estimatedLength);
    }
}

// Saurischian subdivisions
abstract class Theropoda extends Saurischia {
    protected boolean carnivorous = true;
    
    public Theropoda(String name, String period, double estimatedLength) {
        super(name, period, true, estimatedLength); // All theropods were bipedal
    }
    
    @Override
    String getDiet() {
        return "Carnivorous";
    }
}

abstract class Sauropodomorpha extends Saurischia {
    protected boolean longNeck = true;
    
    public Sauropodomorpha(String name, String period, double estimatedLength) {
        super(name, period, false, estimatedLength); // Typically quadrupedal
    }
    
    @Override
    String getDiet() {
        return "Herbivorous";
    }
}

// Theropod subdivisions
abstract class Coelurosauria extends Theropoda {
    protected boolean feathers = true;
    
    public Coelurosauria(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

abstract class Carnosauria extends Theropoda {
    protected boolean largeSkull = true;
    
    public Carnosauria(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

// Coelurosaur subdivisions
abstract class Tyrannosauroidea extends Coelurosauria {
    protected boolean powerfulJaws = true;
    
    public Tyrannosauroidea(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

abstract class Maniraptora extends Coelurosauria {
    protected boolean grasperHands = true;
    
    public Maniraptora(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

// Maniraptoran subdivisions
abstract class Dromaeosauridae extends Maniraptora {
    protected boolean sickleClaw = true;
    
    public Dromaeosauridae(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

abstract class Avialae extends Maniraptora {
    protected boolean flightCapable;
    
    public Avialae(String name, String period, double estimatedLength, boolean flightCapable) {
        super(name, period, estimatedLength);
        this.flightCapable = flightCapable;
    }
}

// Sauropodomorph subdivisions
abstract class Prosauropoda extends Sauropodomorpha {
    protected boolean facultativeBipedal = true;
    
    public Prosauropoda(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

abstract class Sauropoda extends Sauropodomorpha {
    protected boolean quadrupedal = true;
    
    public Sauropoda(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

// Ornithischian subdivisions
abstract class Thyreophora extends Ornithischia {
    protected boolean hasArmor = true;
    
    public Thyreophora(String name, String period, double estimatedLength) {
        super(name, period, false, estimatedLength); // Typically quadrupedal
    }
    
    @Override
    String getDiet() {
        return "Herbivorous";
    }
}

abstract class Cerapoda extends Ornithischia {
    protected boolean beaked = true;
    
    public Cerapoda(String name, String period, boolean bipedal, double estimatedLength) {
        super(name, period, bipedal, estimatedLength);
    }
    
    @Override
    String getDiet() {
        return "Herbivorous";
    }
}

// Thyreophoran subdivisions
abstract class Stegosauria extends Thyreophora {
    protected boolean hasPlates = true;
    
    public Stegosauria(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

abstract class Ankylosauria extends Thyreophora {
    protected boolean hasTailClub = true;
    
    public Ankylosauria(String name, String period, double estimatedLength) {
        super(name, period, estimatedLength);
    }
}

// Cerapod subdivisions
abstract class Ornithopoda extends Cerapoda {
    protected boolean cheekTeeth = true;
    
    public Ornithopoda(String name, String period, double estimatedLength) {
        super(name, period, true, estimatedLength); // Typically bipedal
    }
}

abstract class Marginocephalia extends Cerapoda {
    protected boolean thickenedSkull = true;
    
    public Marginocephalia(String name, String period, boolean bipedal, double estimatedLength) {
        super(name, period, bipedal, estimatedLength);
    }
}

// Marginocephalian subdivisions
abstract class Pachycephalosauria extends Marginocephalia {
    protected boolean domeHead = true;
    
    public Pachycephalosauria(String name, String period, double estimatedLength) {
        super(name, period, true, estimatedLength); // Bipedal
    }
}

abstract class Ceratopsia extends Marginocephalia {
    protected boolean frill = true;
    
    public Ceratopsia(String name, String period, double estimatedLength) {
        super(name, period, false, estimatedLength); // Typically quadrupedal
    }
}

// Concrete classes for notable examples
class Tyrannosaurus extends Tyrannosauroidea {
    private double biteForce; // in Newtons
    
    public Tyrannosaurus(double biteForce) {
        super("Tyrannosaurus rex", "Late Cretaceous", 12.3);
        this.biteForce = biteForce;
    }
}

class Velociraptor extends Dromaeosauridae {
    private boolean hasFeathers = true;
    
    public Velociraptor() {
        super("Velociraptor mongoliensis", "Late Cretaceous", 2.07);
    }
}

class Bird extends Avialae {
    private boolean modernBird = true;
    
    public Bird() {
        super("Modern bird", "Modern", 0.3, true);
    }
}

class Brachiosaurus extends Sauropoda {
    private double heightAtHead; // in meters
    
    public Brachiosaurus() {
        super("Brachiosaurus altithorax", "Late Jurassic", 25.0);
        this.heightAtHead = 13.0;
    }
}

class Stegosaurus extends Stegosauria {
    private int plateCount;
    
    public Stegosaurus() {
        super("Stegosaurus stenops", "Late Jurassic", 9.0);
        this.plateCount = 17;
    }
}

class Ankylosaurus extends Ankylosauria {
    private double clubWeight; // in kg
    
    public Ankylosaurus() {
        super("Ankylosaurus magniventris", "Late Cretaceous", 10.6);
        this.clubWeight = 18.0;
    }
}

class Iguanodon extends Ornithopoda {
    private boolean thumbSpike = true;
    
    public Iguanodon() {
        super("Iguanodon bernissartensis", "Early Cretaceous", 10.0);
    }
}

class Triceratops extends Ceratopsia {
    private int hornCount = 3;
    
    public Triceratops() {
        super("Triceratops horridus", "Late Cretaceous", 8.0);
    }
}

// Example usage
public class DinosaurTaxonomy {
    public static void main(String[] args) {
        Tyrannosaurus tRex = new Tyrannosaurus(35000.0);
        Velociraptor velociraptor = new Velociraptor();
        Bird bird = new Bird();
        Brachiosaurus brachiosaurus = new Brachiosaurus();

        Ankylosaurus ankylosaurus = new Ankylosaurus();
        Iguanodon iguanodon = new Iguanodon();
        Triceratops triceratops = new Triceratops();
        
        // Example of polymorphism - We can add all the dinosaurs! 
        Dinosauria[] dinosaurs = {
            tRex, velociraptor, bird, brachiosaurus, 
             ankylosaurus, iguanodon, triceratops
        };
        
        // Print information about each dinosaur
        for (Dinosauria dino : dinosaurs) {
            System.out.println("Name: " + dino.name);
            System.out.println("Diet: " + dino.getDiet());
            System.out.println("Period: " + dino.period);
            System.out.println("Length: " + dino.estimatedLength + " meters");
            System.out.println("Bipedal: " + dino.bipedal);
            System.out.println("-------------------");
        }

        System.out.println("\nInheritance Chains:");
        System.out.println("===================");
        
        // Helper method to print inheritance chain
        printInheritanceChain(Tyrannosaurus.class, "T-Rex");
        printInheritanceChain(Triceratops.class, "Triceratops");
        printInheritanceChain(Brachiosaurus.class, "Brachiosaurus");
        printInheritanceChain(Bird.class, "Modern Bird");
    }
    
    private static void printInheritanceChain(Class<?> clazz, String dinosaurName) {
        System.out.println("\n" + dinosaurName + " inheritance chain:");
        StringBuilder chain = new StringBuilder();
        Class<?> currentClass = clazz;
        
        while (currentClass != null) {
            chain.insert(0, currentClass.getSimpleName());
            currentClass = currentClass.getSuperclass();
            if (currentClass != null) {
                chain.insert(0, " → ");
            }
        }
        
        String[] classes = chain.toString().split(" → ");
        for (int i = 0; i < classes.length; i++) {
            System.out.println("  ".repeat(i) + classes[i]);
        }
    }
}

