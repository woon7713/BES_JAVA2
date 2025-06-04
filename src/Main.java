public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("19 x " + i + " = " + 19 * i);
        }

        for (int i = 8; i > 0; i--) {
            System.out.println("19 x " + i + " = " + 19 * i);
        }



        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(i + " x " + j + " = " + i*j);
                if(j != 9){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        int number = 5;

        for (int i = 1; i <= 19; i++) {
            if (i >= 5) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        for (int i = 21; i > 0; i--) {
            if(i%2 == 0) {
                System.out.println("짝수 = " + i);
            }
        }

        for (int i = 1; i < 11; i++) {
            if (i%2 != 0){
                System.out.println("홀수 = " + i);
            }
        }

        for (int i = 1; i < 21; i++) {
            if (i%3 == 0){
                System.out.println("3의 배수 = " + i);
            }

        }

        for (int i = 21; i > 0; i--) {
            if (i%4 == 0){
                System.out.println("4의 배수 = " + i);
            }

        }






    }
}
