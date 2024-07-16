package section13.local;

// 지역 내부 클래스
// - 접근제한자, 정적타입 설정 불가

class OuterLocal {
    void display() {
        String localVariable = "Local variable"; // 지역변수

        class LocalInner {
            void show() {
                // localVariable = "new Local variable"; // 지역 내부 클래스는 지역변수 사용은 가능하나 초기화는 불가
                System.out.println(localVariable);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.show();
    }
}

public class Practice {
    public static void main(String[] args) {
        OuterLocal outerLocal = new OuterLocal();
        outerLocal.display();
    }
}
