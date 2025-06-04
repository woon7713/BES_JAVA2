public class Main {
    public static void main(String[] args) {
        int number = 2147483647;
        String binaryString = Integer.toBinaryString(number); // Integer -> int의 참조타입, 기능이 존재함.
        String hexString = Integer.toHexString(number);

        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + binaryString);
        System.out.println("Hexadecimal: " + hexString);

    }
}