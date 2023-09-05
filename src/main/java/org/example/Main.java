package org.example;


public class Main {
    public static void main(String[] args) {
        Dog miha = new Dog("Miha", 2, "Female", 50);
        Plate plate = new Plate(100);
        Dinner dinner = new Dinner(miha, plate);
        System.out.println(miha.hunger);
        miha.run(150);
        miha.swim(15);
    }
}