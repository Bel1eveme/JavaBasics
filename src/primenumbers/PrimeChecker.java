package primenumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeChecker {

    public static boolean[] GetPrimenessArray(int lastNumber) {
        lastNumber++;

        var primenessArray = new boolean[lastNumber];
        Arrays.fill(primenessArray, true);
        primenessArray[0] = false;
        primenessArray[1] = false;

        for (int i = 2; i * i < lastNumber; i++) {
            if (primenessArray[i]) {
                for (int j = i * i; j < lastNumber; j += i)
                    primenessArray[j] = false;
            }
        }

        return primenessArray;
    }

    private static List<Integer> GetPrimeIndexes(int[] numbers){
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copiedArray);
        int maxNumber = copiedArray[copiedArray.length - 1];

        boolean[] primenessArray = GetPrimenessArray(maxNumber);

        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            if (primenessArray[numbers[i]])
                indexes.add(i);
        }

        return indexes;
    }

    public static List<Integer> getPrimes(int[] numbers)    {
        return GetPrimeIndexes(numbers);
    }
}
