package section13.Practice;

// 지역 내부 클래스

class OuterLocal {
  void display() {
    String localMessage = "Hello, local inner class";

    class LocalInner {
      void print() {
        System.out.println(localMessage);
      }
    }

    LocalInner localInner = new LocalInner();
    localInner.print();
  }
}

public class Practice3 {
  public static void main(String[] args) {
    OuterLocal outer = new OuterLocal();
    outer.display();
  }
}
