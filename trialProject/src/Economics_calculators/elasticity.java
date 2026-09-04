package Economics_calculators;

import java.util.Scanner;

public class elasticity {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Q1");
        double Q1 = scanner.nextDouble();
        System.out.println("Enter Q2");
        double Q2 = scanner.nextDouble();
        System.out.println("Enter P1");
        double P1 = scanner.nextDouble();
        System.out.println("Enter P2");
        double P2 = scanner.nextDouble();

        double avg_Q = (Q1+Q2) / 2;
        double avg_P = (P1+P2) / 2;

        double nume = (Q2-Q1)/avg_Q;
        double denom = (P2-P1)/avg_P;

        double elast = nume/denom;

        System.out.println("The elasticity is: " + elast);
    }
}
