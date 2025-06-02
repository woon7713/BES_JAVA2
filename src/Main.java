public class Main {
    // 클래스 내부(필드 영역) enum 선언
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
        SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        int num = 0;

        switch (num) {
            case 0:
                System.out.println("num은 0");
                break;
            case 1:
                System.out.println("num은 1");
                break;
            case 2:
                System.out.println("num은 2");
                break;
            case 3:
                System.out.println("num은 3");
                break;
        }

        String mood = "idontknow";

        switch(mood){
            case "happy":
                System.out.println("기분은 happy");
            case "sad":
                System.out.println("기분은 sad");
                break;
            case "angry":
                System.out.println("기분은 angry");
            default:
                System.out.println("내 기분을 몰라");
        }

        mood = "happy";

        if(mood == "happy") {
            System.out.println("나는 행복하다. 왜냐하면 행복하기 때문이다.");
        } else if (mood == "sad") {
            System.out.println("슬퍼");
        } else if (mood == "angry") {
            System.out.println("기분은 angry");
        } else{
            System.out.println("내 기분 몰라");
        }


        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Weekday");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknown day");
        }






    }
}
