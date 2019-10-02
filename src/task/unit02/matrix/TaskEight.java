package unit02.matrix;
/*
Дана массив действительных чисел, размерность которого N.
        Подсчитать сколько в нем положительных, отрицательных и нулевых элементов
*/

import java.util.Random;

public class TaskEight {
    public static void main(String[] args) {
        int[] matrix = new int[20];
        int sizeOfMatrix = matrix.length;
        int countOfZero = 0;
        int countPlusValue = 0;
        int countOfMinusValue =0;
        Random random = new Random();
        for (int i=0;i<sizeOfMatrix;i++){
            matrix[i] = -5 + random.nextInt(11); //заполняем массив случайными числами от -5 до 5
        }
        TaskOne.printMatrix(matrix);
        for (int i =0;i<sizeOfMatrix;i++){
            if (matrix[i]<0){
                countOfMinusValue++;
            }else if (matrix[i]>0){
                countPlusValue++;
            }else {
                countOfZero++;
            }
        }
        System.out.printf("Положительных элементов %d\nОтрицательных элементов %d\nРавных нулю %d  ",
                countPlusValue,countOfMinusValue,countOfZero);
    }
}
