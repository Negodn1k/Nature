package org.example;

public class Dinner {
    private Animal hungerAnimal;
    private Plate plate;

    public Dinner(Animal hungerAnimal, Plate plate) {
        this.hungerAnimal = hungerAnimal;
        this.plate = plate;
        eat();
    }

    private int eat() {
        if (plate.getCapacity() - hungerAnimal.hunger >= 0) {
            System.out.println("Животное поело");
            plate.setCapacity(plate.getCapacity() - hungerAnimal.hunger);
            hungerAnimal.hunger = 0;
        }
        return plate.getCapacity();
    }
}
