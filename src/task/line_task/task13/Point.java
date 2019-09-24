package line_task.task13;
/*
Заданы координаты трех вершин треугольника . Найти его периметр и площадь
*/

import static java.lang.Math.pow;

public class Point {

    private static double calculateDistanceBetweenPoints(int a, int b, int c, int d ) {
        return pow(pow(c - a, 2) + pow(d - b, 2), 1.0 / 2);
    }

    private static double calculatePerimeter (double a,double b,double c){
        return a+b+c;
}

    private static double calculateAreaOfTriangle(double a, double b, double c) {   //по формуле Герона
        double halfPerimeter = Point.calculatePerimeter(a, b, c) / 2;
        return pow(halfPerimeter * (halfPerimeter - a)
                * (halfPerimeter - b)
                * (halfPerimeter - c), 1.0 / 2);
    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 10;
        int x2 = 5;
        int y2 = 20;
        int x3 = 30;
        int y3 = 20;
        double aB = Point.calculateDistanceBetweenPoints(x1,y1,x2,y2);
        double bC = Point.calculateDistanceBetweenPoints(x2,y2,x3,y3);
        double aC = Point.calculateDistanceBetweenPoints(x1,y1,x3,y3);
        double perimeterOfTriangle = Point.calculatePerimeter(aB,aC,bC);
        double areaOfTriangle = Point.calculateAreaOfTriangle(aB,bC,aC);
        System.out.println("perimeter of triangle = " +perimeterOfTriangle);
        System.out.println("area of triangle = " + areaOfTriangle);//

    }
}