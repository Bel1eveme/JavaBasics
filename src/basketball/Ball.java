package basketball;

public class Ball {

    private static final double EPSILON = 0.0001;

    private static boolean isZeroOrLess(double value){
        return Math.abs(value) < EPSILON;
    }

    private final double WEIGHT;

    private final Color COLOR;

    public Ball(double weight, Color color) {
        if (isZeroOrLess(weight))
            throw new IllegalArgumentException("Weight must be more than zero.");

        WEIGHT = weight;
        COLOR = color;
    }

    public double getWeight() {
        return WEIGHT;
    }

    public Color getColor() {
        return COLOR;
    }
}
