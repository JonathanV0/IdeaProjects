package CSA;

/*
* Problem 4 — Method calling another method (the key skill)
Write three methods:

triangleArea(double base, double height) — returns the area of a triangle
triangleHypotenuse(double base, double height) — returns the hypotenuse, assuming this is a right triangle with the given base and height as legs
describeTriangle(double base, double height) — a void method that calls the previous two methods and prints something like:

A triangle with base 3.0 and height 4.0 has area 6.0 and hypotenuse 5.0.
In main, call describeTriangle with at least two different triangle dimensions.
What this tests: method composition (methods calling other methods), code reuse (each helper does one job), the fundamental skill of breaking problems into pieces.
* */
import java.util.Scanner;
public class TriangleThingy {



    public static double triangleArea(double base, double height){
        double area = base * height * .5;
        return area;
    }

    public static double triangleHypo(double base, double height) {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        return hypotenuse;
    }

    public static void triangleDescriber(double base, double height) {
        double area = triangleArea(base, height);
        double hypotenuse = triangleHypo(base, height);

        System.out.print("The triangle has a base of " + base);
        System.out.print(" and the triangle has a height of " + height);
        System.out.println(", which can be used to calculate the hypotenuse, which is " + hypotenuse + " and " + area);
    }
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            double base = scanner.nextDouble();
            double height = scanner.nextDouble();
            triangleDescriber(base, height);

            triangleDescriber(3, 4);
            triangleDescriber(10, 15);
        }

}
