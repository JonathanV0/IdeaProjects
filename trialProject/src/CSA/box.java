package CSA;

import java.util.Scanner;

public class box {

    public static String PrintLine(String word) {
        int n = word.length() + 4;

        String line = "";
        for (int i = 0; i < n; i++) {
            line = line + "*";
        }
        return line;
    }


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(PrintLine(word));
        System.out.println("* " + word + " *");
        System.out.println(PrintLine(word));


    }

}
