package line_task.task37;

import java.util.Scanner;

public class BlockTask {
    public static void main(String[] args) {
        //Целое число является двузначным четным

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two digit number");
        int twoDigitNumber = scanner.nextInt();
        System.out.println(((twoDigitNumber>9&&twoDigitNumber<100)&&twoDigitNumber%2 ==0)?true:false);
        //Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последнихцифр

        System.out.println("Enter four digit number ");
        int fourDigitNumber = scanner.nextInt();
        if(fourDigitNumber>999&&fourDigitNumber<10000){ //проверка на четырехзанчное число
            int sumTwoFirstDigit; //сумма первых двух цифр
            int sumTwoLastDigit;  // сумма последних двух цифр
            sumTwoLastDigit = fourDigitNumber%10 + (fourDigitNumber/10)%10; //находим сумму последних двух
            fourDigitNumber/=100;
            sumTwoFirstDigit = fourDigitNumber%10 + (fourDigitNumber/10)%10; //находим сумму оставшихся двух
            System.out.println(sumTwoFirstDigit==sumTwoLastDigit?true:false);
        } else {
            System.out.println("Wrong number ");
        }
        //Сумма цифр трехзначного числа N является четным числом
        int threeDigitNumber = 554;
        int sum = threeDigitNumber%10 + (threeDigitNumber/10)%10 + (threeDigitNumber/10)%10;
        System.out.print("Sum of digit of number " + threeDigitNumber +" is even => ");
        System.out.println(sum%2==0?true:false);



        }
    }

