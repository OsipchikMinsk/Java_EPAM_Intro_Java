package loop.task24;
/*
Вводиться натуральное число. Найти сумму четных цифр входящих в его состав.Преобразовать его
в другое число, цифры котрого будут следовать в обратном порядке, по сравнению с введенным
*/

import line_task.task01.SimpleOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChanger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter two numbers");
        try {
            x = scanner.nextInt();
            System.out.println(x);

        } catch (InputMismatchException e) {
            System.err.println(e);
        }
        scanner.close();
    }

}
