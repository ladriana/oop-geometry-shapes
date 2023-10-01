package ro.scoalainformala.shapes;

import ro.scoalainformala.shapes.domain.*;

import java.util.Scanner;

public class ProgramShapes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the first length of the tiangle: ");
        double x = s.nextDouble();
        System.out.print("Please enter the second length of the tiangle: ");
        double y = s.nextDouble();
        System.out.print("Please enter the third length of the tiangle: ");
        double z = s.nextDouble();

        if (ShapesValidation.validationTriangle(x, y, z) == true) {

            Triangle t = new Triangle(x, y, z);
            System.out.println("\nThe tiangle area is: " + t.calculateArea());
            System.out.println("The tiangle perimeter is: " + t.calculatePerimeter());
        } else {
            System.out.print("\nIncorect values to create a tiangle: ");
        }

        System.out.print("\nPlease enter the circle radius: ");
        double r = s.nextDouble();

        if (ShapesValidation.validationCircle(r) == true) {

            Circle c = new Circle(r);
            System.out.println("\nThe circle area is: " + c.calculateArea());
            System.out.println("The circle perimeter is: " + c.calculatePerimeter());
        } else {
            System.out.print("\nIncorect values to create a circle: ");
        }

        System.out.print("\nPlease enter the rectangle length: ");
        double l = s.nextDouble();
        System.out.print("Please enter the rectangle width: ");
        double w = s.nextDouble();

        if (ShapesValidation.validationRectangle(l, w) == true) {
            Rectangle rec = new Rectangle(l, w);
            System.out.println("\nThe rectangle area is: " + rec.calculateArea());
            System.out.println("The rectangle perimeter is: " + rec.calculatePerimeter());
        } else {
            System.out.print("\nIncorect values to create a rectangle: ");
        }

        System.out.print("\nPlease enter the squer length: ");
        double ls = s.nextDouble();

        if (ShapesValidation.validationSquer(ls) == true) {
            Squer sq = new Squer(ls);
            System.out.println("\nThe squer area is: " + sq.calculateArea());
            System.out.println("The squer perimeter is: " + sq.calculatePerimeter());
        } else {
            System.out.print("\nIncorect values to create a squer: ");
        }

    }
}
