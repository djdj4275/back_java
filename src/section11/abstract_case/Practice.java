package section11.abstract_case;

// 추상 클래스 & 추상 메소드

// 1. 추상 클래스는 객체 직접 생성불가.
// 2. 다른 클래스에 상속해서 사용함
// 3. 하나 이상의 추상 메소드가 포함되어있다면 반드시 그 클래스는 추상 클래스로 정의되어야함.
// 4. 추상 클래스를 상속한 클래스는 내부의 추상 메소드를 반드시 구현하여 사용해야함

abstract class Animal { // 추상 메소드가 하나라도 존재하면 클래스도 추상 클래스로 선언되야함
    String name;

    void eat() {
        System.out.println(this.name + "eat");
    }

    abstract void makeSound(); // 추상 메소드는 대괄호 사용 x
}

class Dog extends Animal { // 추상 클래스는 자식에게 상속시켜 사용

    Dog(String name) {
        this.name = name;
    }

    void makeSound() { // 추상 클래스는 상속시켜 사용시 내부의 추상메소드를 무조건 완성시켜야함
        System.out.println(this.name + " sound");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // 추상 클래스는 객체생성이 불가함

        Dog dog = new Dog("poppy");
        dog.makeSound();
        dog.eat();
    }
}
