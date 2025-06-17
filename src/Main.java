import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"홍길동", "김철수", "영희"};

        // 람다식 방식
        Arrays.stream(names).forEach(name -> System.out.println(name));

        // 메서드 참조 방식 (더 간단히)
        Arrays.stream(names).forEach(System.out::println);
    }
}