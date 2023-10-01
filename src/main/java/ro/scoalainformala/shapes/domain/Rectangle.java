package ro.scoalainformala.shapes.domain;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }

    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
    public double calculateArea() {
        return length * width;
    }
}
