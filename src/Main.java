public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String greet(){

        return "Hello, World!";
    }

    static String greet(String name) {

        return "Hello, " + name + "!";
    }

    static String greet(String name, int age) {

        return name + age;
    }

    public static void main(String[] args) {
//        System.out.println(add(3, 4));
//        System.out.println(add(3, 4, 7));
//        System.out.println(add(1.2, 2.3));

        System.out.println(greet());
        System.out.println(greet("Alice"));
        System.out.println(greet("Zonic", 3));
    }
}
