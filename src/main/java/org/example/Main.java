package org.example;

public class Main {
    public static void main(String[] args) {
        Habitat jungle = new Habitat("Jungle");
        Habitat savanna = new Habitat("Savanna");

        WildAnimal lion = new WildAnimal("Lion", Color.GOLDEN, "Roar", savanna);
        WildAnimal tiger = new WildAnimal("Tiger", Color.ORANGE, "Roar", jungle);

        ZooAnimal parrot = new ZooAnimal("Parrot", Color.COLORFUL, "Squawk", jungle);

        System.out.println("Wild Animals:");
        System.out.println(lion.getName() + " lives in " + lion.getHabitat().getName());
        lion.reproduce();
        lion.eat();
lion.sleep();
        System.out.println(tiger.getName() + " lives in " + tiger.getHabitat().getName());
        tiger.reproduce();
        tiger.eat();
tiger.sleep();
System.out.println("\nZoo Animals:");
        System.out.println(parrot.getName() + " lives in " + parrot.getHabitat().getName());
        System.out.println("It makes a sound: " + parrot.makeSound());
        parrot.interact();
    }
}
