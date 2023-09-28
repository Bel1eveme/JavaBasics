package functionvalues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValuesCalculatorTest {

    private static final double BORDER_A = -2;

    private static final double BORDER_B = 1;

    private static final double STEP_H = 0.5;

    private static final double PRECISION = 0.0001;

    @Test
    void givenZeroStepValue_WhenArgumentChecked_ThenIllegalArgumentThrown() {
        double stepH = 0;

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ValuesCalculator.getFunctionValues(
                        BORDER_A, BORDER_B, stepH));

        assertEquals("Step must be more than zero.", exception.getMessage());
    }

    @Test
    void givenGoodArguments_WhenFunctionValuesCalculated_ThenResultIsEqual() {
        double[] expectedArguments = new double[]{-2.0, -1.5, -1.0, -0.5, 0.0, 0.5};

        ArgumentValueDto actualArgumentsDto = ValuesCalculator.
                getFunctionValues(BORDER_A, BORDER_B, STEP_H);

        assertArrayEquals(expectedArguments, actualArgumentsDto.arguments(), PRECISION);
    }

    @Test
    void givenGoodArguments_WhenFunctionArgumentsCalculated_ThenResultIsEqual() {
        double[] expectedValues = new double[]{2.185039863261519, -14.101419947171719, -1.5574077246549023,
                -0.5463024898437905, 0.0, 0.5463024898437905};

        ArgumentValueDto actualArgumentsDto = ValuesCalculator.
                getFunctionValues(BORDER_A, BORDER_B, STEP_H);

        assertArrayEquals(expectedValues, actualArgumentsDto.values(), PRECISION);
    }
}