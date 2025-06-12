class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("이름 : " + name);
    }

}

class Dog extends Animal{
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void printName(){
        System.out.println(name +" " + breed);
    }


}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("name1", "breed1");
        dog.printName();

    }
}