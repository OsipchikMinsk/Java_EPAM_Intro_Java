package line_task.task36;
/*
Найти частное произведений четных и нечетных чисел четырехзначного числа
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberWorker {
    public static double foo(int a) {
        int evenNumbersValue = 1;  //четные произведение равно единице, т.к считаем произведение, если будет 0 то он не измениться
        int oddNumbersValue = 1;   // нечетные произведение
        boolean evenFlag = false;  //флаг на наличие четных в числе
        boolean oddFlag = false;   //флаг на наличие нечетных в числе
        for (int i = 0; i < 4; i++) {
            int temp = a % 10;
            a = a / 10;
            if (temp % 2 == 0) {
                evenNumbersValue *= temp;
                evenFlag = true;
            } else {
                oddNumbersValue *= temp;
                oddFlag = true;
            }
        }
        if(!evenFlag){//проверяем были ли четные, если нет то значение равно 0
            evenNumbersValue = 0;
        }
        if (!oddFlag){ //проверяем были ли нечетные, если нет то значение равно 0
            oddNumbersValue = 0;
        }
        try {
            double res = evenNumbersValue/oddNumbersValue; // на ноль делить нельзя)))
        }catch (ArithmeticException e){
            System.err.println(e);
        }
        return (double) evenNumbersValue / oddNumbersValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter four digit number");
        try {
            x = scanner.nextInt();
            if(x>999&&x<10000){  //проверяем действительно ли число четырехзначное
                double result = NumberWorker.foo(x);
                System.out.printf("Number %d Result of operation %f\n",x,result);
            }else {
                System.out.println("it's not four digit number");
            }
        }catch (InputMismatchException e){
            System.out.println("Wrong number!!!!");
        }
    }
}
