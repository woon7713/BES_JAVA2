public class Outer {

    static class StaticInner{
        void printData() {
            System.out.println("hi");
        }
    }

    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.printData();

    }
}