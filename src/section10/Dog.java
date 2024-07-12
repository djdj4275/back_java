package section10;

public class Dog extends Animal { // Animal class를 dog 클래스가 상속
    // 상속  >>> 부모가 되는 클래스의 인스턴스를 상속함

    Dog(String name) {
        this.name = name;
    }

    void sleep() {
        // 현재 클래스에는 필드값이 보이지않지만 Animal 클래스에 기본적 필드로 존재
        // (오버로딩)
        System.out.println(this.name + " zzz"); 
    }
}
