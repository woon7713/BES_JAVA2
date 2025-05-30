import java.util.*; // ArrayList 등 import

public class Main {
    public static void main(String[] args) {
        byte level = 1;
        short cm = 180;
        int age = 20;
        long m = 200;
        float pi = 1.123456789f;     // float: 정밀도 약 7자리
        double k = 1.1234567890123456; // double: 정밀도 약 15~16자리
        /*
        float은 가볍지만 부정확, double은 무겁지만 더 정확
        float 4 byte | 단정도 32bit 정밀도
        dobule 8 byte | 배정도 64bit 정밀도
         */

        char grade = 'A';
        boolean real = true;

        String name = "James"; // 문자(char)는 ' ' || 문자열(String)은 " " -> 언어마다 다름
        int[] box = {1, 2, 3};

        System.out.println("age = " + age + ", " + level + "년 후");
        age = 21;
        System.out.println("age = " + age);

        Dog dog = new Dog();
        System.out.println("개 종류" + dog.category);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        for(String fruit: fruits){
            System.out.println(fruit);
        }
        System.out.println(fruits.get(1));// List의 특정 요소에 접근


    }
}

class Dog{
    String category = "진돗개";
    boolean sex = false; // false = 암컷, true = 수컷


}
