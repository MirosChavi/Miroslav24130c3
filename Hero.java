package rpg;

import java.util.Random;

public abstract class Hero { // Tworzymy zmienne
    protected String name;
    protected int health;
    protected int strength;
    protected static Random rand = new Random();

    public Hero(String name, int health, int strength) { // używamy konstructorza
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() { // Przy pomocy alt inów szybko generujemy taki kod za pomocą getterów i setterów
        return name;
    }

    public void setName(String name) { // Przy pomocy alt inów szybko generujemy taki kod za pomocą getterów i setterów
        this.name = name;
    }

    public int getHealth() { // Przy pomocy alt inów szybko generujemy taki kod za pomocą getterów i setterów
        return health;
    }

    public void setHealth(int health) { // Przy pomocy alt inów szybko generujemy taki kod za pomocą getterów i setterów
        this.health = health;
    }

    public int getStrength() { // Przy pomocy alt inów szybko generujemy taki kod za pomocą getterów i setterów
        return strength;
    }

    public void setStrength(int strength) { // Przy pomocy alt inów szybko generujemy taki kod za pomocą getterów i setterów
        this.strength = strength;
    }

    public abstract void attack(Hero another);

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
