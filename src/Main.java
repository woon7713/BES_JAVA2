public class Main {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if(age >= 19 && hasID){
            System.out.println("접속 가능");
        }
        else
            System.out.println("접속 불가");

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("쉴 수 있다");
        }

        boolean isRaining = true;
        if (!isRaining) {
            System.out.println("맑음");
        }
        else{
            System.out.println("비온다");
        }



    }
}
