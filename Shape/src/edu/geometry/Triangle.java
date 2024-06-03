package edu.geometry;

public class Triangle implements Shape {
    // SAS
    private final double sideA;
    private final double sideB;
    private final double angle; // in degrees

    public Triangle(double sideA, double sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public double area() {
        // angle from degrees to radians
        double angleRadians = Math.toRadians(angle);
        return 0.5 * sideA * sideB * Math.sin(angleRadians);
    }
}
