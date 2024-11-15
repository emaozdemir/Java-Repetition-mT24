package Classes.BasicsClasses;

public class Car {
    
    // Properties (instance variables)
    private String brand;
    private String color;
    private String model;
    private int currentSpeed;
    private int maxSpeed;
    
    // Static properties (shared across all cars)
    private static int totalCarsCreated = 0;
    private static String manufacturer = "MyCarFactory";
    private static final int SPEED_INCREMENT = 10; // Can you see why this is a bit problematic? 

    // Constructor
    public Car(String brand, String color, String model) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.currentSpeed = 0;
        this.maxSpeed = 180;  // Default max speed
        totalCarsCreated++;
    }
    
    // Overloaded constructor - demonstrates method overloading
    public Car(String brand, String color, String model, int maxSpeed) {
        this(brand, color, model);  // Call the other constructor
        this.maxSpeed = maxSpeed;
    }
    
    // Instance methods - unique behavior per car
    public void accelerate() {
        if (currentSpeed + SPEED_INCREMENT <= maxSpeed) {
            this.currentSpeed += SPEED_INCREMENT;
            System.out.println(getCarDetails() + " accelerated to " + currentSpeed + " km/h");
        } else {
            System.out.println(getCarDetails() + " reached max speed of " + maxSpeed + " km/h!");
        }
    }
    
    public void brake() {
        if (currentSpeed >= SPEED_INCREMENT) {
            this.currentSpeed -= SPEED_INCREMENT;
            System.out.println(getCarDetails() + " slowed down to " + currentSpeed + " km/h");
        } else {
            this.currentSpeed = 0;
            System.out.println(getCarDetails() + " has stopped");
        }
    }
    
    // Getters and setters - to ensure we have proper encapsulation
    public String getCarDetails() {
        return color + " " + brand + " " + model;
    }
    
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    // Static methods - general behavior for all cars
    public static int getTotalCarsCreated() {
        return totalCarsCreated;
    }
    
    public static String getManufacturer() {
        return manufacturer;
    }
    
    // Override toString method - method overriding
    @Override
    public String toString() {
        return String.format("%s (Speed: %d/%d km/h)", 
            getCarDetails(), currentSpeed, maxSpeed);
    }
    
    // Demo main method
    public static void main(String[] args) {
        System.out.println("Welcome to " + Car.getManufacturer() + "!\n");
        
        // Create cars using different constructors
        Car car1 = new Car("Golvo", "Blue", "Floor 2000");
        Car car2 = new Car("Daad", "Grey", "Credit Car...d");
        Car car3 = new Car("Afford", "Black", "CH34P", 150);  // Custom max speed
        
        // Demonstrate instance variables (unique to each car)
        System.out.println("=== Our New Cars ===");
        System.out.println("Car1: " + car1);  // Uses toString()
        System.out.println("Car2: " + car2);
        System.out.println("Car3: " + car3);
        
        // Demonstrate static variable (shared)
        System.out.println("\n=== Production Statistics ===");
        System.out.println("Total cars produced: " + Car.getTotalCarsCreated());
        
        // Demonstrate instance methods and different max speeds
        System.out.println("\n=== Speed Test ===");
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0 && car1.currentSpeed < car1.maxSpeed && car3.currentSpeed < car3.maxSpeed){
                System.out.println("\nSpeed still increasing...\n");
            }
            car1.accelerate();
            car3.accelerate();
        }

        System.out.println("\"=== Breaking Test ===\"");
        for (int i = 0; i < 10; i++) {
            car3.brake();
        }
        
        System.out.println("\n=== Final Status ===");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}