class Car{
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    class Engine{
        public void start() {
            System.out.println("The engine of " + brand + " is starting.");
        }
    }

    public void startEngine() {
        Engine engine = new Engine();
        engine.start();

    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("붕붕");
        car.startEngine();


    }
}