package Classes.Inheritance.Zoo.Animals;

// Abstract class that represents a general Animal
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Concrete method common to all animals
    public void eat() {
        System.out.println(name + " is eating.");
    }
}