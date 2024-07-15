package section10.castMethod;

class Animal {
    String name;

    Animal (String name) {
        this.name = name;
    }
}

class Dog extends Animal { // 부모클래스에서 생성자를 만들었다면 자식도 생성자 생성이 강요됨
    Dog (String name) {
        super(name); // 자식에선 부모와 같은형태를 위해 super를 사용
    }

    void sleep() {
        System.out.print("zzz ");
    }
}

class HouseDog extends Dog {
    HouseDog (String name) {
        super(name); // 자식에선 부모와 같은형태를 위해 super를 사용
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.print(this.name + "in house");
    }

    void guardHouse() {
        System.out.println(this.name + "집을 지킨다.");
    }
}

public class Practice {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("poppy");
        houseDog.sleep();
        houseDog.guardHouse();

        Dog dog = houseDog; // 자식에서 부모로 자동형변환
        // dog.guardHouse(); // 자식에는 있었지만 부모로 바뀌면 해당 메소드 사용불가
        dog.sleep(); // Dog 메소드 안에 있는 생성자로 사용됨.
    }
}
