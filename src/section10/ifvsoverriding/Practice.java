package section10.ifvsoverriding;

class Animal {
    void cry() {}
}

// Animal 안의 cry메소드를 오버라이딩해서 각 메소드에서 사용후
// 불러올때 안의 오버라이딩된 메소드를 불러와서 실행 (다형성)
class Pig extends Animal {
    void cry() {
        System.out.println("꿀꿀");
    }
}
class Cow extends Animal {
    void cry() {
        System.out.println("음메");
    }
}
class Tiger extends Animal {
    void cry() {
        System.out.println("어흥");
    }
}
class Lion extends Animal {
    void cry() {
        System.out.println("어흥2");
    }
}
class Duck extends Animal {
    void cry() {
        System.out.println("꽥꽥");
    }
}

// 결합도는 높고, 응집도는 낮음 
// 타 클래스에 의존적이며, 타 클래스 수정시 이 클래스도 많은 수정이 필요하기에 응집도는 낮음
class Farm {
    void sound(Animal animal) {
        // if (animal instanceof Pig) {
        //     System.out.println("꿀꿀");
        // } else if (animal instanceof Cow) {
        //     System.out.println("음메");
        // } else if (animal instanceof Tiger) {
        //     System.out.println("어흥");
        // } else if (animal instanceof Lion) {
        //     System.out.println("어흥2");
        // }

        animal.cry();
    }
}

public class Practice {
    public static void main(String[] args) {
        Farm f = new Farm();
        Pig p = new Pig();
        Cow c = new Cow();
        Tiger t = new Tiger();
        Lion l = new Lion();
        Duck d = new Duck();

        f.sound(p);
        f.sound(c);
        f.sound(t);
        f.sound(l);
        f.sound(d);
    }
}
