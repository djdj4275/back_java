package section10.casting;

// 형변환 (casting)

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class Practice {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal ad = new Dog();
        Animal ac = new Cat();

        // 강제 형번환 (upcasting) 부모클래스 >> 자식클래스
        // 강제 형변환은 처음 생성시의 클래스 보다 위등급으로는 불가하며, 아래로는 강제 형변환 가능

        Dog a1 = (Dog)a; // 실행하면 런타임 에러 발생 (원본 타입 자체가 자신보다 부모인것은 강제형변환 불가)
        Dog ad1 = (Dog)ad; // ad는 원본타입이 Dog 타입이기에 같은 등급의 강제형변환은 가능

        // 자동 형변환 (downcasting) 자식클래스 >> 부모클래스

        Cat c1 = (Cat)ad; // ad 는 Dog 타입이 원본타입인데 같은 Animal을 상속받은 클래스라도 엄연히 다름

        // 1. 자식에서 부모타입 (자동 형변환)
        // 2. 부모에서 자식타입 (강제 형변환), 조건 >> 자식에서 부모타입으로 형변환된 경우에만 가능
        // (한마디로 1번에 해당하는 경우에만 다시 2번이 가능)


        // --------------------------------------------------------------------------
        // 결과적으로 Animal타입, 호출시엔 Animal클래스의 생성자를 호출함
        // (Animal 타입에 Animal 클래스 인스턴스를 가지고있음)
        Animal animal = new Animal();
        // 컴파일에러는 없지만, 런타임에서 에러 (강제형변환 불가능 x)
        Dog dog = (Dog)animal; // ClassCastException
        System.out.println(animal instanceof Dog); // false

        //---------------------------------------------------------------------------
        // 결과적으로 Animal 타입이지만 호출시엔 Dog클래스의 생성자를 호출함
        // (Animal 타입에 Dog 클래스 인스턴스를 가지고있음)
        Animal animalDog = new Dog(); // 자동형변환 (선언시부터 바로 형변환)
        // 가능함 (강제형변환 가능 o)
        Dog dog2 = (Dog)animalDog;
        System.out.println(animalDog instanceof Dog); // true

        //---------------------------------------------------------------------------
        // 결과적으로 Animal 타입이지만 호출시엔 Cat클래스의 생성자를 호출함
        // (Animal 타입에 Cat 클래스 인스턴스를 가지고있음)
        Animal animalCat = new Cat(); // 자동형변환 (선언시부터 바로 형변환)
        // 결과적으로 Animal타입이지만 내부 인스턴스에서 Dog와 Cat은 직접관계가 없어서 에러
        Dog dog3 = (Dog)animalCat; // ClassCastException
        System.out.println(animalCat instanceof Dog); // false

        // IS-A 관계로 이해 (형변환 가능)
        // Dog is a Animal (O)
        // Animal is a Dog (X)
        // >>> instance of 로 true가 나온다면 형변환 가능하단 얘기
    }
}
