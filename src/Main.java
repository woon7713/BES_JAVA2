import java.util.Arrays;
import java.util.List;
public class Main {
    public static void printElements(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("a", "b", "c");

        printElements(numbers);
        printElements(words);


    }
}