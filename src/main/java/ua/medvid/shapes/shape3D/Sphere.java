package ua.medvid.shapes.shape3D;


import ua.medvid.vertex.Vertex3D;

public class Sphere extends SpaceShape {
    private final double radius;
    private final Vertex3D vertex;

    public Sphere(int x, int y, int z, double radius) {
        this.vertex = new Vertex3D(x, y, z);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getVolume() {
        return ((4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return "Sphere - Area: " + String.format("%.2f",getArea()) + " " +
                "Volume: " + String.format("%.2f",getVolume());
    }

}