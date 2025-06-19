import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new TreeMap<>();

        fruitPrices.put("사과", 17900);
        fruitPrices.put("배", 123124);
        fruitPrices.put("포도", 312);
        fruitPrices.put("망고", 8674);

        System.out.println(fruitPrices.containsKey("사과"));
        System.out.println(fruitPrices.containsKey("망고"));
        System.out.println(fruitPrices.containsValue(312));
//        System.out.println(fruitPrices.containsKey(17900));
//        System.out.println(fruitPrices.getOrDefault("사과", 500));
//        System.out.println(fruitPrices.getOrDefault("멜론", 500));

        fruitPrices.replace("사과", 500);
        fruitPrices.remove("망고");

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (String key : fruitPrices.keySet()) {
            System.out.println(key);
        }






    }
}