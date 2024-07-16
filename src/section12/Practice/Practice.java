package section12.Practice;

// interface의 다형성
interface I {
    // abstract public void printClassName();
    void printClassName();
}

class A implements I {
    @Override
    public void printClassName() {
        System.out.println("A class");
    }
}

class B implements I {
    @Override
    public void printClassName() {
        System.out.println("B class");
    }
}

class C implements I {
    @Override
    public void printClassName() {
        System.out.println("C class");
    }
}

// class의 다형성
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }

    @Override
    void stop() {
        System.out.println("Bike is stopping");
    }
}

public class Practice {
    public static void main(String[] args) {
        I a = new A();
        I b = new B();
        I c = new C();

        a.printClassName();
        b.printClassName();
        c.printClassName();

        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();

        // interface의 다형성
        I[] iArray = {new A(), new B(), new C()};
    }
}
