package ro.scoalainformala.shapes;

import ro.scoalainformala.shapes.domain.Triangle;

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

        Triangle t = new Triangle(x, y, z);
        System.out.println("\nThe tiangle area is: " + t.calculateArea());

        System.out.println("The tiangle perimeter is: " + t.calculatePerimeter());


    }
}
