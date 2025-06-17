@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
@FunctionalInterface
interface Operation {
    int apply(int x);
}
public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;
        System.out.println(add.operate(5, 3));
        System.out.println(multiply.operate(5, 3));

        Operation square = (x) -> x * x;
        System.out.println(square.apply(7));



    }
}