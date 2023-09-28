package sequences;

import java.util.Arrays;

public class ElementsRemover {

    public static int GetCount(int[] numbers) {
        int[] extraArray = new int[numbers.length];
        int currentLength = 0;

        for (int i : numbers) {
            int index = Arrays.binarySearch(extraArray, 0, currentLength, i);
            if (index < 0) {
                index = -(index + 1);
            }
            extraArray[index] = i;
            if (index == currentLength) {
                currentLength++;
            }
        }

        return numbers.length - currentLength;
    }
}
