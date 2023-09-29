package ro.scoalainformala.shapes.domain;

public class Triangle {
    private double l1, l2, l3;

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public void setL1(double l1) {
        if (l1 > 0 && (l2 + l3) >= l1) {
            this.l1 = l1;
        }
    }
        public double calculatePerimeter () {
            return l1 + l2 + l3;
        }

        public double calculateArea () {
            double sm = calculatePerimeter() / 2;
            return Math.sqrt(sm * (sm - l1) * (sm - l2) * (sm - l3));
        }
    }
