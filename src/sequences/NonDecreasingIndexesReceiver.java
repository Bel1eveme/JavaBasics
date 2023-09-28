package sequences;

import java.util.ArrayList;
import java.util.List;

public class NonDecreasingIndexesReceiver {

    public static List<Integer> GetIndexesToInsert(int[] firstSequence, int[] secondSequence){
        List<Integer> positions = new ArrayList<>();
        int i = 0, j = 0;

        while (i < firstSequence.length && j < secondSequence.length) {
            if (firstSequence[i] <= secondSequence[j]) {
                i++;
            } else {
                positions.add(i + j);
                j++;
            }
        }
        if (j < secondSequence.length) {
            for (; j < secondSequence.length; j++) {
                positions.add(i + j);
            }
        }

        return positions;
    }
}
