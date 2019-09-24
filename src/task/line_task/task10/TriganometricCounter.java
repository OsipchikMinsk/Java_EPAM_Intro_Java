package line_task.task10;

import static java.lang.Math.*;

public class TriganometricCounter {
    public static void main(String[] args) {
        double x = 45;
        double y = 90;
        double result;
        result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x) * tan(y);
        System.out.println(result);
    }
}
