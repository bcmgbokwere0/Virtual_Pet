package virtual_pet;

import java.util.HashMap;

public class VirtualPetShelter {
    private int hunger;
    private int thirst;
    private int tiredness;
    private int mood;
    HashMap<String, VirtualPet> petCollections;

    // Constructor
    public VirtualPetShelter() {
        petCollections = new HashMap<String, VirtualPet>();

    }

    // Getters and Setters
    public VirtualPet getPet(String name) {
        return petCollections.get(name);
    }

    public void setPet(VirtualPet newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    // Methods

    public HashMap<String, VirtualPet> allPets() {
        return petCollections;
    }

    public void addPet(VirtualPet newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void removePet(VirtualPet newPet) {
        this.petCollections.remove(newPet.getName(), newPet);
    }

    public void feed() {
        setHunger(getHunger() + 20);
    }

    public void drink() {
        setThirst(getThirst() + 20);
    }

    public void play() {
        setMood(getMood() + 30);
    }

    public void sleep() {
        setTiredness(100);
    }

    public void tick() {
        setHunger(getHunger() - 5);

        setThirst(getThirst() - 5);

        setTiredness(getTiredness() - 5);

        if (getHunger() >= 100 || getThirst() >= 100) {
            setMood(getMood() - 0);
        } else if (getHunger() >= 70 || getThirst() >= 70) {
            setMood(getMood() - 5);
        } else if (getHunger() >= 40 || getThirst() >= 40) {
            setMood(getMood() - 10);
        } else if (getHunger() >= 20 || getThirst() >= 20) {
            setMood(getMood() - 20);
        }
    }
}