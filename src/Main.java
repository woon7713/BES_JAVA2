class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hi(){
        System.out.println(name + age);
    }
}

public class Main{
    public static void main(String[] args) {
        Person person = new Person("Alice", 20); //1

//        person.name = "홍길동"; //2
//        person.age = 20; //3

        person.hi();//4

    }
}
