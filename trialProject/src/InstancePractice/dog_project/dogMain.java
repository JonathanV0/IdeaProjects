package InstancePractice.dog_project;

import java.util.Scanner;


public class dogMain {

    public static void main(String[] args) {
        String breed;
        int avgAge;
        String speed;
        String color;
        String size;
        String additionalFacts;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the dog breed: ");
        breed = scanner.nextLine();

        Dog gs = new Dog("German Shepard", 12, "very fast", "Black and brown", "These dogs are very large", "These dogs, along with Belgian Malinois are often used in the military");
        Dog corgi = new Dog("Corgi", 15, "slow", "Brown and white", "size", "Queen Elizabeth II owned several of these dogs");
        Dog samoyed = new Dog("Samoyed", 13, "fast", "white", "large", "they are cute dogs ig");
        if (breed.equalsIgnoreCase("German Shepard")) {
            gs.printInfo();
        }
        else if (breed.equalsIgnoreCase("Corgi")) {
            corgi.printInfo();
        }
        else if (breed.equalsIgnoreCase("samoyed")) {
            samoyed.printInfo();
        }
        else {
            System.out.println("This doge is not in the code");
        }


    }
}



//        if (breed.equalsIgnoreCase("German Shepard")) {
//            gShepard dog = new gShepard();
//            System.out.println("German Shepards can live to " + dog.avgAge +
//                    "; German Shepards can run very fast, " + dog.speed +
//                    ". German Shepards are " + dog.color + "." + "They are also" + dog.size + ". A fun fact is " + dog.additionalFacts + ".");
//        } else if (breed.equalsIgnoreCase("Corgi")) {
//            corgi dog = new corgi();
//            System.out.println("Corgis can live to " + dog.avgAge + " , are " + dog.speed +
//                    ", are " + dog.color + " , and" + dog.size + ". A fun fact is " + dog.additionalFacts + ".");
//        } else if (breed.equalsIgnoreCase("Samoyed")) {
//            samoyed dog = new samoyed();
//            System.out.println("Samoyeds can live to " + dog.avgAge + " , are " + dog.speed +
//                    ", are " + dog.color + " , and" + dog.size + ". A fun fact is " + dog.additionalFacts + ".");
//
//
//        }
//        else {
//            System.out.println("The dog breed has not been added yet, contact maker");
//            int counter = 0;
//            while (counter < 50000000) {
//                System.out.println("hello");
//                counter++;
//            }
//        }
//
//    }
//}
