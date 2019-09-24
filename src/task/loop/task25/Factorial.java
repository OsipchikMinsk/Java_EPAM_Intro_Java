package loop.task25;
/*
Требуется определить факториал числа, котрое ввел пользователь
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        try {
            int faorialOfNumber = scanner.nextInt();
            System.out.println(calculateFactorial(faorialOfNumber));
        } catch (InputMismatchException e){
            System.err.println(e);
            System.out.println("Wrong number");
        }

    }

}
