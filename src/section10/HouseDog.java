package section10;

public class HouseDog extends Dog{
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + "hours");
    }

    // 부모클래스인 Dog에 생성자 함수가 선언되어있다면 자식클래스에서도 super를 이용해 같은 생성자 메소드를 만들어줘야함
    HouseDog(String name) {
        super(name);
    }

    // 오버라이딩
    // >>> 부모가 되는 Dog 클래스에 이미 sleep이라는 메소드가 있으면 그걸 참조하지만,
    // >>> 자식 클래스에 같은 이름의 메소드가 선언되면 그 메소드를 우선시함
    // >>> 그래서 오버라이딩된 코드라는걸 알려주기위해서 코드 작성시 가급적 메소드 위에 @override이라는 키워드를 붙여줌
    @Override
    void sleep() {
        super.sleep(); // 부모클래스의 sleep 메소드도 사용
        System.out.println(this.name + " in house");
    }
}
