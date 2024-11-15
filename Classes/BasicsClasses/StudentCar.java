package Classes.BasicsClasses;

public class StudentCar {
    // Properties (instance variables)
    private String brand;
    private String model;
    private int currentSpeed;
    private String owner;
    
    // Static property (shared across all cars)
    private static int totalCarsCreated = 0;
    
    // Constructor
    public StudentCar(String brand, String model, String owner) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0;
        this.owner = owner;
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

    public static void main(String[] args) {
        Student student = new Student(1, "Stina-Kalle", "mT24");
        System.out.println("\n=== Student Details ===");
        System.out.println("Name: "+ student.name);
        // System.out.println("ID: "+ student.id); <-- We can't directly access the student ID, it's private!
        System.out.println("ID: " + student.getId()); // <-- We call the getId method instead, which is public!
        System.out.println("Enrolled in class: " + student.enrolledInProgram); // <-- Protected, but we are inside of the same package!

        StudentCar studentCar = new StudentCar("Afford", "CH34P", student.name); 
        System.out.println("\n\n=== Student Car ===");
        System.out.println("Owner: " + studentCar.owner + "\nBrand / Model: " + studentCar.brand + " / " + studentCar.model + "\n");
    }
}

