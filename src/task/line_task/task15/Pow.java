package line_task.task15;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Написать программу которая выводит на экран 4 степени числа
*/

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter one number");
        try {
            x = scanner.nextInt();
            System.out.println(x*x);
            System.out.println(x*x*x);
            System.out.println(x*x*x*x);
            System.out.println(x*x*x*x*x);
        }catch (InputMismatchException e){
            System.out.println("Wrong number!!!!");
        }
        scanner.close();
    }
}
