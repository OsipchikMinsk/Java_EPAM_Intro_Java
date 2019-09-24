package line_task.task03;
/*
Найдите значение функции: z=2*x+(y-2)*5
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class LineFunction {
    private static int foo (int x, int y){
          return 2*x+(y-2)*5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Enter two numbers");
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = LineFunction.foo(x,y);
            System.out.println(2 + "*"+x + "+"+ "(" + y +"-" +2 +")" + "*"+5 +"=" + z) ;
        }catch (InputMismatchException e){
            System.out.println("Wrong number!!!!");
        }
        scanner.close();
    }
}
