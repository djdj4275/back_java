package section12.Practice;

// 다중 인터페이스 (2)

interface Machine {
    void start(); 
    void stop();
}

interface Drivable2 {
    void drive();
}

interface Flyable2 {
    void fly();
}

interface FlyingMachine extends Machine, Drivable2, Flyable2 {}

class FlyingCar2 implements FlyingMachine {
    public void drive() {
        System.out.println("Driving on the road");
    }

    public void fly() {
        System.out.println("Flying in the sky");
    }

    public void start() {
        System.out.println("Starting the engine");
    }

    public void stop() {
        System.out.println("Stopping the engine");
    }
}

public class Practice6 {
    public static void main(String[] args) {
        FlyingCar2 flyingCar2 = new FlyingCar2();

        flyingCar2.start();
        flyingCar2.drive();
        flyingCar2.fly();
        flyingCar2.stop();
    }
}
