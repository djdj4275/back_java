package section08;

public class Practice {
    public static void main(String[] args) { // 실행용 클래스
        Animal animal = new Animal(); // Animal 객체 생성

        System.out.println(animal.name);

        animal.setName("coco");
        System.out.println(animal.name);
    }
}
