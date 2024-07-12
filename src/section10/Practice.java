package section10;

public class Practice {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.setName("비밀");

        System.out.println(a.name);

        Dog dog = new Dog("멍멍이");

        // dog.setName("멍멍이"); // 객체명(참조변수)

        System.out.println(dog.name);

        dog.sleep(); // dog.name을 출력

        HouseDog hd = new HouseDog("poppy");
        // hd.setName("poppy");
        hd.sleep();
    }
}
