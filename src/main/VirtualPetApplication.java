package virtual_pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        List<VirtualPet> necessities = new ArrayList<VirtualPet>();
        Scanner gameplay = new Scanner(System.in);
        VirtualPet Pet = new VirtualPet();
        Pet.setHunger(100);
        Pet.setThirst(100);
        Pet.setTiredness(100);
        Pet.setMood(100);
        necessities.add(Pet);
        int option;
        boolean quitGame = false;
        System.out.println(
                "Welcome to Brian's WCCI Virtual Pet Program! Here you can take care of your own virtual friend :)");
        System.out.println("Please input the name of your pet: ");
        Pet.setName(gameplay.nextLine());
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Wow " + Pet.getName() + " is an awesome name.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Hope you're ready to have fun with your new virtual friend! You need to help take care of your pet "+ Pet.getName() + " by feeding them, giving them water, playing with them, and making them happy! Lets get right into things!");
        System.out.println("------------------------------------------------------------------------------------");
                while (true) {
            for (int i = 0; i < necessities.size(); i++) {
                System.out.println(Pet.getName() + "'s Current Stats!");
                System.out.println("Hunger: " + necessities.get(i).getHunger());
                System.out.println("Thirst: " + necessities.get(i).getThirst());
                System.out.println("Tiredness: " + necessities.get(i).getTiredness());
                System.out.println("Mood: " + necessities.get(i).getMood());
                System.out.println("----------------------------------------------------------");
                System.out.println("What would you like to do with " + Pet.getName() + " today?");
                System.out.println("1. Feed " + Pet.getName());
                System.out.println("2. Water " + Pet.getName());
                System.out.println("3. Play with " + Pet.getName());
                System.out.println("4. Put " + Pet.getName() + " to sleep.");
                System.out.println("5. Do Nothing");
                System.out.println("6. End Game");
            }
            boolean goodInput = false;
            for (;;) {
            if (!gameplay.hasNextInt()) {
                System.out.println("You must enter a number.");
            } else {
            option = gameplay.nextInt();
            if (option <= 6 && option > 0){
                goodInput = true;
            }
            if(goodInput){
                break;
            }
            System.out.println("Your number must be selected from the options.");
            }
            gameplay.nextLine();
                }
            switch (option) {
                case 1:
                    Pet.feed();
                    break;
                case 2:
                    Pet.drink();
                    break;
                case 3:
                    Pet.Play();
                    break;
                case 4:
                    Pet.Sleep();
                    break;
                case 5:
                    break;
                case 6:
                    gameplay.close();
                    quitGame = true;
                    break;
            }
            if (quitGame) {
                break;
            }
            Pet.tick();
        }
        gameplay.close();
        System.out.println("Thanks for Playing, " + Pet.getName() + " will miss you :).");
    }
}
