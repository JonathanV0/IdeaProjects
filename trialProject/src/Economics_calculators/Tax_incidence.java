package Economics_calculators;

import java.util.Scanner;

public class Tax_incidence {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Q1 for demand");
        double Q1D = scanner.nextDouble();
        System.out.println("Enter Q2 for demand");
        double Q2D = scanner.nextDouble();
        System.out.println("Enter P1 for demand");
        double P1D = scanner.nextDouble();
        System.out.println("Enter P2 for demand");
        double P2D = scanner.nextDouble();

        double avg_QD = (Q1D+Q2D) / 2;
        double avg_PD = (P1D+P2D) / 2;

        double numeD = (Q2D-Q1D)/avg_QD;
        double denomD = (P2D-P1D)/avg_PD;

        double elastD = numeD/denomD;

        System.out.println("Enter Q1 for supply");
        double Q1S = scanner.nextDouble();
        System.out.println("Enter Q2 for supply");
        double Q2S = scanner.nextDouble();
        System.out.println("Enter P1 for supply");
        double P1S = scanner.nextDouble();
        System.out.println("Enter P2 for supply");
        double P2S = scanner.nextDouble();

        double avg_Q = (Q1S+Q2S) / 2;
        double avg_P = (P1S+P2S) / 2;

        double numeS = (Q2S-Q1S)/avg_Q;
        double denomS = (P2S-P1S)/avg_P;

        double elastS = numeS/denomS;

        double con_tax_incid = 100*(elastS/(elastD+elastS));

        double prod_tax_incid = 100*(elastD/(elastD+elastS));

    }
}
