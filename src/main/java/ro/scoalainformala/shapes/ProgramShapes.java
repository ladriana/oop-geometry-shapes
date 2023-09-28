package ro.scoalainformala.shapes;

import ro.scoalainformala.shapes.domain.Triangle;

import java.util.Scanner;

public class ProgramShapes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();

        new Triangle(x, y, z);


    }
}
