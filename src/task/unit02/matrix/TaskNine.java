package unit02.matrix;

/*
Дана последовательность. Поменять местами наибольший элемент с наименьшим
*/

public class TaskNine {
    public static void main(String[] args) {
        int[] matrix = {-2, 0, 3, 4, -10, 25};
        int maxValue = 0;
        int minValue = 0;
        int indexOfMaxValue = 0;
        int indexOfMinValue = 0;
        int sizeOfMatrix = matrix.length;
        TaskOne.printMatrix(matrix);
        for (int i = 0; i < sizeOfMatrix; i++) {
            if (matrix[i] > maxValue) {
               // maxValue = matrix[i];
                indexOfMaxValue = i;
            }
            if (matrix[i] < minValue) {
               // minValue = matrix[i];
                indexOfMinValue = i;
            }
        }
        int temp;
        temp = matrix[indexOfMaxValue];
        matrix[indexOfMaxValue] = matrix[indexOfMinValue];
        matrix[indexOfMinValue] = temp;
        TaskOne.printMatrix(matrix);
    }
}
