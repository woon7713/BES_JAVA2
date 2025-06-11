import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int number = sc.nextInt();
        double value = sc.nextDouble();
        char ch = sc.next().charAt(0);

        System.out.println(name + " " + number + " " + value + " " + ch);

        sc.close(); // Scanner 사용 후 close() 호출, Scanner 메모리와 자원 정리.

    }
}