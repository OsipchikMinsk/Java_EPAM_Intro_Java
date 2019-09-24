package line_task.task01;

/*
Даны два чисда x и y. Вычислить их сумму, разность,произведение и частное
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleOperation {


    private static int sum(int x, int y) {

        return x + y;
    }

    private static int minus(int x, int y) {
        return x - y;
    }

    private static int multiplication(int x, int y) {
        return x * y;
    }


    private static double division(int x, int y) {
        return x/y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter two numbers");
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(x + "+" + y + "=" + SimpleOperation.sum(x,y));
            System.out.println(x + "-" + y + "=" + SimpleOperation.minus(x,y));
            System.out.println(x + "*" + y + "=" + SimpleOperation.multiplication(x,y));
            System.out.println(x + ":" + y + "=" + SimpleOperation.division(x,y));
        }catch (InputMismatchException e){
            System.out.println("Wrong number!!!!");
        }
        scanner.close();

    }
}



