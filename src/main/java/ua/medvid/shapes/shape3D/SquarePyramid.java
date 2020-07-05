package ua.medvid.shapes.shape3D;



public class SquarePyramid extends SpaceShape {
    private final double width;
    private final double height;

    public SquarePyramid(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * 2) + (1 / 2.0) * (width * 4) * height;
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