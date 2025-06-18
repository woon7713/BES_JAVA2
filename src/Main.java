import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        fruits.add("Grape");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Strawberry");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        // for each의 내부
        Iterator<String> it =fruits.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }
        
    }
}
