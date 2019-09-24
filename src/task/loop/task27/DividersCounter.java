package loop.task27;
/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого себя
*/

public class DividersCounter {
    private static void findAllDividers(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print(" Value " + i + ": " + "Dividers: ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 100;
        DividersCounter.findAllDividers(m, n);
    }
}
