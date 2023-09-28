package points;

public class Shape {

    private final int topY;

    private final int bottomY;

    private final int leftX;

    private final int rightX;

    public Shape(int topY, int bottomY, int leftX, int rightX) {
        this.topY = topY;
        this.bottomY = bottomY;
        this.leftX = leftX;
        this.rightX = rightX;
    }

    public boolean isInside(Point point) {
        return point.x() >= leftX && point.x() <= rightX
                && point.y() <= topY  && point.y() >= bottomY;
    }
}
