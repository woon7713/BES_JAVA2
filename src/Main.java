import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        System.out.println(treeSet); // [Apple, Banana, Cherry]

    }
}