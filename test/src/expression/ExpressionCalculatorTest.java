package expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionCalculatorTest {

    private static final double PRECISION = 0.00001;

    @Test
    void givenZeroValues_WhenCalculatedWrongly_ThenCalculationFails()
    {
        double x = 0;
        double y = 0;

        double expected = 0.5;

        double actual = ExpressionCalculator.getResult(x, y);

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void givenPiValues_WhenCalculatedWrongly_ThenCalculationFails()
    {
        double x = Math.PI;
        double y = Math.PI;

        double expected = 3.338530465847074;

        double actual = ExpressionCalculator.getResult(x, y);

        assertEquals(expected, actual, PRECISION);
    }

    @Test
    void givenNegativeOnesValues_WhenCalculatedWrongly_ThenCalculationFails()
    {
        double x = -1;
        double y = -1;

        double expected = -0.08658909478409704;

        double actual = ExpressionCalculator.getResult(x, y);

        assertEquals(expected, actual, PRECISION);
    }
}