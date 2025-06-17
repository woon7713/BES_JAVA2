public class Main {
    public static int convertToInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        String strNum = "1234a";
        try {
            int num = convertToInt(strNum);
            System.out.println("변환 결과: " + num);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류!");
        }



    }
}
