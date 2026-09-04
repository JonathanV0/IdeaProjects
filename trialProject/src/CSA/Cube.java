package CSA;

import java.util.Scanner;

public class Cube {

    public static double cube(int x) {
        double cubed = Math.pow(x, 3);
        return cubed;
    }
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input int to be cubed");
        int x = scanner.nextInt();
        double cubes = cube(x);
        System.out.println(cubes);
    }
}
