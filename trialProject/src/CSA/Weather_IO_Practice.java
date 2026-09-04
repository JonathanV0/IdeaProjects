package CSA;

import java.util.Scanner;

public class Weather_IO_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        System.out.println("Please input temperature in F: ");
        temp = scanner.nextDouble();
        double windSpeed;
        System.out.println("Please input wind speed: ");
        windSpeed = scanner.nextDouble();

        if (temp >= 60.0 && windSpeed <= 10 && temp <= 100.0) {
            System.out.println("It is a great day to do running");
        }
        else if (temp > 100 && windSpeed <= 10) {
            System.out.println("It is too hot outside to go running");
        }
        else if (windSpeed > 10 && (temp >= 60 && temp <= 100)) {
            System.out.println("It is too windy outside to go running");
        }
        else if (temp < 60.0){
            System.out.println("It is too cold outside");
        }
        else {
            System.out.println("Today is a terrible day to run");
        }


    }
}
