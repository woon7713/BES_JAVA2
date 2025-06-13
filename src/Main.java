public class Main {
    public static String publicField = "i am public";



    public static void main(String[] args) {
        System.out.println(publicField);


    }

}


class Child extends Main {
    public Child() {
        System.out.println(Main.publicField);
    }
}