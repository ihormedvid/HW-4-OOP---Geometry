package ua.medvid.shapes;

import ua.medvid.vertex.Vertex;
import ua.medvid.vertex.Vertex2D;

import java.util.List;

public abstract class Shape {
    public double getBetweenTwoVertices(Vertex2D a, Vertex2D b) {
        return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
    }
}