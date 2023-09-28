package matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrixCreatorTest {

    @Test
    void givenArray_WhenShifted_ThenResultEqual() {
        int[] array = new int[] { 1, 2, 3, 4, 5};
        int[] expectedArray = new int[] { 2, 3, 4, 5, 1 };

        int[] actualArray = MatrixCreator.CycleLeftShift(array);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void givenArray_WhenCalculated_ThenResultEqual() {
        int[] array = new int[] { 1, 2, 3, 4, 5};
        int[][] expectedMatrix = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 2, 3, 4, 5, 1 },
                { 3, 4, 5, 1, 2 },
                { 4, 5, 1, 2, 3 },
                { 5, 1, 2, 3, 4 },
        };

        int[][] actualMatrix = MatrixCreator.GetMatrix(array);

        Assertions.assertArrayEquals(expectedMatrix, actualMatrix);
    }
}