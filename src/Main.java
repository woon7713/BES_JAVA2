public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "홍길동";
        person.age = 20;
        person.cm = 185.0;
        person.weight = 93.5;
        person.sayHello();
        person.work();

        Person mzPerson = new Person();
        mzPerson.name = "김엠지";
        mzPerson.age = 18;
        mzPerson.MBTI = "ESTJ";

        Car car = new Car();
        car.brand = "newBrand";
        car.color = "Red";
        car.year = 2015;
        car.displayInfo();
        System.out.println(car.paybackMoney() + "원");






    }
}

class Person{
    String name;
    int age;
    double cm;
    double weight;
    String MBTI;


    public void sayHello(){
        System.out.println("이름은 " + name + " 나이는 " + age);
    }

    public void work(){
        System.out.println("일하는중..");
    }



}

class Car{
    String brand;
    int year;

    String color;

    void displayInfo(){
        System.out.println(brand + " " + year + " " + color);
    }

    int paybackMoney(){
        return (year - 1990) * 180000;
    }



}