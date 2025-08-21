package InstancePractice.dog_project;

public class Dog {
    String breed;
    int avgAge;
    String speed;
    String color;
    String size;
    String additionalFacts;

    public Dog(String breed, int avgAge, String speed, String color, String size, String additionalFacts) {
        this.breed = breed;
        this.avgAge = avgAge;
        this.speed = speed;
        this.color = color;
        this.size = size;
        this.additionalFacts = additionalFacts;

    }
    public void printInfo() {
        System.out.println(breed + "s can live to " + avgAge + " years; " + breed + "s can run " + speed +
                ". " + breed + "s are " + color + ". They are also " + size +
                ". A fun fact is " + additionalFacts + ".");
    }



}
