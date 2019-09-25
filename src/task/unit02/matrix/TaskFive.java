package unit02.matrix;
/*
Дана последовательность атуральных чисел. Создать массив из четных чисел этой последовательности.
Если таких нет то вывести сообжщение об этом факте
*/

public class TaskFive {

    private static void createMatrixWithEvenNumbers(int[] matrix) {

        int sizeOfMatrix = matrix.length;
        int countEvenValue = 0;
        for (int i = 0; i < sizeOfMatrix; i++) { //найдем кол-во положительных элементов в матрице
            if (matrix[i] % 2 == 0) {
                countEvenValue++;
            }
        }
        if (countEvenValue == 0) {
            System.out.println("Положительных элементов нет");
            return; //выходим из метода, т.к. в дальнейших операциях нет смысла
        }
        int[] matrixWithEvenNumbers = new int[countEvenValue];
        int index = 0;
        for (int i = 0; i < sizeOfMatrix; i++) {
            if (matrix[i] % 2 == 0) {
                matrixWithEvenNumbers[index++] = matrix[i];
            }
        }
        TaskOne.printMatrix(matrixWithEvenNumbers);
    }

    public static void main(String[] args) {
        int [] matrix = {1,2,5,7,7,8};
        TaskFive.createMatrixWithEvenNumbers(matrix);
    }

}
