package unit02.matrix;
/*
В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов
*/

public class TaskTwo {
   private static void createMatrixByNullValueByIndex (int [] matrix){
        int sizeOfMatrix = matrix.length;
        int countZeroInMatrix =0;
        for (int i=0;i<sizeOfMatrix;i++){ //найдем колличество нулей в матрице, чтоб потом созадать матрицу подходящего размера
            if(matrix[i]==0){
                countZeroInMatrix++;
            }
        }
        int [] matrixWithZeroIndex = new int[countZeroInMatrix]; //создадим пустую матрицу, рамером = колл-ву 0 из предыдущей
        int index =0;
        for (int i =0;i<sizeOfMatrix;i++){
            if(matrix[i]==0){
                matrixWithZeroIndex[index++]=i; //вставим занчение 0 индекса в матрицу
            }
        }
        TaskOne.printMatrix(matrixWithZeroIndex);

    }
    public static void main(String[] args) {
        int [] matrix = {1,0,2,0,5,0,9,0,10};
        TaskOne.printMatrix(matrix);
        TaskTwo.createMatrixByNullValueByIndex(matrix);


    }
}
