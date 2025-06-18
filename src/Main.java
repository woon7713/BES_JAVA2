import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("Apple");
        list.add("Apple");
        set.add("Banana");
        set.add("Banana"); // 중복 추가 무시

        System.out.println(list);
        System.out.println(set);



    }
}