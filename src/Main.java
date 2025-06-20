import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Double> values = Arrays.asList(10.0, 20.0, 30.0);

        double avg = values.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0); // 기본값 설정, 안전장치 . 0으로 나눌수없음, 갯수가 0일땐 평균이 0

        System.out.println(avg);



    }
}