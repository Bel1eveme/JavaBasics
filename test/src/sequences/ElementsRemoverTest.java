package sequences;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElementsRemoverTest {

    @Test
    void givenSequence_WhenCalculated_ThenResultEqual() {
        int[] numbers = new int[] { 1, 5, 3, 4, 7, 2, 7};
        int expected = 3;

        int actual = ElementsRemover.GetCount(numbers);

        Assertions.assertEquals(expected, actual);
    }
}