import java.util.Scanner;

import static java.lang.Math.*;

public class quadraticFormula_nonFunctional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input A value");
        double A = scanner.nextDouble();
        System.out.println("PLease input B value");
        double B = scanner.nextDouble();
        System.out.println("Please input C value");
        double C = scanner.nextDouble();
        double denom;
        denom = 2*A;
        double inside = pow(B, 2) - (4 * A * C);
        double numer = -B + sqrt(inside);
        double ans1 = numer / denom;
        System.out.println("Your positive answer is " + ans1);


        double denom1 = 2*A;
        double inside1 = pow(B, 2) - (4 * A * C);
        double numer1 = -B + sqrt(inside1);
        double ans2 = numer1 / denom1;
        System.out.println("Your negative answer is " + ans2);


    }
}
