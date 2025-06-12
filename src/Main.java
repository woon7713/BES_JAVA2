class Vehicle{
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    void display(String brand) {
        System.out.println(brand);
    }

}

class Car extends Vehicle{
    String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;

    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("브랜드", "모델");
        car.display("뉴브랜드");


    }
}