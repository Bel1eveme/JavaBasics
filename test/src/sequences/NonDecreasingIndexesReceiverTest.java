package sequences;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class NonDecreasingIndexesReceiverTest {

    @Test
    void givenTwoSequence_WhenIndexesCalculated_ThenResultEqual() {

        int[] firstSequence = new int[] { 1, 1, 4, 5, 7 };
        int[] secondSequence = new int[] { 1, 2, 3, 3, 6, 7 };
        List<Integer> expectedIndexes = new ArrayList<>(){{
            add(2);
            add(3);
            add(4);
            add(5);
            add(8);
            add(10);
        }};

        List<Integer> actualIndexes = NonDecreasingIndexesReceiver.
                GetIndexesToInsert(firstSequence, secondSequence);

        Assertions.assertEquals(expectedIndexes, actualIndexes);
    }
}