package line_task.task27;
/*
Дано значение а. Не исспользуя никаких операций и функций, кроме умножения, получить значенеи а в 8 степени
 за три опрерации и значение а в 10 за четыре
 */


public class Pow {
    public static void main(String[] args) {
        int a =2;
        a = a*a; //1-ая операция
        a = a*a; //2-ая операция
        a= a*a; //3-ая операция
        System.out.println(a);
        a = a*a; //4-ая операция
        System.out.println(a);
    }
}
