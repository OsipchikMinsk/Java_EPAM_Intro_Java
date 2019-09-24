package line_task.task22;
/*
Дано натуральное число T, котрое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах минутах и секундах по следующей формуле
ННчММминSSсек
*/

public class TimeCounter {
    public static void main(String[] args) {
        int inputTime = 70000;
        int timeInSec = inputTime%60;
        int timeInMin = (inputTime/60)%60;
        int timeInHour = inputTime / 3600;
        System.out.printf("In %dsec %dч:%dмин:%dc",inputTime,timeInHour,timeInMin,timeInSec);




}

}
