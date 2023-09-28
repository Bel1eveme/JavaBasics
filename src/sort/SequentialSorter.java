package sort;

public class SequentialSorter {

    public static void sort(int[] numbers){
        for (int i = 0; i < numbers.length - 1;){
            if (numbers[i] <= numbers[i + 1]) {
                i++;
            } else {
                int temp = numbers[i];

                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;

                if (i > 0)
                    i--;
            }
        }
    }
}
