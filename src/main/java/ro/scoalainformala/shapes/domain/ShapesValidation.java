package ro.scoalainformala.shapes.domain;

public class ShapesValidation {
    public static boolean validationTriangle(double l1, double l2, double l3) {
        if (l1 > 0 && l2 > 0 && l3 > 0 && (l2 + l3) >= l1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validationCircle(double r) {
        if (r > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validationRectangle(double length, double width) {
        if (length > 0 && width > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validationSquer(double length) {
        if (length > 0) {
            return true;
        } else {
            return false;
        }
    }

}