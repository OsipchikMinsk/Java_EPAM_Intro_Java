package line_task.task24;
/*
Найти площадь равнобедренной трапеции с основанием a и b и углом  альфа при большем основании a
 */
public class Trapezium {
    private static double areaOfTrapezium(int smallBaseOfTrapezium, int bigBaseOfTrapezium, int angleBetweenBase) {
        return 0.5 * (Math.pow(bigBaseOfTrapezium, 2) - Math.pow(smallBaseOfTrapezium, 2))
                * Math.tan(angleBetweenBase);
    }

    public static void main(String[] args) {
        int smallBaseOfTrapezium = 100;
        int bigBaseOfTrapezium = 150;
        int angleBetweenBase = 60;
        double areaOfTrapezium = Trapezium.areaOfTrapezium(smallBaseOfTrapezium, bigBaseOfTrapezium, angleBetweenBase);
        System.out.println(areaOfTrapezium);
    }

}
