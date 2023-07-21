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

}
