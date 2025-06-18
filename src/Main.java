import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Dragonfruit");
        fruits.add("Cherry");
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Tomato");
        fruits.add("Apple");

        fruits.remove("Tomato");
        fruits.remove(0);

        Collections.sort(fruits);

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        // equals로 체크해서 던져주는 내부 로직 때문에 대소문자까지 체크
        if(fruits.contains("Banana")) {
            System.out.println("Banana 포함되어 있습니다.");
        }

        int index = fruits.indexOf("Banana");
        fruits.set(1, "AppleMango");
        List<String> sliced = fruits.subList(0, 2);

        for(String slicedList: sliced){
            System.out.println(slicedList);
        }

        System.out.println("리스트 크기: " + fruits.size());

        fruits.clear();
        System.out.println(fruits);

        if (fruits.isEmpty()) {
            System.out.println("리스트가 비어있음");
        }
        else{
            System.out.println("리스트에 요소가 존재");
        }

        System.out.println("리스트 크기: " + fruits.size());





    }
}
