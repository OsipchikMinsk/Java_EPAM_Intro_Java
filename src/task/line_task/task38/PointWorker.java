package line_task.task38;

 /*
 Для данных областей составить линейную программу печатающую true или false, если точка принадлежит закрашенной
         области на графике
*/

public class PointWorker {
       public static void main(String[] args) {
        int x = 0;
        int y = -5;

        //рис а треугольник
           if(x>-5&&x<5&&y>-1&&y<5&&y<=4-x||y>=x+4){
               System.out.println(true);
           }else{
               System.out.println(false);
           }

         // рис b два прямоугольника
         if((x>-3&&x<3&&y>-1&&y<5)||(x>-5&&x<5&&y<1&&y>-5)){
             System.out.println(true);
         }  else {
             System.out.println(false);
         }

         // рис с два сектора
           int radius1 = 4; //радиус верхнего сектора согласно рисунка
           int radius2 = 5; //радиус нижнего сектора согласно рисунка
           double h =  Math.sqrt(x*x+y*y);

           //проводим из нашей точки в центр координат воображаемуб прямую, она и будет исходным
           //радиусом который нужно посчитать и сравнить с известным значением радиуса

           if((h<=radius1&&x>-1&&x<5&&y>-1&&y<5)||(h<=radius2&&x>-1&&x<6&&y<1&&y>-6)){
               System.out.println(true);
           } else {
               System.out.println(false);
           }
    }
}
