package line_task.task12;
import static java.lang.Math.pow;

/*
Вычислить расстояние между двумя точками на плоскости по известным координатам
*/

public class Point {

    private static double calculateDistanceBetweenPoints(int a, int b, int c, int d ){
        return pow(pow(c-a,2)+ pow(d-b,2),1.0/2);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = 5;
        int d = 100;
        double distanceBetweenPoints = Point.calculateDistanceBetweenPoints(a,b,c,d);
        System.out.printf("Distance between points = %f",distanceBetweenPoints);
    }
}
