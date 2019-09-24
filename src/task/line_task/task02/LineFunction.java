package line_task.task02;

/*
Найдите значение функции: c = 3+a;
*/

public class LineFunction {
    private static int foo (int x){
        return 3+x;
    }
    public static void main(String[] args) {
        int a = 10;
        int c = LineFunction.foo(a);
        System.out.println(c);
    }

}
