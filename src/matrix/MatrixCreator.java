package matrix;

public class MatrixCreator {

    public static int[] CycleLeftShift(int[] array){
        var shiftedArray = new int[array.length];

        shiftedArray[array.length - 1] = array[0];

        if (array.length == 1)
            return shiftedArray;

        for (int j = 0, i = array.length - 2; i >= 0; i--, j++)
            shiftedArray[i] = array[i + 1];

        return shiftedArray;
    }

    public static int[][] GetMatrix(int[] array){
        var matrix = new int[array.length][array.length];

        matrix[0] = array;
        for (int i = 1; i < array.length; i++)
        {
            matrix[i] = CycleLeftShift(matrix[i - 1]);
        }

        return matrix;
    }
}
