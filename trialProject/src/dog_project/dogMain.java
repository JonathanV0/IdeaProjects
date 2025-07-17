package dog_project;

import java.util.Scanner;

public class dogMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String breed;


        System.out.println("Please enter the dog breed: ");
        breed = scanner.nextLine();

        Dog gS = new Dog("German Shepard", 12, ..);
        gs.printInfo();

        if (breed.equalsIgnoreCase("German Shepard")) {
            gShepard dog = new gShepard();
            System.out.println("German Shepards can live to " + dog.avgAge +
                    "; German Shepards can run very fast, " + dog.speed +
                    ". German Shepards are " + dog.color + "." + "They are also" + dog.size + ". A fun fact is " + dog.additionalFacts + ".");
        } else if (breed.equalsIgnoreCase("Corgi")) {
            corgi dog = new corgi();
            System.out.println("Corgis can live to " + dog.avgAge + " , are " + dog.speed +
                    ", are " + dog.color + " , and" + dog.size + ". A fun fact is " + dog.additionalFacts + ".");
        } else if (breed.equalsIgnoreCase("Samoyed")) {
            samoyed dog = new samoyed();
            System.out.println("Samoyeds can live to " + dog.avgAge + " , are " + dog.speed +
                    ", are " + dog.color + " , and" + dog.size + ". A fun fact is " + dog.additionalFacts + ".");


        }
        else {
            System.out.println("The dog breed has not been added yet, contact maker");
            int counter = 0;
            while (counter < 50000000) {
                System.out.println("hello");
                counter++;
            }
        }

    }
}