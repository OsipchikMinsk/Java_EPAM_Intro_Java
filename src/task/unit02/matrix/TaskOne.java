package unit02.matrix;

  /*
В массив А[N] занесены натуральные числа.Найти сумму тех элементов, которые кратны данному К
*/

public class TaskOne {

  public  static void printMatrix(int[] matrix) { //делаю public static чтобы обращаться к методу без создания экземпляра класса
        int sizeOfMatrix = matrix.length;
        for (int i = 0; i < sizeOfMatrix; i++) {
            System.out.print(matrix[i] + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] matrix = {16, 0, 24, 100};
        int valueK = 8; //кратное
        int sumOfValue = 0;
        int sizeOfMatrix = matrix.length;
        TaskOne.printMatrix(matrix);
        for (int i = 0; i < sizeOfMatrix; i++) {
            if (matrix[i] % valueK == 0) {
                sumOfValue += matrix[i];
            }
        }
        System.out.print(sumOfValue);
    }
}


