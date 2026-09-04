package CSA;

import java.util.Scanner;
public class Adventure
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // TODO #1. Change the adventure text below, especially the ?'s.
        // Be creative!
        System.out.println("You are on an island surrounded by water.");
        System.out.println("There is a path to the forest to the north, "
                + "the mountains to the south, desert to the east, and jungle to the west.");
        System.out.println("Which way do you want to go (n,e,s,w)?");
        String command = scanner.nextLine(); // use nextLine() in your own IDE
        if (command.equals("n"))
        {
            System.out.println("You go north.");
            forest();
        }
        else if (command.equals("s")) {
            System.out.println("You head towards the mountains");
            mountain();

        }
        else if (command.equals("e"))
        {
            System.out.println("You head towards the desert");
            desert();

        }
        else if (command.equals("w"))
        {
            System.out.println("You head towards the jungle");
            jungle();
        }
        else
        {
            System.out.println("Try n, s, e, w, instead.");
        }
        // TODO #2: Add else-ifs for command equals s, e, or w,
        // calling a method you will write below for each location.
        // Add an else error message "You can't go in that direction!"
        // Change the input below the coding area to test these.




        System.out.println("End of adventure!");
        scanner.close();
    }

    // TODO #3: Complete this method
    // north from main goes to the forest
    public static void forest()
    {
        System.out.println("You enter a dark forest and see ?");
        System.out.println("Do you want to walk e or w?");

        // Add more if/else-if statements for the next action
        //  and call your other methods to move to other locations
        String command = scanner.nextLine(); // use nextLine() in your own IDE
        if (command.equals("n"))
        {
            System.out.println("You enter onto a magical beach, but you can go no further.");
            sea();
        }
        else if (command.equals("s")) {
            System.out.println("you head towards the mountains in the distance.");
            mountain();
        }
        else if (command.equals("e")) {
            System.out.println("You head for the dry desert.");
            desert();
        }
        else if (command.equals("w")){
            System.out.println("You head towards the jungle.");
            jungle();
        }
        else {
            System.out.println("You can't go that direction!");
        }
    }

    // TODO #4: Complete this method
    // south from main or east from forest goes to the sea
    // (feel free to rename to another location of your choice)
    public static void sea()
    {
        System.out.println("The surf is crashing loudly, as if warding you away.");
        System.out.println("You can make one wish. Where do you want to go? (n, s, e, w)");
        String command = scanner.nextLine();
        if (command.equals("n"))
        {
            System.out.println("You head into the forest.");
            forest();
        }
        else if (command.equals("s")) {
            System.out.println("you head towards the mountains in the distance.");
            mountain();
        }
        else if (command.equals("e")) {
            System.out.println("You head for the dry desert.");
            desert();
        }
        else if (command.equals("w")){
            System.out.println("You head towards the jungle.");
            jungle();
        }
        else {
            System.out.println("You can't go that direction!");
        }

    }
    //
    public static void mountain() {
        System.out.println("It is really cold, why did you pick this place again?");
        System.out.println("Wait, that view! It is so awe inspiring, it feels like we could fly!");
        System.out.println("You can go n, e, or w");
        String command = scanner.nextLine();
        if (command.equals("n"))
        {
            System.out.println("You head into the forest.");
            forest();
        }
        else if (command.equals("s")) {
            System.out.println("You enter onto a magical beach that surrounds the island, but you can go no further.");
            sea();
        }
        else if (command.equals("e")) {
            System.out.println("You head for the dry desert.");
            desert();
        }
        else if (command.equals("w")){
            System.out.println("You head towards the jungle.");
            jungle();
        }
        else if (command.equals("fly")) {
            System.out.println("You are a human. You cannot fly.");
            mountain();
        }
        else {
            System.out.println("You can't go that direction!");
        }
    }
    public static void desert() {
        System.out.println("It is very dry and hot. This is not my preferred place to be.");
        System.out.println("You can go n, s, or w");

        String command = scanner.nextLine();
        if (command.equals("n"))
        {
            System.out.println("You head into the forest.");
            forest();
        }
        else if (command.equals("s")) {
            System.out.println("you head towards the mountains in the distance.");
            mountain();
        }
        else if (command.equals("e")) {
            System.out.println("You enter onto a magical beach that surrounds the island, but you can go no further.");
            sea();
        }
        else if (command.equals("w")){
            System.out.println("You head towards the jungle.");
            jungle();
        }
        else {
            System.out.println("You can't go that direction!");
        }

    }
    public static void jungle(){
        System.out.println("Wow! Look at all of the animals!");
        System.out.println("This is a great place, but others are awesome too! (n, e, s)");
        String command = scanner.nextLine();
        if (command.equals("n"))
        {
            System.out.println("You head into the forest.");
            forest();
        }
        else if (command.equals("s")) {
            System.out.println("you head towards the mountains in the distance.");
            mountain();
        }
        else if (command.equals("e")) {
            System.out.println("You head for the dry desert.");
            desert();
        }
        else if (command.equals("w")){
            System.out.println("You enter onto a magical beach that surrounds the island, but you can go no further.");
            sea();
        }
        else {
            System.out.println("You can't go that direction!");
        }

    }

    // TODO #5:  Add at least 2 more static methods for 2 more locations

}

