package virtual_pet;

public class VirtualPet extends VirtualPetShelter {
    private String name;
    private String description;

    // Constructor

    public VirtualPet() {
        setHunger(100);
        setThirst(100);
        setTiredness(100);
        setMood(100);
    }

    public VirtualPet(String newName, String newDesc) {
        setName(newName);
        setDesc(newDesc);
        setHunger(100);
        setThirst(100);
        setTiredness(100);
        setMood(100);
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    // Methods
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

}
