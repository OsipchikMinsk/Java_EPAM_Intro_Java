package unit02.matrix;
/*
Дана последовательность чисел, выяснить какое число + или - встречается первым
*/

import unit02.matrix.TaskOne;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        Random random = new Random();

        int[] matrix = new int[10];
        int sizeOfMatrix = matrix.length;
        for (int i = 0; i < sizeOfMatrix; i++) {
            matrix[i] = -1 + random.nextInt(3); //генерируем случайное число от [-1 до 1]
        }
        TaskOne.printMatrix(matrix);

        if (matrix[0] > 0) {
            System.out.println("Положительное первое");
        } else if (matrix[0] < 0) {
            System.out.println("Отрицательное первое");
        } else {
            System.out.println("Ноль первый");
        }
    }

}


