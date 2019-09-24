package line_task.task18;

/*
Дана длинна ребра куба. Найти площадь грани, площадь полной поверхности и объем куба
*/

public class Cube {

    private static int calculateAreaOfCubeFace(int a) { //площадь грани куба
        return a * a;
    }

    private static int calculateAreaOfCube(int a) {  //площадь самого куба
        return a * a * 6;
    }

    private static int calculateCapacityOfCube(int a) { //объем куба
        return a * a * a;
    }

    public static void main(String[] args) {
        int cubeEdge = 10;
        int areaOfCubeFace = Cube.calculateAreaOfCubeFace(cubeEdge);
        int areaOfCube = Cube.calculateAreaOfCube(cubeEdge);
        int areaOfCapacityCube = Cube.calculateCapacityOfCube(cubeEdge);
        System.out.println("area of cube face = " + areaOfCubeFace);
        System.out.println("area of cube  = " + areaOfCube);
        System.out.println("area of capacity cube  = " + areaOfCapacityCube);
    }
}
