package line_task.task05;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Составить алгоритм нахождения среднего арифмитического двух чисел

*/
public class MiddleArithmetic {
    private static double toFindMiddleArithmetic(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double z;
        System.out.println("Enter two numbers");
        try {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            z = MiddleArithmetic.toFindMiddleArithmetic(a, b);
            System.out.println("MiddleArithmetic of " + a + " and " + b + " = " + z);
        } catch (InputMismatchException e) {
            System.out.println("Wrong number!!!!");
        }
        scanner.close();
    }
}


