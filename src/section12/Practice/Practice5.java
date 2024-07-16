package section12.Practice;

// 다중 인터페이스
interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

class FlyingCar implements Drivable, Flyable {
    public void drive() {
        System.out.println("Driving on the road");
    }

    public void fly() {
        System.out.println("Flying in the sky");
    }
}

public class Practice5 {
    public static void main(String[] args) {
        FlyingCar flyingCar = new FlyingCar();

        flyingCar.drive();
        flyingCar.fly();
    }
}
