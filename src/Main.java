public class Main {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 4;
//        int max = (a>b) ? a:b;
//        System.out.println(max);
//
//        if(a>b){
//            max = a;
//        }
//        else{max = b;}
//
//        System.out.println(max);
//
//
//        int score = 60;
//        String PF = (score >= 60) ? "통과" : "탈락";
//        System.out.println(PF);
//
//        if(score >= 60){
//            PF = "통과";
//        }
//        else{
//            PF = "탈락";
//        }
//        System.out.println(PF);

        String color = "파랑";

        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : "빨강 파랑 외";
        System.out.println(choiceColor);

        if (color == "빨강") {
            System.out.println("빨강");
        } else if (color == "파랑") {
            System.out.println("파랑");
        } else {
            System.out.println("보라");
        }




    }
}
