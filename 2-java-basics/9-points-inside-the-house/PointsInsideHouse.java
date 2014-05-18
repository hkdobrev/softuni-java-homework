import java.util.Scanner;
import java.awt.geom.Point2D.Double;
import java.lang.Math;

public class PointsInsideHouse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double point = new Double(scan.nextDouble(), scan.nextDouble());

        if (isDoubleInsideHouse(point)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }

    private static boolean isDoubleInsideHouse(Double point) {
        java.awt.geom.Rectangle2D.Double facade = new java.awt.geom.Rectangle2D.Double(12.5, 8.5, 22.5 - 12.5, 13.5 - 8.5);
        java.awt.geom.Rectangle2D.Double door = new java.awt.geom.Rectangle2D.Double(17.5, 8.5, 20 - 17.5, 13.5 - 8.5);

        if (isDoubleInsideRectangle(point, facade, true)) {
            if (isDoubleInsideRectangle(point, door, false)) {
                return false;
            }

            return true;
        } else {
            return vectorProduct(point, 12.5, 8.5, 17.5, 3.5) >= 0
                && vectorProduct(point, 17.5, 3.5, 22.5, 8.5) >= 0
                && vectorProduct(point, 12.5, 8.5, 22.5, 8.5) <= 0;
        }
    }

    private static boolean isDoubleInsideRectangle(Double point, java.awt.geom.Rectangle2D.Double rect, boolean includeBorder) {
        if (includeBorder) {
            return point.getX() >= rect.getX()
                && point.getX() <= rect.getX() + rect.getWidth()
                && point.getY() >= rect.getY()
                && point.getY() <= rect.getY() + rect.getHeight();
        } else {
            return rect.contains(point);
        }
    }

    private static double vectorProduct(Double Double, double x1, double y1, double x2, double y2) {
        return Math.signum( (x2 - x1) * (Double.getY() - y1 ) - (y2 - y1) * (Double.getX() - x1) );
    }
}
