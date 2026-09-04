package Math;

import java.util.Scanner;

public class turnAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double intAng = ((n - 2)*180)/n;
        double extAng = 180 - intAng;
        double turn = extAng * 2;
    }
}
