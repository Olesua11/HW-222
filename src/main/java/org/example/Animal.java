package org.example;

public class Animal {
    private String name;
    private Color color;
    private String sound;
    private Habitat habitat;

    public Animal(String name, Color color, String sound, Habitat habitat) {
        this.name = name;
        this.color = color;
        this.sound = sound;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public String makeSound() {
        return sound;
    }

    public Habitat getHabitat() {
        return habitat;
    }
}
