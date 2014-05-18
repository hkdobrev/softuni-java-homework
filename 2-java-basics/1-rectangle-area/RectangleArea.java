import java.util.Scanner;

class RectangleArea {

    public static void main(String[] args) {
        int a, b;

        Scanner scanIn = new Scanner(System.in);
        a = Integer.parseInt(scanIn.nextLine());
        b = Integer.parseInt(scanIn.nextLine());
        scanIn.close();

        int area = a * b;

        System.out.println(area);
    }

}
