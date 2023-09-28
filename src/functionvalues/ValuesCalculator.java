package functionvalues;

public class ValuesCalculator {

    private static final double EPSILON = 0.000001;
    private static boolean isZeroOrLess(double value){
        return Math.abs(value) < EPSILON;
    }
    public static ArgumentValueDto getFunctionValues(double a, double b, double h) {
        if (isZeroOrLess(h))
            throw new IllegalArgumentException("Step must be more than zero.");

        int stepCount = (int)Math.abs((b - a) / h);
        var arguments = new double[stepCount];
        var values = new double[stepCount];

        double x = a;
        for (int i = 0; i < stepCount; i++, x += h){
            arguments[i] = x;
            values[i] = Math.tan(x);
        }

        return new ArgumentValueDto(arguments, values);
    }
}
