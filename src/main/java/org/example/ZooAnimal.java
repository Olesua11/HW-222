package org.example;

public class ZooAnimal extends Animal {
    public ZooAnimal(String name, Color color, String sound, Habitat habitat) {
        super(name, color, sound, habitat);
    }

    @Override
    public String makeSound() {
        return getName() + " makes a friendly sound: " + super.makeSound();
    }

    public void interact() {
        System.out.println(getName() + " interacts with visitors.");
    }
}
