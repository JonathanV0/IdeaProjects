package physics_calculators;

import java.util.Scanner;


public class MOI_calculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put length in meters, but no units");
        double length = scanner.nextDouble();

        System.out.println("Please put width in meters, but no units");
        double width = scanner.nextDouble();

        System.out.println("Please put mass, in kg but with no units");
        double mass = scanner.nextDouble();

        double MOI = (1.0/12) * mass * (Math.pow (length,2) + Math.pow (width, 2));

        System.out.println("MOI is " + MOI);
    }
}
