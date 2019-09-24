package line_task.task06;
/*
Написать код для решения задачи. В n ммалых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
        если в каждом большом бидоне на 12 литров больше, чем малом?
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class MilkCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n; // колличество малых бидонов
        double m; // колличество больших бидонов
        double milkInBigCan; //колличество молокоа в больших бидонах
        System.out.println("Input count of small and big can.");
try {
    n = scanner.nextDouble();
    m = scanner.nextDouble();
    milkInBigCan = (80/n+12)*m;
    System.out.println("In Big Can " + milkInBigCan + " liters of milk.");
} catch (InputMismatchException e) {
            System.out.println("Wrong number!!!!");
        }
        scanner.close();
    }

}
