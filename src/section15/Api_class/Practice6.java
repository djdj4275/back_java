package section15.Api_class;

// ex

/* 
    toString() 메소드를 오버라이드 하세요.
    이름과 나이를 출력하도록 작성하세요.
 */

class PersonEx {
    String name;
    int age;

    PersonEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonEx [name=" + name + ", age=" + age + "]";
    }
}

public class Practice6 {
    public static void main(String[] args) {
        PersonEx person = new PersonEx("김일남", 99);
        System.out.println(person.toString());
    }
}
