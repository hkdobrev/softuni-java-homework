import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        int aX, aY, bX, bY, cX, cY;

        Scanner scanIn = new Scanner(System.in);
        aX = Integer.parseInt(scanIn.nextLine());
        aY = Integer.parseInt(scanIn.nextLine());
        bX = Integer.parseInt(scanIn.nextLine());
        bY = Integer.parseInt(scanIn.nextLine());
        cX = Integer.parseInt(scanIn.nextLine());
        cY = Integer.parseInt(scanIn.nextLine());
        scanIn.close();

        double area = Math.abs(aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
        System.out.println(Math.round(area));
    }
}
