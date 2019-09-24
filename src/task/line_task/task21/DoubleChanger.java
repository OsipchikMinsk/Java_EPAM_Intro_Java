package line_task.task21;
/*Дано действительное число R вида nnn.ddd. Поменять местами дробную с целой частья чтоб был вид
ddd.nnn*/

public class DoubleChanger {

    public static void main(String[] args) {
        double nnn_ddd = 123.456;
        int nnn = (int) nnn_ddd;
        double ddd = nnn_ddd - nnn;
        ddd = ddd * 1000;
        ddd = (int) ddd;
        double ddd_nnn = ddd + nnn / 1000.0;
        System.out.println(nnn_ddd);
        System.out.println(ddd_nnn);
    }
}
