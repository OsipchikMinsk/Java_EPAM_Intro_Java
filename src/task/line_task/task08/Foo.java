package line_task.task08;


public class Foo {
    public static void main(String[] args) {
        double b = 10;
        double a = 20;
        double c = 10;
        double result = (b + Math.sqrt(Math.pow(b,2)+4*a*c)/2*a - (Math.pow(a,3)*c) + Math.pow(b,-2));
        System.out.println(result);
    }
}
