package ua.medvid.shapes.shape3D;

import ua.medvid.vertex.Vertex3D;

import java.util.List;

public class Cuboid extends SpaceShape {

    Vertex3D vertex;
    int width;
    int height;
    int depth;

    public Cuboid(int x, int y, int z, int width, int height, int depth) {
        this.vertex = new Vertex3D(x, y, z);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return (2 * (width * height) + 2 * (height * depth) + 2
                * (width * depth));
    }

    @Override
    public double getVolume() {
        return (width * height * depth);
    }

    @Override
    public String toString() {
        return "Cyboid Area = " + String.format("%.2f",getArea()) + " "
                + " Volume = " + String.format("%.2f", getVolume());
    }

}
