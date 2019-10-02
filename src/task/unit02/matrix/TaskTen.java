package unit02.matrix;

/*
Дан целочисленный массив. Выести на печать только те элементы масива которые >i
*/

public class TaskTen {
    public static void main(String[] args) {
        int [] matrix = {-1,-2,0,3,4,6,-8,1, 100, 99,55};
        TaskOne.printMatrix(matrix);
        for (int i =0;i<matrix.length;i++){
            if (matrix[i]>i){
                System.out.print(matrix[i] + "\t");
            }
        }
    }
}
