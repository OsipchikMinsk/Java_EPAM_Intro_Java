package line_task.task33;

public class CharWorker {
    private static int getValueOfChar (char a){
        return a;
    }

    public static void main(String[] args) {
        char middle = 'd';
        int charToint = middle;
        charToint--;
        char left = (char) charToint;
        charToint = charToint + 2;
        char right = (char) charToint;
        System.out.println("start = " + middle + " value = " + CharWorker.getValueOfChar(middle));
        System.out.println("left = " + left + " value = " + CharWorker.getValueOfChar(left));
        System.out.println("right = " + right + " value = " + CharWorker.getValueOfChar(right));

    }
}
