import java.util.Scanner;

public class PointsInsideFigure {

    public static final double INSIDE_X1 = 12.5;
    public static final double INSIDE_Y1 = 6;
    public static final double INSIDE_X2 = 22.5;
    public static final double INSIDE_Y2 = 13.5;
    public static final double OUTSIDE_X1 = 17.5;
    public static final double OUTSIDE_Y1 = 8.5;
    public static final double OUTSIDE_X2 = 20;
    public static final double OUTSIDE_Y2 = 13.5;

    public static void main(String[] args) {
        double pointX, pointY;

        Scanner scan = new Scanner(System.in);
        pointX = scan.nextDouble();
        pointY = scan.nextDouble();
        System.out.println(checkInsideOutside(pointX, pointY));
    }

    /**
     * Check if the point is inside the big rectangle and outside the small rectangle
     * @param  pointX double
     * @param  pointY double
     * @return String "Inside" or "Outside"
     */
    public static String checkInsideOutside(double pointX, double pointY) {
        if (!checkPointInsideRectangle(pointX, pointY, INSIDE_X1, INSIDE_Y1, INSIDE_X2, INSIDE_Y2, true)) {
            return "Outside";
        }

        if (checkPointInsideRectangle(pointX, pointY, OUTSIDE_X1, OUTSIDE_Y1, OUTSIDE_X2, OUTSIDE_Y2, false)) {
            return "Outside";
        }

        return "Inside";
    }

    private static boolean checkPointInsideRectangle(double pointX, double pointY, double rectX1, double rectY1, double rectX2, double rectY2, boolean includeBorder) {
        if (includeBorder) {
            return pointX >= rectX1
                && pointX <= rectX2
                && pointY >= rectY1
                && pointY <= rectY2;
        } else {
            return pointX > rectX1
                && pointX < rectX2
                && pointY > rectX1
                && pointY < rectY2;
        }
    }
}
