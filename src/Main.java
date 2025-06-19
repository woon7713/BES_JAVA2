import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

    // 확장이 Number 까지만
    public static double sumList(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(0.3, 0.2);

        System.out.println("합계: " + sumList(intList));
        System.out.println("합계: " + sumList(doubleList));


    }
}