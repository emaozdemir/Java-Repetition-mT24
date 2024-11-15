package Classes.Inheritance.Zoo.Animals;

import Classes.Inheritance.Zoo.Behaviours.Flyable;

// Concrete class that extends Animal and implements Flyable
class Parrot extends Animal implements Flyable {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawks: Squawk!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying high in the sky!");
    }
}