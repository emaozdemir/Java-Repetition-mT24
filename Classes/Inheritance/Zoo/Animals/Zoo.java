package Classes.Inheritance.Zoo.Animals;
import Classes.Inheritance.Zoo.Behaviours.*;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo the Lion");
        Animal parrot = new Parrot("Polly the Parrot");
        Animal elephant = new Elephant("Ella the Elephant");
        Duck duck = new Duck("Donald the Duck");

        // Demonstrate polymorphism
        Animal[] animals = {lion, parrot, elephant, duck};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
        }

        // Using interface
        Flyable[] flyingAnimals = { (Flyable) parrot, duck };
        for (Flyable flyingAnimal : flyingAnimals) {
            flyingAnimal.fly();
        }

        Swimmable[] swimmingAnimals = {duck};
        for (Swimmable swimmingAnimal : swimmingAnimals) {
            swimmingAnimal.swim();
        }
    }
}
