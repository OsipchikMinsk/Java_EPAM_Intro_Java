package line_task.task25;
/*
найти корни квадратного уравнения  ax2 + bx + c = 0 с заданными коэфицентами a, b, c
(предполагается что а!=0 и что дискриминант не отрицателен)
*/


public class CounterOfRoot {
    private static double calculateRootOne(int a, int b, int c) {
        return -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a;
    }

    private static double calculateRootTwo(int a, int b, int c) {
        return -b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        int c = 2;
        double rootOne = CounterOfRoot.calculateRootOne(a, b, c);
        double rootTwo = CounterOfRoot.calculateRootTwo(a, b, c);
        System.out.println("x1 = " + rootOne);
        System.out.println("x2 = " + rootTwo);

    }
}
