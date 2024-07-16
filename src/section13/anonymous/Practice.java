package section13.anonymous;

// 익명 내부 클래스

interface Greeting { // 인터페이스 선언
    void greet();
}

public class Practice {
    public static void main(String[] args) {
        // 인터페이스 자체를 익명 내부 클래스를 이용해서 바로 객체 생성
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("anonymous inner class");
            }
        };

        greeting.greet();
    }
}
