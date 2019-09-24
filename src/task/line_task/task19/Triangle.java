package line_task.task19;
import static java.lang.Math.*;

/*Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту,
  радиусы вписанной и описанной окружностей*/

public class Triangle {

    private static double calculateAreaOfTriangle (int a){ //площадь равностороннего треугольника
        return (pow(a,3)*sqrt(3))/4;
    }
    private  static  double calculateHeightOfTriangle (int a){ //высота равностороннего треугольника
        return a*sqrt(3)/2;
    }
    private static double calculateRadiusInCircle (int a){ //радиус вписанной окружности
        return a/(2*sqrt(3));
    }
    private static double calculateRadiusOutCircle (int a){ //радиус описанной окружности
        return a/sqrt(3);
    }

    public static void main(String[] args) {
        int sideOfTriangle = 12;
        System.out.println("Area of triangle = " + Triangle.calculateAreaOfTriangle(sideOfTriangle));
        System.out.println("Height of triangle = " + Triangle.calculateHeightOfTriangle(sideOfTriangle));
        System.out.println("Radius in circle = " + Triangle.calculateRadiusInCircle(sideOfTriangle));
        System.out.println("Radius out circle = " + Triangle.calculateRadiusOutCircle(sideOfTriangle));
    }
}
