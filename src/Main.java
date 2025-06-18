import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 1000);
        fruitPrices.put("Banana", 600);
        int sum = 0;

        for (Map.Entry<String, Integer> entry: fruitPrices.entrySet()) {
            sum += entry.getValue();
        }

        System.out.println(sum/fruitPrices.size());


    }
}