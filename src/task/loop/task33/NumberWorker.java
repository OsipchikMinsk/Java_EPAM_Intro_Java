package loop.task33;
/*
Найдите наибольшую цифру заданного натурального числа
*/

public class NumberWorker {
    public static void main(String[] args) {
        int number = 1234567890;
        int maxNumber = 0;
        int ostatok;
        while (number>0){
          ostatok = number%10;
          number = number/10;
          if (ostatok>maxNumber){
              maxNumber = ostatok;
          }
        }
        System.out.printf("max value %d\t",maxNumber);
    }
}
