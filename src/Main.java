public class Main {
    public static void main(String[] args) {
/*        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }*/

        for (int i = 1; i <= 20; i++) {
            if(i % 5 == 0){
                continue;
            }
            if(i >= 15){
                break;
            }
            System.out.print(i + " ");
        }

    }
}
