package ro.scoalainformala.shapes.domain;

public class Squer {
    double length;

    public Squer(double length) {
        this.length = length;
    }

    public double calculateArea() {
        return length * length;
    }

    public double calculatePerimeter() {
        return 4 * length;
    }
}
