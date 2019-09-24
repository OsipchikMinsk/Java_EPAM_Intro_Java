package line_task.task17;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

/*
Даны два числа. Найти среднее арифмитическое кубов этих чисел и среднее геометрическое модулей этих чисел
*/

public class Number {
    private static double middleArithmeticCubeOfNumbers (int a, int b){
        return ((pow(a,3)+pow(b,3))/2);
    }
    private static double middleGeometricOfNumberByAbs (int a, int b){
        return sqrt(abs(a*b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter two numbers");
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            double middleArithmetic = Number.middleArithmeticCubeOfNumbers(x,y);
            double middleGeometric = Number.middleGeometricOfNumberByAbs(x,y);
            System.out.printf("Middle cube arithmetic of number %d and %d = %f\n",x,y,middleArithmetic);
            System.out.printf("Middle geometric by abs of number %d and %d = %f\n",x,y,middleGeometric);
            }catch (InputMismatchException e){
            System.out.println("Wrong number!!!!");
        }
        scanner.close();
    }
}
