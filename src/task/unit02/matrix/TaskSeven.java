package unit02.matrix;
/*
Дана последователльность действительных чисел.Заменить все ее членыы большее данного Z этим числом.
Подсчитиать кол-во замен
*/

public class TaskSeven {
    private static void changeValueInMatrix(int[] matrix, int value) {
        int countOfChanges = 0;
        int sizeOfMatrix = matrix.length;
        TaskOne.printMatrix(matrix);
        for (int i = 0; i < sizeOfMatrix; i++) {
            if (matrix[i] > value) {
                matrix[i] = value;
                countOfChanges++;
            }
        }
        TaskOne.printMatrix(matrix);
        System.out.println("Замен было произведено " + countOfChanges);
    }

    public static void main(String[] args) {
        int[] matrix = {10, 20, 30, 10, 19, 40, 80, 90, 55, -12, 7, -54, 0};
        int value = 25;
        TaskSeven.changeValueInMatrix(matrix, value);
    }
}
