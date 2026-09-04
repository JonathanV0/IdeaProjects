package physics_calculators;

import java.util.Scanner;

public class UnitsToUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double g_lb = 0.00220462;

        double m_ft = 3.28084;

        System.out.println("Enter your units");
        String unitIn = scanner.nextLine();

        System.out.println("Enter your input value");
        double valIn = scanner.nextDouble();

        System.out.println("Enter your wanted units");
        String unitOut = scanner.nextLine();

        if (unitIn.equalsIgnoreCase(unitOut)) {
            System.out.println(valIn + unitIn);
        }
        else if (unitIn.equalsIgnoreCase("gram") || unitIn.equalsIgnoreCase("grams") && unitOut.equalsIgnoreCase("pound")) {
        double valOutlb = valIn * g_lb;
        System.out.println(valOutlb);
        }
        else if (unitIn.equalsIgnoreCase("meter") && unitOut.equalsIgnoreCase("foot")) {
            double valOutFt = valIn * m_ft;
            System.out.println(valOutFt);
        }
        else if (unitIn.equalsIgnoreCase("feet") && unitOut.equalsIgnoreCase("meter")) {
            double valOutM = valIn / m_ft;
            System.out.println(valOutM + "Meters");
        }
        else {
            System.out.println("Try a different unit, like feet, meter, gram, or pound");
        }






    }
}
