import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers [" + i + "] = " + numbers[i]);
        }

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println("numbers [" + i + "] = " + numbers[i]);
        }


        System.out.println(numbers.length);


        int[] box = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < box.length; i++) {
            sum += box[i];
        }
        System.out.println(sum);


    }
}
