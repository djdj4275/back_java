package section10.casting;

// 형변환 (casting)

class Animal {

}

class Dog extends Animal {

}

class HouseDog extends Dog {

}

class Cat extends Animal {

}

class HouseCat extends Cat {

}

public class Practice {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal ad = new Dog();
        Animal ahd = new HouseDog();
        Animal ac = new Cat();
        Animal ahc = new HouseCat();

        // 강제 형번환 (upcasting) 부모클래스 >> 자식클래스
        // 강제 형변환은 처음 생성시의 클래스 보다 위등급으로는 불가하며, 아래로는 강제 형변환 가능

        Dog a1 = (Dog)a; // 실행하면 런타임 에러 발생 (원본 타입 자체가 자신보다 부모인것은 강제형변환 불가)
        Dog ad1 = (Dog)ad; // ad는 원본타입이 Dog 타입이기에 같은 등급의 강제형변환은 가능


        HouseDog hd = (HouseDog)ad1; // 실행시 런타임 에러 발생
        HouseDog hd1 = (HouseDog)ahd; // 강제 형변환 가능

        // 자동 형변환 (downcasting) 자식클래스 >> 부모클래스
        Dog hd2 = hd1; // 가능
        Dog hd3 = (Dog)ahd; // 가능

        Cat c1 = (Cat)ad; // ad 는 Dog 타입이 원본타입인데 같은 Animal을 상속받은 클래스라도 엄연히 다름

        // 1. 자식에서 부모타입 (자동 형변환)
        // 2. 부모에서 자식타입 (강제 형변환), 조건 >> 자식에서 부모타입으로 형변환된 경우에만 가능
        // (한마디로 1번에 해당하는 경우에만 다시 2번이 가능)
    }
}
