public class Main {
    public static void main(String[] args) {
        int a = 10, b = 3;

        ++a;
        System.out.println(a);

        --b;
        System.out.println(b);

        a++;
        System.out.println(a);

        b--;
        System.out.println(b);

        // 후위 연산 직관적 확인
        int c = a++; // 후위연산, 할당 후 증가
        System.out.println(c + ", " + a);

    }
}
