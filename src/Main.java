public class Main {
    public static void main(String[] args) {

        boolean a = false;

        do {
            System.out.println("무한 루프?");
        } while (a);

        int i = 0;
        a = true;

        while (a) {
            System.out.println(i);
            i++;

            if(i>10000){
                a= false;
            }

        }

    }
}