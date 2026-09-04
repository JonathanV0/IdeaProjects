package Math;

import java.util.Scanner;

public class RadiansAndDegrees {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        // Fixed typo: "too" -> "to"
        System.out.println("Degrees to radians? Y/N");

        // FIX 1: Use String instead of char to handle nextLine() and equalsIgnoreCase
        String ans = scanner.next();

        if (ans.equalsIgnoreCase("Y")) {
            System.out.println("Enter degrees:");
            double deg = scanner.nextDouble();

            // FIX 2: Correct Formula using Math.PI
            // Formula: Degrees * (PI / 180)
            double rad = deg * (Math.PI / 180);

            System.out.println(deg + " degrees is " + rad + " radians.");
        }
        else {
            System.out.println("Enter radians:");

            // FIX 3: Use double, because radians are decimals (e.g., 3.14)
            double rad = scanner.nextDouble();

            // FIX 4: Correct Formula
            // Formula: Radians * (180 / PI)
            double deg = rad * (180 / Math.PI);

            System.out.println(rad + " radians is " + deg + " degrees.");
        }

        scanner.close(); // Good practice to close the scanner
    }
}