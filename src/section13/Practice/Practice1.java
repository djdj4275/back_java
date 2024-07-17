package section13.Practice;

class Outer {
  private int number = 10;

  class Inner {
    void show() {
      System.out.println("Number: " + number);
    }
  }
}

public class Practice1 {
    public static void main(String[] args) {
      Outer outer = new Outer();
      Outer.Inner inner = outer.new Inner();
      inner.show();
    }
}
