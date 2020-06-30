package ua.medvid.shapes.shape2D;

import ua.medvid.vertex.Vertex2D;

public class Circle extends PlaneShape {
   private Vertex2D vertex;
   private double radius;

    public Circle(int aX, int aY, double radius) {
        this.vertex = new Vertex2D(aX, aY);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return  "Cirlce, Perimeter =" + String.format("%.2f",getPerimeter()) +
                "Area = " + String.format("%.2f",getArea());

    }

}