import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Layer {
    private java.util.List<Shape> shapes;

    /**
     * addShape.
     */
    public void addShape(Shape shape) {
        if (shapes == null) {
            shapes = new ArrayList<>();
        }
        shapes.add(shape);
    }

    /**
     * removeCircle.
     */
    public void removeCircles() {
        if (shapes == null) {
            return;
        }
        List<Shape> shapeToRemove = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                shapeToRemove.add(shape);
            }
        }
        shapes.removeAll(shapeToRemove);
    }

    /**
     * getInfo().
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }

    /**
     * removeDuplicte.
     */
    public void removeDuplicates() {
        if (shapes == null) {
            return;
        }
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (!uniqueShapes.contains(shape)) { //neu uniqueShapes khong chua shape
                uniqueShapes.add(shape);
            }
        }
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}
