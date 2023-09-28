package primenumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PrimeCheckerTest {

    @Test
    void givenPrimes_WhenCalculated_ThenResultEqual() {

        boolean[] expectedPrimenessArray = new boolean[] { false, false, true, true, false, true, false};
        boolean[] actualPrimenessArray = PrimeChecker.GetPrimenessArray(6);

        Assertions.assertArrayEquals(expectedPrimenessArray, actualPrimenessArray);
    }

    @Test
    void givenIndexes_WhenCalculated_ThenResultEqual() {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 ,8, 8, 9};
        List<Integer> expectedIndexes = new ArrayList<>(){{
            add(1);
            add(2);
            add(4);
            add(6);
        }};

        List<Integer> actualIndexes = PrimeChecker.getPrimes(numbers);

        Assertions.assertEquals(expectedIndexes, actualIndexes);
    }
}