import java.util.Random;

public class SecretCode {

    /*Суперзамок.секретный
    замок для сейфа состоит из 10 расположенных в ряд ячеек,в которые надо
    вставить игральные кубики.Но дверь открывается только в том случае,когда
    в любых трех соседних ячейках,сумма точек на игральных гранях кубиков
    равна 10.(игральный кубик имеет на каждой грани от 1 до 6
    точек). напишите программу,которая разгадывает код замка при условии что 2 кубика уже вставлены в ячейки*/

    public static void main(String[] args) {
        Random random = new Random();
        int valueOfCubeOne = 1+random.nextInt(6);//значение игральной кости
        int valueOfCubeTwo;
        int indexOfCubeTwo;
        int [] secretCode = new int[10];
        int size = secretCode.length; //длинна массива
        int indexOfCubeOne = random.nextInt(10);

    }
}
