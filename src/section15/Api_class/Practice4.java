package section15.Api_class;

import java.util.Objects;

// equals, hashCode, toString

class NewPerson {
    String name;
    int age;

    NewPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}

        // if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof NewPerson)) {return false;}

        NewPerson person = (NewPerson) o;
        return age == person.age && name == person.name;
    } 

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // 주어진 객체 기반으로 해시코드 간편하게 생성
    }

    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age +"}";
    }
}

public class Practice4 {
    public static void main(String[] args) {
        NewPerson p1 = new NewPerson("김일남", 99);
        NewPerson p2 = new NewPerson("김일남", 99);
        NewPerson p3 = p1;
        NewPerson p4 = new NewPerson("김이남", 98);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // true

        p1.name = "김이남";
        p1.age = 99;
        System.out.println(p1.equals(p4)); // false

        // p1~p3 까지는 같다고나옴 
        // (이유는 위에서 해시코드 메소드를 오버라이딩해서 내부 값 기반으로 해시코드를 생성하게끔 했기 때문에 내부 값이 같으면 코드도 같음)
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
