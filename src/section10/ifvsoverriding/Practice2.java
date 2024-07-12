package section10.ifvsoverriding;

// final 키워드가 class 앞에 붙으면 자식생성불가
// final 키워드가 method 앞에 붙으면 오버라이드 불가

class NormalMethod {
    void normalMethod() {
        System.out.println("normalMethod!");
    }
}

class ChildNormalMethod extends NormalMethod {
    @Override
    void normalMethod() {
        System.out.println("ChildNormalMethod.normalMethod!");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        ChildNormalMethod cnm = new ChildNormalMethod();
        cnm.normalMethod();
    }
}
