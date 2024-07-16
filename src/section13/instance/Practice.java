package section13.instance;

// 인스턴스 클래스 (인스턴스 내부 클래스)
// - 인스턴스 멤버에 접근 가능

class Outer {
    private String outerField = "Outer Field";

    class Inner { // 인스턴스 내부 클래스
        String innerField = "Inner Field";

        void display() {
            System.out.println(outerField);
        }
    }

    Inner createInner() {
        Inner inner = new Inner();
        return inner;
    }
}

public class Practice {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
        System.out.println(inner.innerField);

        Outer.Inner inner2 = new Outer().new Inner(); // Error: Outer.Inner is not static
        inner2.display();

        Outer.Inner inner3 = outer.createInner();
        inner3.display();
    }
}
