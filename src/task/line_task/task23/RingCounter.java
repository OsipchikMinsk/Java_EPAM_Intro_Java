package line_task.task23;
/*
Найти площадь кольца, внутренний радиус которого равенr, а внешний - R(R>r)
*/

public class RingCounter {
    private static double calculateAreaOfRing(int rSmall, int rBig){//если радиус большого колца меньше вернуть 0
        return (rBig>rSmall)?3.14 *Math.pow(rBig,2) - 3.14*Math.pow(rSmall,2):0;
    }

    public static void main(String[] args) {
        int radiusOfSmallRing = 10;
        int radiusOfBigRing = 11;
        double areaOfRing = RingCounter.calculateAreaOfRing(radiusOfSmallRing,radiusOfBigRing);
        System.out.println(areaOfRing);
    }
}
