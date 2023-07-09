package virtual_pet;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int tiredness;
    private int mood;

    // Constructor

    public VirtualPet() {
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        System.out.println("----------------------------------------------------------");
        System.out.println("You gave " + getName() + " their favorite food! They seemed to really enjoy it...");
        System.out.println("Hunger Level Increased by 20.");
        System.out.println("----------------------------------------------------------");
        setHunger(getHunger() + 20);
    }

    public void drink() {
        System.out.println("----------------------------------------------------------");
        System.out.println("You gave " + getName() + " a glass of water. They really chugged it down...");
        System.out.println("Thirst Level Increased by 20.");
        System.out.println("----------------------------------------------------------");
        setThirst(getThirst() + 20);
    }

    public void Play() {
        System.out.println("----------------------------------------------------------");
        System.out.println("You and " + getName() + " played a fun game of virtual volleyball. \033[3m You let them win...\033[0m");
        System.out.println("Mood Increased by 30.");
        System.out.println("----------------------------------------------------------");
        setMood(getMood() + 30);
    }

    public void Sleep() {
        System.out.println("----------------------------------------------------------");
        System.out.println("You tucked " + getName() + " into their virtual bed, they really got comfortable...");
        System.out.println(getName() + " became well rested.");
        System.out.println("----------------------------------------------------------");
        setTiredness(100);
    }

}
