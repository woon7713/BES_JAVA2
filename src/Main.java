import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        int itemNum = 3;
        int money = 0;
        int price = 0;
        int lastPrice = 0;

        System.out.print("자판기 입니다. 돈을 넣으세요.\n투입금액 입력: ");
        money = sc.nextInt();
        System.out.println("0: 종료 / 1: 콜라(1000원) / 2: 사이다(900) / 3: 제로콜라(1200)");
        do {
            System.out.print("입력하세요: ");
            String item ="";
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    check = false;
                    break;
                case 1:
                    item = "콜라";
                    price = 1000;
                    break;
                case 2:
                    item = "사이다";
                    price = 900;
                    break;
                case 3:
                    item = "제로 콜라";
                    price = 1200;
                    break;
                default:
                    price = 0;
                    System.out.println("비정상 입력 감지.. 입력 재시도.. ");
            }

            money -= price;
            lastPrice = price; // 마지막 거래 가격 기억

            if(choice > 0 && choice <= itemNum && money > 0){
                System.out.println(item + "이(가) 나왔습니다.");
                System.out.println("남은 금액 : " + money);
            }

            if (money < 0){
                money += lastPrice; // 마이너스 거래 취소

                System.out.println("추가금을 투입하시겠습니까..?");
                System.out.println("아니요(종료): 0 / 예(추가금 투입): 1");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.print("자판기 입니다. 추가금을 넣으세요.\n투입금액 입력: ");
                    money += sc.nextInt();
                } else if (choice == 0) {
                    check = false;
                }
            }
        }while (check);

        System.out.println("자판기 종료.. \t 남은 금액: " + money);

    }
}