public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a/b;
            System.out.println("result : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("0으로 나누려고 시도함");

        }



    }
}