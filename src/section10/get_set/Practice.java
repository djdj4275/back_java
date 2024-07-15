package section10.get_set;

class Person {
    int age = 0;
}

class PersonGetterSetter {
    private int age;

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }
}

public class Practice {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = -99;
        System.out.println(p.age);

        PersonGetterSetter p2 = new PersonGetterSetter();
        p2.setAge(-99);
        System.out.println(p2.getAge());
    }
}
