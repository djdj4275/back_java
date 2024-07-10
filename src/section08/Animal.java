package section08;

public class Animal {
    // <멤버> - class내에 존재하는 것들의 통칭 (속성-필드, 기능-메소드)
    // 멤버는 인스턴스 멤버 / 정적 멤버 로 나뉜다.
    // (intstance)인스턴스 멤버는 객체(인스턴스)에 속하는 변수와 메소드를 의미 (객체 생성시마다 별도의 메모리 공간 차지)
    // (static)정적 멤버는 클래스에 속하는 변수와 메소드를 의미 (정적 멤버는 클래스 레벨에서 공유, 객체 생성 안해도 접근가능하며 클래스 로드될때 메모리에 바로 올라감)

    String name; // 인스턴스 변수
    // name = "Navi"; // 클래스 필드는 이런식으로 초기화 불가함

    static int age; // 이 클래스의 정적 공유값

    public void setName(String name) { // 메소드를 이용해서 값을 초기화 가능
        this.name = name;
    }

    public void setAge(int age) { // 메소드를 이용해서 값을 초기화 가능
        this.age = age; // age값은 static 필드값이기때문에 어떤 객체의 필드값으로서 참조를 하는것이 아닌 Animal.age 로 참조해야 warning이 안뜸
    }
}
