package section10.overriding;

class Animal {

}

class Dog extends Animal {

}

public class Practice {
    public static void main(String[] args) {
        // instanceof 연산자
        // 객체 instanceof 타입(참조)

        // (d는 Dog 클래스에 의해 만들어진 객체다란 의미 == d는 Dog 클래스의 인스턴스이다.)
        // (d는 Dog클래스의 인스턴스이고 Dog는 Animal의 자식클래스 이므로 d는 Animal 클래스의 인스턴스도 된다.)
        Dog d = new Dog();
        System.out.println(d instanceof Dog); // true 
        System.out.println(d instanceof Animal); // true 

        // a는 Animal클래스의 인스턴스이지만 자식클래스인 Dog클래스와는 연관x
        Animal a = new Animal();
        System.out.println(a instanceof Dog); // false

        // Animal 타입인 Dog 객체 생성시에는 둘다 true
        Animal b = new Dog(); // Animal 타입을 가진 Dog 객체 생성
        System.out.println(b instanceof Animal); // true 
        System.out.println(b instanceof Dog); // true

        Animal ad = d; // Dog타입의 객체를 Animal 타입의 객체로 변경 (형변환 - casting)
        System.out.println(ad instanceof Animal); // true 
        System.out.println(ad instanceof Dog); // true
    }
}
