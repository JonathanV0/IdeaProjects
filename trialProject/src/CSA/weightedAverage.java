package CSA;
import java.util.Scanner;
public class weightedAverage {

    public static double weightedAverage(double avg1, double avg2, double weight1) {
        double resultAvg = avg1 * weight1 + avg2 * (1-weight1);
        return resultAvg;
    }

    public static void main (String[] args) {
        String state = "California";
        if (state.equals(state.toLowerCase()))
        { System.out.println("I guess caps don't really matter.");
        }
        else{
            System.out.println("Picky");
        }

        }
}
