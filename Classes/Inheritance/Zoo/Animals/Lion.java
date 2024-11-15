package Classes.Inheritance.Zoo.Animals;

// Concrete class that extends Animal 
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars: Roarrr!");
    }
}
