package line_task.task11;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/*
Вычислить периметр и площадь прямоугольного треугольника по двук катетам
*/

public class RightTriangle {

    private static double calculatePerimeter(int a, int b) {
        double hipotenuza = sqrt(pow(a, 2.0) + pow(b, 2.0));
        return a + b + hipotenuza;
    }

    private static double calculateAreaOfTriangle(int a, int b) {
        return 0.5 * a * b;
    }

    public static void main(String[] args) {
        int a = 10; //длинна катета прямоугольного треугольника
        int b = 20; //длинна катета прямоугольного треугольника
        double perimeterOfTriangle = RightTriangle.calculatePerimeter(a, b);
        double areaOfTriangle = RightTriangle.calculateAreaOfTriangle(a, b);
        System.out.printf("Perimeter of triangle = %f%n", perimeterOfTriangle);
        System.out.printf("Area of triangle = %f", areaOfTriangle);
    }

}
