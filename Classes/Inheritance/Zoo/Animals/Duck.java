package Classes.Inheritance.Zoo.Animals;
import Classes.Inheritance.Zoo.Behaviours.*;


public class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " quacks: Quack!");
    }
    
    @Override
    public void fly() {
        System.out.println(getName() + " is flying over the pond.");
    }
    
    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in the pond.");
    }
}