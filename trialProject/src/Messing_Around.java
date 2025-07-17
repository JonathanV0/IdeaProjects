import java.util.Scanner;

public class Messing_Around {
    public static void main (String[] args) {


        float pi = 3.14159f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius of circle: ");
        double radius = scanner.nextDouble();
        double area = pi * Math.pow(radius, 2);
        System.out.println("Your area is " + area);







    }
}
