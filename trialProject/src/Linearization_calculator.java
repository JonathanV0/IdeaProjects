/**import java.util.Scanner;

public class Linearization_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put variables in increasing independent variable");
        System.out.println("Input first independent variable");
        double X1 = scanner.nextDouble();

        System.out.println("Input first dependent variable");
        double Y1 = scanner.nextDouble();

        System.out.println("Input second X value");
        double X2 = scanner.nextDouble();

        System.out.println("Input second Y value");
        double Y2 = scanner.nextDouble();

        System.out.println("Enter last X value");
        double XF = scanner.nextDouble();

        System.out.println("Enter last Y value");
        double YF = scanner.nextDouble();

        double IK1 = Y1/X1;
        double IK2 = Y2/X2;
        double IK3 = YF/XF;

        double K1 = IK2 - IK1;

        double IIK1 = Math.pow(Y1, 2)/X1;
        double IIK2 = Math.pow(Y2, 2)/X2;
        double IIK3 = Math.pow(YF, 2)/XF;

        double K2 = IIK3-IIK1;

        double IIIK1 = Y1/Math.pow(X1, 2);
        double IIIK2 = Y1/Math.pow(X1, 2);
        double IIIK3 = YF/Math.pow(XF, 2);

        double K3 = IIIK3 - IIIK1;

        double SQRTY1 = Math.sqrt(Y1)/X1;
        double SQRTY2 = Math.sqrt(Y2)/X2;
        double SQRTYF = Math.sqrt(YF)/XF;

        double K4 = SQRTYF - SQRTY1;

        double SQRTX1 = Y1/Math.sqrt(X1);
        double SQRTX2 = Y2/Math.sqrt(X2);
        double SQRTXF = YF/Math.sqrt(XF);

        double K5 = SQRTXF - SQRTX1;

        double Y1CUB1 = Math.pow(Y1, 3)/X1;
        double Y2CUB2 = Math.pow(Y2, 3)/X2;
        double YFCUB3 = Math.pow(YF, 3)/XF;

        double K6 = YFCUB3 - Y1CUB1;

        double X1CUB1 = Y1/Math.pow(X1, 3);
        double X2CUB2 = Y1/Math.pow(X1, 3);
        double XFCUB3 = YF/Math.pow(XF, 3);

        double K7 = XFCUB3 - X1CUB1;

        if (K1 < K2 && K1 < K3 && K1 < K4 && K1 < K5 && K1 < K6 && K1 < K7) {
            System.out.println("The K value is " + K1);
        }
        else if (K2 < K1 && K2 < K3 && K2 < K4 && K2 < K5 && K2 < K6 && K2 < K7) {
            System.out.println("The K value is " + K2);
        }
        else if (K3 < K1 && K3 < K2 && K3 < K4 && K3 < K5 && K3 < K6 && K3 < K7) {
            System.out.println("The K value is " + K3);
        }
        else if (K4 < K2 && K4 < K3 && K4 < K1 && K4 < K5 && K4 < K6 && K4 < K7) {
            System.out.println("The K value is " + K4);
        }
        else if (K5 < K2 && K5 < K3 && K5 < K4 && K5 < K1 && K5 < K6 && K5 < K7) {
            System.out.println("The K value is " + K5);
        }
        else if ((K6 < K2) && (K6 < K3) && (K6 < K4) && (K6 < K5) && (K6 < K1) && (K6 < K7)) {
            System.out.println("The K value is " + K6);
        }
        else if (K7 < K2 && K7 < K3 && K7 < K4 && K7 < K5 && K7 < K6 && K7 < K1) {
            System.out.println("The K value is " + K7);
        }
        else {
            System.out.println("The number is not computing for some reason");
        }








 }

 }


        /* Get your meds */





