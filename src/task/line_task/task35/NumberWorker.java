package line_task.task35;

public class NumberWorker {

    public static void main(String[] args) {
        int m = 60;
        int n = 28;
        double resultDivision = (double) m / n;
        double valueAfterPoint = resultDivision - (int) resultDivision;
        System.out.printf("%d:%d = %f\n",m,n,resultDivision);
        System.out.printf("Младшая цифра целой части  = %d и старшая " +
                "цифра дробной части =  %d\n", (int) resultDivision % 10, (int) (valueAfterPoint * 10));


    }

}
