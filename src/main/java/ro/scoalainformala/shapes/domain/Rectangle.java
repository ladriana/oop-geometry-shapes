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
}
