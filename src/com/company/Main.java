package com.company;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("Фарель");
        fish.setWeight(5);
        fish.setAge(2);
        fish.setColour("yellow");

        System.out.println("аты: " + fish.getName() +  ", " +  "салмагы: "+ fish.getWeight()  + ", " + "жашы: " + fish.getAge() + ", " + "тусу: " + fish.getColour());

        Parrot parrot = new Parrot();
        parrot.setName("Арчик");
        parrot.setWeight(2);
        parrot.setAge(3);
        parrot.setColour("green");

        System.out.println("аты: " + parrot.getName() + ", " + "салмагы: "+ parrot.getWeight() + ", " + "жашы: " + parrot.getAge() + ", " + "тусу: " + parrot.getColour());

        Cat cat = new Cat();
        cat.setName("Tommy");
        cat.setWeight(8);
        cat.setAge(7);
        cat.setColour("white");

        System.out.println("аты: " + cat.getName() + ", " + "салмагы: "+ cat.getWeight() + ", " + "жашы: " + cat.getAge() + ", " + "тусу: " + cat.getColour());

        Dog dog = new Dog();
        dog.setName("Актош");
        dog.setWeight(10);
        dog.setAge(5);
        dog.setColour("black");

        System.out.println("аты: " + dog.getName() + ", " + "салмагы: "+ dog.getWeight() + ", " + "жашы: " + dog.getAge() + ", " + "тусу: " + dog.getColour());

    }
}
