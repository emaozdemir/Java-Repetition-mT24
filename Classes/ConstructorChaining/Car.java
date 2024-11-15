package Classes.ConstructorChaining;


public class Car {
    // Properties (instance variables)
    private String brand;
    private String model;
    private String color;
    private int year;
    private double price;
    private String fuelType;
    private int maxSpeed;
    
    private static int totalCarsCreated = 0;

    // All other constructors will chain to this one
    public Car(String brand, String model, String color, int year, 
               double price, String fuelType, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        totalCarsCreated++;
    }

    // Constructor for a car with default fuel type (petrol)
    // Notice we don't increment totalCarsCreated here - it's handled by the main constructor
    public Car(String brand, String model, String color, int year, 
               double price, int maxSpeed) {
        this(brand, model, color, year, price, "Petrol", maxSpeed);

    }

    // Constructor for a car with default max speed (180)
    public Car(String brand, String model, String color, int year, double price) {
        this(brand, model, color, year, price, "Petrol", 180);
    }

    // Constructor for a current year car
    public Car(String brand, String model, String color, double price) {
        this(brand, model, color, 2024, price);
    }

    // Constructor with just brand and model (demo car)
    public Car(String brand, String model) {
        this(brand, model, "White", 2024, 25000.0);
    }

    // Default constructor - creates a basic demo car
    public Car() {
        this("Demo Brand", "Demo Model");
    }

    public String getCarDetails() {
        return String.format("""
            Car Details:
            Brand: %s
            Model: %s
            Color: %s
            Year: %d
            Price: $%.2f
            Fuel Type: %s
            Max Speed: %d km/h""", 
            brand, model, color, year, price, fuelType, maxSpeed);
    }

    public static int getTotalCarsCreated() {
        return totalCarsCreated;
    }

    // Demo main method
    public static void main(String[] args) {
        // Create cars using different constructors
        System.out.println("=== Creating Cars with Different Constructors ===\n");

        // Using most detailed constructor
        Car car1 = new Car("Brolvo", "xZyzz90", "Protein Brown", 2024, 55000.0, "Hybrid", 200);
        System.out.println("Car 1 (All details specified):");
        System.out.println(car1.getCarDetails());
        System.out.println("\nTotal cars created: " + Car.getTotalCarsCreated());

        // Using constructor with default fuel type
        Car car2 = new Car("BMVroom", "M3Gusto", "Midnight Raven", 2024, 65000.0, 250);
        System.out.println("\nCar 2 (Default fuel type):");
        System.out.println(car2.getCarDetails());
        System.out.println("\nTotal cars created: " + Car.getTotalCarsCreated());

        // Using constructor with default max speed
        Car car3 = new Car("Toyoda", "R2D2", "Space Silver", 2024, 35000.0);
        System.out.println("\nCar 3 (Default max speed):");
        System.out.println(car3.getCarDetails());
        System.out.println("\nTotal cars created: " + Car.getTotalCarsCreated());

        // Using constructor with current year
        Car car4 = new Car("Hondont", "Civicalypse", "Fiery Red", 32000.0);
        System.out.println("\nCar 4 (Current year):");
        System.out.println(car4.getCarDetails());
        System.out.println("\nTotal cars created: " + Car.getTotalCarsCreated());

        // Using basic constructor (demo car)
        Car car5 = new Car("Fjord", "Muskot");
        System.out.println("\nCar 5 (Basic demo car):");
        System.out.println(car5.getCarDetails());
        System.out.println("\nTotal cars created: " + Car.getTotalCarsCreated());

        // Using default constructor
        Car car6 = new Car();
        System.out.println("\nCar 6 (Default constructor):");
        System.out.println(car6.getCarDetails());
        System.out.println("\nTotal cars created: " + Car.getTotalCarsCreated());
    }
}