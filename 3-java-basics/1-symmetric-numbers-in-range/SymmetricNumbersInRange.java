import java.util.Scanner;

public class SymmetricNumbersInRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            if (isSymmetric(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static boolean isSymmetric(int number) {
        String s = Integer.toString(number);
        int length = s.length();

        if (length < 2) {
            return true;
        }

        for (int i = 0; i < (int) Math.floor(length / 2); i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}