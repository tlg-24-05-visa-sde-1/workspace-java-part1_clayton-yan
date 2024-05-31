package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Shape;
import edu.geometry.Triangle;
import edu.geometry.Rectangle;

public class ShapeClient {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(3, 4);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }
}
