import java.util.Scanner;

public class CountBitPairs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(countBitPairs(n));
    }

    public static int countBitPairs(int n) {
        int count = 0;
        int previous = n & 1;
        int i;
        n >>= 1;

        while (n > 0) {
            i = n & 1;
            if (i == previous) {
                count++;
            }
            previous = i;
            n >>= 1;
        }

        return count;
    }
}
