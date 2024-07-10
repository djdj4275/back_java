package section09.callByReference;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Practice2 {
    static void modifyPerson(Person person) {
        person.name = "김이남"; // 매개변수로 객체 자체를 받고 그 안의 값을 변경하고 이 메소드 밖에서 확인해보면 변경값이 적용된것을 알수있음.
        System.out.println("modifyPerson() 메소드 내 변경된 person.name\t: " + person.name);
    }

    public static void main(String[] args) {
        Person person = new Person("김일남");
        System.out.println("modifyPerson() 메소드 호출 전 person.name\t: " + person.name);

        // 객체에 의한 호출
        modifyPerson(person);
        System.out.println("modifyPerson() 메소드 호출 후 person.name\t: " + person.name);
    }
}
