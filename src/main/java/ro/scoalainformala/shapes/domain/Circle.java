package ro.scoalainformala.shapes.domain;

public class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
