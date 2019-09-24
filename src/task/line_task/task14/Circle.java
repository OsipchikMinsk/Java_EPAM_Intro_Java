package line_task.task14;
import static java.lang.Math.pow;
/*
Вычислить длинну иплощадь круга одного и того же заданного радиуса R
*/

public class Circle {
    private static double lengthOfCircle (int r){
        return 2*3.14*r;
    }
    private static double areaOfCircle (int r){
        return 3.14*pow(r,2.0);
    }

    public static void main(String[] args) {
        int radius = 10;
        double lengthOfCircle = Circle.lengthOfCircle(radius);
        double areaOfCircle = Circle.areaOfCircle(radius);
        System.out.printf("Length of circle %f\n",lengthOfCircle);
        System.out.printf("Area of circle %f",areaOfCircle);
    }

}
