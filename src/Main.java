import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        char operator;
        double result = 0;

        System.out.print("처음 숫자를 입력: ");
        num1 = sc.nextDouble();
        result = num1;

        double pastNum = 0;

        while (true) {
            System.out.print("연산자 입력 (+, -, *, /) - '#' 입력시 종료: ");
            operator = sc.next().charAt(0);
            if(operator == '#'){
                System.out.println("강제종료");
                return;
            }

            System.out.print("다음 숫자를 입력: ");
            num2 = sc.nextDouble();

            pastNum = result; // 연산 전 값 저장
            switch (operator){
                case '+':
                    result += num2;
                    break;
                case '-':
                    result -= num2;
                    break;
                case '*':
                    result *= num2;
                    break;
                case '/':
                    if(num2 != 0){ // NaN, Infinity 결과 방지
                        result /= num2;
                        break;
                    }
                default:
                    System.out.println("잘못된 입력.. 다시 입력..");
            }
            System.out.printf("%.2f %c %.2f = %.2f\n\n", pastNum, operator, num2, result);
        }



    }
}