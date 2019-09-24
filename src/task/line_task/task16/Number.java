package line_task.task16;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Найти произведение заданного четырехзначного числа
*/

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter four digit number");
        try {
            x = scanner.nextInt();
            if(x>999&&x<10000){
                int digit0 = (x / 1000) % 10; //third digit of number from left
                int digit1 = (x / 100) % 10; //fourth digit of number from left
                int digit2 = (x / 10) % 10; //fifth digit of number from left
                int digit3 = x % 10; //six digit of number from left
                int multiplicationOfDigit = digit0*digit1*digit2*digit3;
                System.out.printf("multiplication of digit %d = %d",x,multiplicationOfDigit);
            }else {
                System.out.println("it's not four digit number");
            }
        }catch (InputMismatchException e){
            System.out.println("Wrong number!!!!");
        }
        scanner.close();
    }
}
