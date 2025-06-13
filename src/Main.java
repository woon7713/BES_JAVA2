class Person{
    public String name;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("그런 나이는 없어요");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "홍길동";
        person1.setAge(1);

        System.out.println(person1.name);
        System.out.println(person1.getAge());
    }
}
