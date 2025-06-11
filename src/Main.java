public class Main {
    public static void main(String[] args) {
        String name = "Son";
        int backNumber = 7;
        double pi = 3.14159265359;

        System.out.println((name + backNumber).getClass().getName()); // 참조타입 체크, 문자열 결합
        System.out.print("탭\t탭\t탭\n그리고 줄바꿈과 \"큰따옴표\" 마지막으로 역슬래시 \\");
        System.out.println(); // 아무것도없이 사용해서 줄바꿈으로도 가능
        System.out.printf("%.2f\n", pi); // 개행(줄바꿈)이 없음, 소수점 2자리 까지
        System.out.printf("%.8f\n", pi); // 소수점 8자리까지
        System.out.print(pi); // 그대로
        System.out.printf("\n%s의 등번호는 %d", name, backNumber);

    }
}