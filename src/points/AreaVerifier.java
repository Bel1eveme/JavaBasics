package points;

import java.util.ArrayList;

public class AreaVerifier {

    ArrayList<Shape> shapes;

    public AreaVerifier(ArrayList<Shape> shapes){
        this.shapes = shapes;
    }

    public boolean IsInArea(Point point) {
        for (Shape shape : shapes) {
            if (shape.isInside(point)){
                return true;
            }
        }
        return false;
    }
}
