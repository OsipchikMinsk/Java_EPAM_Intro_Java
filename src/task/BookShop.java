import java.util.Scanner;

public class BookShop {

   /* Составить программу реализующую эпизод применения компьютера в магазине. Компьютер запрашивает стоимость книг
            сумму денег внесенную покупателем, если сдача не требуется печатает Спасибо,  и все возможные варианты=>
    небостаточно средст или возьмите сдачу*/

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int moneyForBook = 1000;
        System.out.printf("Give me %d rub",moneyForBook);
        int moneyBuyer = scanner.nextInt();
        if (moneyBuyer==moneyForBook){
            System.out.println("Спасибо!");
        }else if (moneyBuyer<moneyForBook){
            System.out.printf("Ups! Недостаточно средств, еще необходимо %d ",moneyForBook-moneyBuyer);
        }else {
            System.out.printf( "Ваша сдача %d ",moneyBuyer-moneyForBook );
        }

    }
}
