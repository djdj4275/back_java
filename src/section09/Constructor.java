package section09;

public class Constructor {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.printInfo();

        Person person2 = new Person("김일남");
        person2.printInfo();
        Person person3 = new Person("김일남", 98);
        person3.printInfo();
        Person person4 = new Person("김일남", 97, "부산");
        person4.printInfo();
    }
}

class Person {
    String name;
    int age;
    String address;

    // 생성자(constructor) - 객체를 생성할 때 호출되는 메소드 (default값으로서 보이진않아도 자동적으로 생성되어있음.)
    Person() {
        name = "아무개";
        age = 0;
        address = "비공개";
        System.out.println("person");
    }

    // 생성자 오버로딩 (overloading) - 매개변수가 다른 생성자를 여러개 만들 수 있음.
    Person(String name) {
        this.name = name;
        age = 0;
        address = "비공개";
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        address = "비공개";
    }

    Person(int age, String name) { // 같은 이름이어도 매개변수가 다르면 생성자 생성 가능
        this.name = name;
        this.age = age;
        address = "비공개";
    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.printf("%s %d세(%s)\n", name, age, address);
    }
}