package loop.task34;
/*

Найдите все четырехзначные числа, сумма чисел  которых равна 15
*/

public class SumCounter {
    public static final int RESULT = 15; //константная переменая со значением 15

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int sumOfNumbers = 0;
            int number = i;
            while (number > 0) {
                sumOfNumbers += number % 10;
                number = number / 10;
            }
            if (sumOfNumbers == RESULT) {
                System.out.println(i);
            }
        }


    }
}
