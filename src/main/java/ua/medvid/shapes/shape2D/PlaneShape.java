package ua.medvid.shapes.shape2D;

import ua.medvid.interfaces.AreaMeasurable;
import ua.medvid.interfaces.PerimeterMeasurable;
import ua.medvid.shapes.Shape;
import ua.medvid.vertex.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    List<Vertex2D> listOfVertices;
}
