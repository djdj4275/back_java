package section15.Api_class;

// clone
// 얕은복사를 수행, 

class Person2 implements Cloneable{ // clone을 구현하도록 해줘야함.
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // clone 메소드는 오버라이드 해줘야함. (protected타입)
    // 또한 메소드 선언할때 에러처리 해줘야함 (throws)
    // clone 은 얕은복사이기에 내부까지 깊게 복사하진 않음.
    @Override
    protected Object clone() throws CloneNotSupportedException{ 
        return super.clone();
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Person2 original = new Person2("김일남", 99);
        try {
            Person2 clone = (Person2) original.clone(); // 강제형변환 필요

            // 다른 객체이지만 값은 같기때문에 원본객체를 보호한체 이용가능
            System.out.println("original : " + original);
            System.out.println("clone : " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(); // 에러메세지 출력
        } 
    }
}
