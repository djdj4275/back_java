package section13.static_;

// 정적 내부 클래스
// - 인스턴스 멤버에 접근 불가

class OuterStatic {
    private String outerInstanceField = "outer Instance Field";
    private static String outerStaticField = "outer Static Field";

    static class InnerStatic { // 정적 내부 클래스
        String innerInstanceField = "inner Instance Field";
        static String innerStaticField = "inner Static Field";

        void displayInstance() {
            // System.out.println(outerInstanceField); // 인스턴스 멤버 접근불가
            System.out.println(outerStaticField); // static 필드는 접근가능
            System.out.println(innerInstanceField);
            System.out.println(innerStaticField);
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        // 정적 내부 클래스는 따로 상위 클래스의 객체생성 없이 바로 생성가능.
        OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();
        innerStatic.displayInstance();
        
        System.out.println(innerStatic.innerInstanceField);
        System.out.println(innerStatic.innerStaticField); // static 값은 자체적으로 접근보다는 
        System.out.println(OuterStatic.InnerStatic.innerStaticField); // 접근할때 클래스 원형 자체로 접근해야함.
    }
}
