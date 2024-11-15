package Classes.Inheritance.Zoo.Animals;

class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets: Prrrr!");
    }
}