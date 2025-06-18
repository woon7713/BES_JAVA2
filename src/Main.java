import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Banana");
        linkedSet.add("Apple");
        linkedSet.add("Cherry");
        linkedSet.add("Banana");

        System.out.println(linkedSet); // [Banana, Apple, Cherry]



    }
}