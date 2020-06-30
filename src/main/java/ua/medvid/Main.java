package ua.medvid;


import ua.medvid.shapes.Shape;
import ua.medvid.shapes.shape2D.Circle;
import ua.medvid.shapes.shape2D.Rectangle;
import ua.medvid.shapes.shape2D.Triangle;
import ua.medvid.shapes.shape3D.Cuboid;
import ua.medvid.shapes.shape3D.Sphere;
import ua.medvid.shapes.shape3D.SquarePyramid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(13,12,4);
        Triangle triangle = new Triangle(12,145,53,1,3,5);
        Rectangle rectangle = new Rectangle(12,666,13,9);

        Cuboid cuboid = new Cuboid(1,4,65,12,99,12);
        Sphere sphere = new Sphere(12,33,99,9);
        SquarePyramid squarePyramid = new SquarePyramid(13,4,99,12,12);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(squarePyramid);
        for(Shape my : shapes) {
            System.out.println(my.toString());
        }
    }
}
