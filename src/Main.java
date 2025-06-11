class Car {
    String brand;
    int year;
    String model;
    String nickName;

    public  Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }


    public  Car(String brand, int year, String model, String nickName) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.nickName = nickName;
    }

    public String displayinfo() {
        String info = "차의 브랜드는 " + brand + ", 연식은 " + year + ", 모델명은 " + model + "입니다.";
        if (nickName != null && !nickName.equals("")) {
            info += " 별명은 " + nickName + "입니다.";
        }
        return info;
    }

}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Hyundai",15, "sonata");
        Car c2 = new Car("Mercedes-Benz", 23, "E320d", "붕붕이");

        System.out.println(c1.displayinfo());
        System.out.println(c2.displayinfo());
    }

}