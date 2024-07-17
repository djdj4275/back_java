package section14.try_catch;

public class Practice2 {
  public static void shouldBeRun() {
    System.out.println("ok thanks");
  }

  public static void main(String[] args) {
    int result;

    try {
      result = 4 / 0;
    } catch(ArithmeticException e) {
      result = 0;
    } finally {
      shouldBeRun();
    }
    

    System.out.println(result);
  }
}
