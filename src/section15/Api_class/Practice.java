package section15.Api_class;

// 기본 API class

// Pbject는 java의 최상위 객체이므로 굳이 상속문구 쓰지않아도 default 값으로 붙어있음
class Sample extends Object {
  @Override
  public String toString() {
    return "Sample 객체입니다.";
  }
}

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{name=" + name + ", " + "age=" + age + "}";
  }
}

public class Practice {
  public static void main(String[] args) {
    Sample s = new Sample();
    System.out.println(s.toString());

    Person person = new Person("김일남", 99);
    System.out.println(person.toString());
  }
}
