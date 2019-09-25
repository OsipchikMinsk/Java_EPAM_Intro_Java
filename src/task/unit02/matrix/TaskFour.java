package unit02.matrix;
/*
Дана последовательность . Выяснить будет ли она возрастающей
*/

public class TaskFour {

   private static boolean isIncreasingSequence(int[] matrix) {
        int checkSizeOfMatrix = matrix.length - 1;//-1 тк будет сравниваться iый элемент с i+1. Если этого не сделать выйдем за пределы массива
        boolean isIncreasing = false;
        for (int i = 0; i < checkSizeOfMatrix; i++) {
            if (matrix[i] < matrix[i + 1]) {
                isIncreasing = true;
            } else return isIncreasing; //дальше нет смысла бежать по матрице
        }
        return isIncreasing;
    }

    public static void main(String[] args) {
        int [] matrix = {1,2,3,4,5,6,};
        TaskOne.printMatrix(matrix);
        System.out.println(TaskFour.isIncreasingSequence(matrix));
    }
}
