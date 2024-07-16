package section12.Practice;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}

class Ride {
    void ride(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();

        Ride ride = new Ride();
        ride.ride(myCar); // Car object를 Vehicle interface type으로 받아서 start(), stop() method 호출
    }
}
