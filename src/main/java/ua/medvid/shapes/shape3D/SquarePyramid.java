package ua.medvid.shapes.shape3D;

import ua.medvid.vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {
    Vertex3D vertex;
    private double width;
    private double height;

    public SquarePyramid(int x, int y, int z, double width, double height) {
        this.vertex = new Vertex3D(x, y, z);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * 2) + (1 / 2) * (width * 4) * height;
    }

    @Override
    public double getVolume() {
        return ((double) 1 / 3) * height * Math.pow(width, 2);
    }

    @Override
    public String toString() {
        return "SquarePyramid - Area: " + String.format("%.2f",getArea()) + " " +
                "Volume: " + String.format("%.2f", getVolume());
    }
}