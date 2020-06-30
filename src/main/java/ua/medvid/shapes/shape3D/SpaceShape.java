package ua.medvid.shapes.shape3D;

import ua.medvid.interfaces.AreaMeasurable;
import ua.medvid.interfaces.PerimeterMeasurable;
import ua.medvid.interfaces.VolumeMeasurable;
import ua.medvid.shapes.Shape;
import ua.medvid.vertex.Vertex3D;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    List<Vertex3D> listOfVertices;

    public abstract double getVolume();
}
