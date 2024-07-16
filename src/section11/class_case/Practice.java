package section11.class_case;

// --------------------------------------------------------- class 사용시
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {}
class Lion extends Animal {}

class ZooKeeper {
    void feed(Tiger tiger) {
        System.out.println("feed tiger food");
    }

    void feed(Lion lion) {
        System.out.println("feed lion food");
    }
}

// --------------------------------------------------------- interface 사용시

interface Predator {
    String getFood(); // 인터페이스에선 public 생략가능
}

class Animal2 implements Predator {
    String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return "any food";
    }
}

class Tiger2 extends Animal2 {
    @Override
    public String getFood() {
        return "tiger food";
    }
}

class Lion2 extends Animal2 {
    @Override
    public String getFood() {
        return "lion food";
    }
}

class ZooKeeper2 {
    void feed(Predator predator) {
        System.out.println("feed "+ predator.getFood());
    }
}

public class Practice {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);

        // ------------------------------------------

        ZooKeeper2 zooKeeper2 = new ZooKeeper2();

        Tiger2 tiger2 = new Tiger2();
        tiger2.setName("tiger");
        Lion2 lion2 = new Lion2();
        lion2.setName("lion");

        zooKeeper2.feed(tiger2);
        zooKeeper2.feed(lion2);
    }
}
