package line_task.task04;
/*
Найдите значение функции: z=((a-3)*b/2)+c
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class LineFunction {
    private static double foo (int a, int b,int c ){
         return ((a-3)*b/2)+c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        double z;
        System.out.println("Enter three numbers");
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            z = LineFunction.foo(a,b,c);
            System.out.println("((" + a + "-" +3 + ")" + "*" + b + ":" +2+")+"+ c + "=" + z) ;
        }catch (InputMismatchException e){
            System.out.println("Wrong number!!!!");
        }
        scanner.close();
    }
}