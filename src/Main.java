class Person{
    int a = 0;
    static int b = 1;

    public static void hi(){
        System.out.println("hi static method");
        //System.out.println(a); // 접근 X
        System.out.println(b);
    }

    public void hello() {
        System.out.println("hello");
    }


}

public class Main {
    public static void main(String[] args) {
        //static 메서드는 클래스 이름으로 직접 호출
        Person.hi();

        //인스턴스 메서드는 객체를 생성해 호출
        Person p = new Person();
        p.hello();




    }
}