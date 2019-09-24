package loop.Task26;
/*

Вывести на экран таблицу соответсвий ASCII
*/

public class TableOfSymbols {
    public static void main(String[] args) {
        char symbol;
        for (int i=0;i<255;i++){
           symbol = (char) i;
            System.out.println("Value = " + i + " Symbol = " + symbol );
        }
    }
}
