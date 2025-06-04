import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Scanner 객체 생성
        int input;

        do {
            System.out.println("자판기입니다.");
            input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.println("coke");
                    break;
                case 2:
                    System.out.println("cider");
                    break;
                case 3:
                    System.out.println("3 입력");
                    break;
                default:
                    System.out.println("잘못된 입력");
            }

        } while (input != 0);


    }
}