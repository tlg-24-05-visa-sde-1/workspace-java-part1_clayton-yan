package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Shape;
import edu.geometry.Triangle;
import edu.geometry.Rectangle;

import java.util.ArrayList;
import java.util.Collection;

public class ShapeClient {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(3, 4, 60.0);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());

        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        // total area of shapes
        double areaCombined = 0.0;
        for (Shape shape : shapes) {
            areaCombined += shape.area();
        }
        System.out.println("Combined Area: " + areaCombined);
    }
}
