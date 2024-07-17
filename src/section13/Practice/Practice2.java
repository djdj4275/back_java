package section13.Practice;

class OuterStatic {
  private static String message = "Hello, static inner class";

  static class InnerStatic {
    void display() {
      System.out.println(message);
    }
  }
}

public class Practice2 {
    public static void main(String[] args) {
      OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();

      inner.display();
    }
}
