class Animal{
    public void makeSound(){
        System.out.println();
    }

}

class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("월월");
    }


}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("야옹");
    }


}

class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("짹");
    }


}


public class Main {
    public static void main(String[] args) {
        // 다형성

        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Animal bird1 = new Bird();

        Animal[] animals = {dog1, cat1, bird1}; // 타입통일로 배열에 같이 넣을 수 있게됨
        dog1 = cat1; // 부모타입이므로 다른 자식 객체 참조도 할당해서 교체 가능. 하지만 실제 객체 타입은 달라 주의 필요.

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}