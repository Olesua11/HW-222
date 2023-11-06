package org.example;

public class WildAnimal extends Animal {
    public WildAnimal(String name, Color color, String sound, Habitat habitat) {
        super(name, color, sound, habitat);
    }

    public String roamWild() {
        return getName() + " roams in its wild habitat, " + getHabitat().getName();
    }

    public void reproduce() {
        System.out.println(getName() + " reproduces in its natural habitat, " + getHabitat().getName());
    }

    public void eat() {
        eat("food");
    }

    public void eat(String food) {
        System.out.println(getName() + " eats " + food + " in its habitat.");
    }


    public  final void sleep() {
        System.out.println(getName() + " sleeps in its habitat.");
    }

    public void sleep(int hours) {
        System.out.println(getName() + " sleeps for " + hours + " hours in its habitat.");
    }
}
