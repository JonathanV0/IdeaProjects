package Math;

import java.util.Scanner;

public class exponentialModeling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cpd Interes, Cont Intrest, Exp growth, Exp decay, half life");

        String cpdIntr = "Cpd interest";
        String contIntr = "Cont interest";
        String expG = "Exp growth";
        String expD = "Exp decay";
        String hlflf = "half life";
        String formulaType = scanner.nextLine();

        if (formulaType.equalsIgnoreCase(cpdIntr)) {
            System.out.println("Enter P value");
            double P = scanner.nextDouble();
            System.out.println("Enter rate in decimal form");
            double r = scanner.nextDouble();
            System.out.println("# of times compounded yearly");
            double n = scanner.nextDouble();
            System.out.println("number of years");
            double t = scanner.nextDouble();

            double A = P * Math.pow(1+(r/n),n * t);

            System.out.println(A);
        }
        else if (formulaType.equalsIgnoreCase(contIntr)) {

            System.out.println("Enter P value");
            double P = scanner.nextDouble();
            System.out.println("Enter rate in decimal form");
            double r = scanner.nextDouble();
            System.out.println("number of years");
            double t = scanner.nextDouble();

            double A = P * Math.pow(Math.E, r * t);

        }

        else if (formulaType.equalsIgnoreCase(expG)) {
            System.out.println("Enter P value");
            double P = scanner.nextDouble();
            System.out.println("Enter rate in decimal form");
            double r = scanner.nextDouble();
            System.out.println("amount of time");
            double t = scanner.nextDouble();
            double A = P *Math.pow((1+r), t);
            System.out.println(A);
        }
        else if (formulaType.equalsIgnoreCase(expD)) {
            System.out.println("Enter P value");
            double P = scanner.nextDouble();
            System.out.println("Enter rate in decimal form");
            double r = scanner.nextDouble();
            System.out.println("number of years");
            double t = scanner.nextDouble();
            double A = P *Math.pow((1-r), t);
            System.out.println(A);
        }
        else if (formulaType.equalsIgnoreCase(hlflf)){
            System.out.println("Enter a value");
            double a = scanner.nextDouble();
            System.out.println("number of years");
            double t = scanner.nextDouble();
            System.out.println("Enter half-life");
            double h = scanner.nextDouble();
            double A = a * Math.pow(.5, t/h);

            System.out.println(A);
        }
    }
}
