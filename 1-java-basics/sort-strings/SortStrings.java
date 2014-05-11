import java.util.Scanner;
import java.util.Arrays;

class SortStrings {

    public static void main(String[] args) {
        Integer numberOfStrings;
        Integer i;
        Scanner scanIn = new Scanner(System.in);
        numberOfStrings = Integer.parseInt(scanIn.nextLine());

        if (numberOfStrings <= 0) {
            return;
        }

        String[] strings = new String[numberOfStrings];

        for (i = 0; i < numberOfStrings; i++) {
            strings[i] = scanIn.nextLine();
        }

        scanIn.close();

        Arrays.sort(strings);

        for (i = 0; i < numberOfStrings; i++) {
            System.out.println(strings[i]);
        }
    }
}
