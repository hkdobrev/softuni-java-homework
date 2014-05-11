import java.util.Scanner;

class SumTwoNumbers {

    public static void main(String[] args) {
        Integer firstInteger;
        Integer secondInteger;
        Integer sum;
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        firstInteger = Integer.parseInt(scanIn.nextLine());
        System.out.print("Enter second integer: ");
        secondInteger = Integer.parseInt(scanIn.nextLine());
        scanIn.close();

        sum = firstInteger + secondInteger;
        System.out.println("The sum of " + firstInteger + " and " + secondInteger + " is: " + sum);
    }
}
