import java.lang.Math;
import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double smallest = findSmallest(a, b, c);

        if (isInteger(smallest)) {
            System.out.println((int) smallest);
        } else {
            System.out.println(smallest);
        }
    }

    public static double findSmallest(double a, double b, double c) {
        if (a < b) {
            if (a < c) {
                return a;
            }

            return c;
        }

        if (b < c) {
            return b;
        }

        return c;
    }

    public static boolean isInteger(double number) {
        return Math.floor(number) == number;
    }
}