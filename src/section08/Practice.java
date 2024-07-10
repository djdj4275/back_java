package section08;

public class Practice {
    public static void main(String[] args) { // 실행용 클래스
        Animal animal = new Animal(); // Animal 객체 생성

        System.out.println(animal.name);

        animal.setName("coco");
        System.out.println(animal.name);

        // ex1 ------------------------------------------------------------------------------
        Animal cat = new Animal(); 
        Animal dog = new Animal(); 

        cat.setName("Coco");
        dog.setName("Happy");

        cat.setAge(3);
        dog.setAge(5);

        System.out.println(cat.name);
        System.out.println(dog.name);

        System.out.println(cat.age); // static 필드값은 이렇게 새로만든 객체에서 참조로 쓰려고 하면 warning이 뜸
        System.out.println(dog.age); // Animal이라는 클래스 자체의 인스턴스로서 Aniaml.age 라고 참조해야 안뜸

        // ex2 ------------------------------------------------------------------------------
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.setName("갤럭시");
        counter2.setName("아이폰");

        Counter.setCount();
        Counter.setCount();

        System.out.println(Counter.count);

        System.out.println(counter1.displayName);
        System.out.println(counter2.displayName);
    }
}

class Counter {
    static int count = 0;
    String displayName;

    static void setCount() {
        count++;
    }

    void setName(String displayName) {
        this.displayName = displayName;
    }
}
