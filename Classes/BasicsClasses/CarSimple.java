package Classes.BasicsClasses;

public class CarSimple {
    // Properties (instance variables)
    private String brand;
    private String model;
    private int currentSpeed;
    
    // Static property (shared across all cars)
    private static int totalCarsCreated = 0;
    
    // Constructor
    public CarSimple(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0;
        totalCarsCreated++;
    }
    
    // Instance method - unique behavior per car
    public void accelerate() {
        this.currentSpeed += 10;
    }
    
    // Static method - general behavior for all cars
    public static int getTotalCarsCreated() {
        return totalCarsCreated;
    }
}

