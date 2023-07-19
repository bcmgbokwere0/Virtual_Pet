package virtual_pet;

import java.util.HashMap;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner gameplay = new Scanner(System.in);

        HashMap<String, VirtualPet> petCollections = new HashMap<String, VirtualPet>();

        int option;
        int petSelection;
        boolean quitGame = false;
        boolean goodInput = false;

        System.out.println(
                "Welcome to Brian's WCCI Virtual Pet Shelter! Here we take care of our virtual communities's virtual pets.");

        System.out.println(
                "Thank you for choosing to volunteer with us and for admitting your own pet. Please input the name of your pet ");

        String tempString = gameplay.nextLine();

        petCollections.put(tempString, new VirtualPet(tempString));

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Wow " + petCollections.get(tempString).getName() + " is an awesome name.\n");

        System.out.println(
                "Hope you're ready to have fun working in our shelter! We need you to help take care of "
                        + petCollections.get(tempString).getName()
                        + " and others by feeding them, giving them water, playing with them, and making them happy! Be prepared for people to also drop off more pets or adopt! Lets get right into things!");

        System.out.println("------------------------------------------------------------------------------------");

        while (true) {
            System.out.println("Current Stats for all pets:");

            System.out.println("Pets |Hunger |Thirst |Mood |Tiredness ");

            System.out.println("-----|-------|-------|-----|--------");

            // % = format specifier
            // - = going right to left, not left to right
            // s = placeholder for the string we pass
            // 5 = number spaces we want as padding

            // this will loop through each pet, and print out name, hunger, etc for each
            for (VirtualPet pet : petCollections.values()) {
                System.out.print(String.format("%-" + 5 + "s", pet.getName()));

                System.out.print("|");

                System.out.print(String.format("%-" + 5 + "s", pet.getHunger()));

                System.out.print("  |");

                System.out.print(String.format("%-" + 5 + "s", pet.getThirst()));

                System.out.print("  |");

                System.out.print(String.format("%-" + 5 + "s", pet.getTiredness()));

                System.out.print("|");
                
                System.out.println(String.format("%-" + 5 + "s", pet.getMood()));
            }

            System.out.println("----------------------------------------------------------");

            System.out.println("What would you like to do today?");

            System.out.println("1. Feed all the pets");

            System.out.println("2. Give water to all pets");

            System.out.println("3. Play with a pet");

            System.out.println("4. Put all pets to sleep.");

            System.out.println("5. Admit a pet");

            System.out.println("6. Adopt a pet");

            System.out.println("7. End Game");

            while (true) {
                if (!gameplay.hasNextInt()) {

                    System.out.println("You must enter a number.");
                } else {
                    option = gameplay.nextInt();

                    if (option <= 7 && option > 0) {
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
                            "You fed all the pets! They all really enjoyed the food.");

                    System.out.println("All pets hunger Levels Increased by 20.");

                    System.out.println("----------------------------------------------------------");

                    petCollections.forEach((name, pet) -> pet.feed());

                    break;

                case 2:
                    System.out.println("----------------------------------------------------------");

                    System.out
                            .println("You gave all the pets a refreshing bowl of water.");

                    System.out.println("Thirst Level Increased by 20.");

                    System.out.println("----------------------------------------------------------");

                    petCollections.forEach((name, pet) -> pet.drink());
                    break;

                case 3:
                    System.out.println("----------------------------------------------------------");
                    petSelection = gameplay.nextInt();
                    while (true) {
                        // setting up a while loop and switch statement to pick between pets in a
                        // Map/collection.
                        switch (petSelection) {

                        }
                        break;
                    }

                    System.out.println("You and " + petCollections.get(tempString).getName()
                            + " played a fun game of virtual volleyball. \033[3m You let them win...\033[0m");

                    System.out.println("Mood Increased by 30.");

                    System.out.println("----------------------------------------------------------");

                    // This case needs to pick a singular pet, maybe have an option for "play with
                    // all" too?
                    // petCollections.forEach((name, pet) -> pet.play());
                    break;

                case 4:
                    System.out.println("----------------------------------------------------------");

                    System.out.println(
                            "You tucked all of the pets into their virtual beds.");

                    System.out.println("Pets became well rested.");

                    System.out.println("----------------------------------------------------------");

                    petCollections.forEach((name, pet) -> pet.sleep());
                    break;

                case 5:
                    System.out.println("Whats the name of the new pet we will admit?");

                    tempString = gameplay.next();

                    petCollections.put(tempString, new VirtualPet(tempString));

                    break;

                case 6:
                    System.out.println("Which pet will we welcome to a new happy family?");
                    for (VirtualPet pet : petCollections.values()) {
                        System.out.println((pet.getName()));
                    }

                    tempString = gameplay.next();

                    petCollections.remove(tempString);

                    System.out.println(
                            "Say goodbye to " + tempString + "! Hope they're happy in their new loving virtual home!");

                    break;

                case 7:
                    gameplay.close();
                    quitGame = true;
                    break;
            }

            if (quitGame) {
                break;
            }

            petCollections.forEach((name, pet) -> pet.tick());
        }

        gameplay.close();
        System.out.println("Thanks for Playing, the pets will miss you :).");
    }

}
