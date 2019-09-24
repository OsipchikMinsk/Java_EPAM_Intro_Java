package loop.task09;


import java.math.BigInteger;

public class SummOfPow {
    public static void main(String[] args) {
        int sumOfPow = 0;
       for (int i =0;i<100;i++){ //найти сумму квадратов первых ста чисел
           sumOfPow+=i*i;
       }
        System.out.println(sumOfPow);

    }
}
