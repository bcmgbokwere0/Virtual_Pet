package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner gameplay = new Scanner(System.in);

        VirtualPet Pet = new VirtualPet();

        int option;
        boolean quitGame = false;
        boolean goodInput = false;

        System.out.println(
                "Welcome to Brian's WCCI Virtual Pet Program! Here you can take care of your own virtual friend :)");

        System.out.println("Please input the name of your pet: ");

        Pet.setName(gameplay.nextLine());

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Wow " + Pet.getName() + " is an awesome name.\n");

        System.out.println(
                "Hope you're ready to have fun with your new virtual friend! You need to help take care of your pet "
                        + Pet.getName()
                        + " by feeding them, giving them water, playing with them, and making them happy! Lets get right into things!");

        System.out.println("------------------------------------------------------------------------------------");

        while (true) {
            System.out.println(Pet.getName() + "'s Current Stats!");

            System.out.println("Hunger: " + Pet.getHunger());

            System.out.println("Thirst: " + Pet.getThirst());

            System.out.println("Tiredness: " + Pet.getTiredness());

            System.out.println("Mood: " + Pet.getMood());

            System.out.println("----------------------------------------------------------");

            System.out.println("What would you like to do with " + Pet.getName() + " today?");

            System.out.println("1. Feed " + Pet.getName());

            System.out.println("2. Water " + Pet.getName());

            System.out.println("3. Play with " + Pet.getName());

            System.out.println("4. Put " + Pet.getName() + " to sleep.");

            System.out.println("5. Do Nothing");

            System.out.println("6. End Game");

            while (true) {
                if (!gameplay.hasNextInt()) {

                    System.out.println("You must enter a number.");
                } else {
                    option = gameplay.nextInt();

                    if (option <= 6 && option > 0) {
                        goodInput = true;
                    }
                    if (goodInput) {
                        break;
                    }

                    System.out.println("Your number must be selected from the options.");

                }

                gameplay.nextLine();
            }
            switch (option) {

                case 1:
                    System.out.println("----------------------------------------------------------");

                    System.out.println(
                            "You gave " + Pet.getName() + " their favorite food! They seemed to really enjoy it...");

                    System.out.println("Hunger Level Increased by 20.");

                    System.out.println("----------------------------------------------------------");

                    Pet.feed();

                    break;

                case 2:
                    System.out.println("----------------------------------------------------------");

                    System.out
                            .println("You gave " + Pet.getName() + " a glass of water. They really chugged it down...");

                    System.out.println("Thirst Level Increased by 20.");

                    System.out.println("----------------------------------------------------------");

                    Pet.drink();
                    break;

                case 3:
                    System.out.println("----------------------------------------------------------");

                    System.out.println("You and " + Pet.getName()
                            + " played a fun game of virtual volleyball. \033[3m You let them win...\033[0m");

                    System.out.println("Mood Increased by 30.");

                    System.out.println("----------------------------------------------------------");

                    Pet.play();
                    break;

                case 4:
                    System.out.println("----------------------------------------------------------");

                    System.out.println(
                            "You tucked " + Pet.getName() + " into their virtual bed, they really got comfortable...");

                    System.out.println(Pet.getName() + " became well rested.");

                    System.out.println("----------------------------------------------------------");

                    Pet.sleep();
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
