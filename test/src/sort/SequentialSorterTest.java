package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SequentialSorterTest {

    @Test
    void givenSequence_WhenSorted_ThenResultEqual() {
        int[] actualArray = new int[] { 5, 2, 3, 7, 1, 8, 3};
        SequentialSorter.sort(actualArray);

        int[] expectedArray = new int[] { 1, 2, 3, 3, 5, 7, 8};

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}