import java.util.Scanner;

public class Pythagorean_Theorem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'A' value");
        double A = scanner.nextDouble();
        System.out.println("Enter B value");
        double B = scanner.nextDouble();
        double ans1 = Math.pow(A, 2) + Math.pow(B, 2);
        double finalAnswer = Math.sqrt(ans1);
        System.out.println("C is " + finalAnswer);

    }
}
