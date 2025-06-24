import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) // 런타임에도 어노테이션이 존재할 수 있게 해야지 리플렉션에서 확인가능. 컴파일까지 해서 런타임에 안올려서 자원을 아낄것이냐 등등, 런타임까지 갈 필요없으면 클래스레벨에서 멈추면 됨.
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String author();
    String date();
    int version() default 1;
}


@CustomInfo(author = "John Doe", date = "2025-03-25", version = 2)
class Demo{
    @CustomInfo(author = "Jane Smith", date = "2025-03-26")
    public void display() {
        System.out.println("Display method executed.");
    }

}

public class Main {

    public static void main(String[] args) {
        Demo demo = new Demo(); // 리플렉션으로 인스턴스까지 만들었는데 안되는건가? 아니면 안한건가 예제에서
        Class<?> demoClass = demo.getClass();
        if (demoClass.isAnnotationPresent(CustomInfo.class)) { // 어노테이션 존재 체크
            CustomInfo info = demoClass.getAnnotation(CustomInfo.class); // 실제 어노테이션 객체 가져오기
            System.out.println("작성자: " + info.author());
            System.out.println("작성일: " + info.date());
            System.out.println("버전: " + info.version());

            CustomInfo classInfo = demoClass.getAnnotation(CustomInfo.class);
            System.out.println("Class -> Author: " + classInfo.author() +
                    ", Date: " + classInfo.date() +
                    ", Version: " + classInfo.version());

            try {
                Method m = demoClass.getMethod("display");
                if (m.isAnnotationPresent(CustomInfo.class)) {
                    CustomInfo mi = m.getAnnotation(CustomInfo.class);
                    System.out.println("Method -> Author: " + mi.author() +
                            ", Date: " + mi.date() +
                            ", Version: " + mi.version());
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

        }


    }
}