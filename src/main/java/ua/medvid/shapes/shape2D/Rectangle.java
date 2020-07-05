package ua.medvid.shapes.shape2D;

import ua.medvid.vertex.Vertex;
import ua.medvid.vertex.Vertex2D;

import java.util.List;

import static java.util.List.of;

public class Rectangle extends PlaneShape {
    private Vertex2D vertex;
    private double width;
    private double height;

    public Rectangle(int aX, int aY, double width, double height) {
        this.vertex = new Vertex2D(aX, aY);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {

        return (width * height);
    }

    @Override
    public String toString() {
        return "Rectangle - perimeter = " + String.format("%.2f",getPerimeter()) + " "
                + " Area = " + String.format("%.2f",getArea());
    }
}
