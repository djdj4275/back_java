package section14.try_catch;

public class Practice4 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};

    try {
      System.out.println(numbers[3]);
    } catch (Exception e) {
      System.out.println(0);
    } finally {
      System.out.println("종료");
    }
  }
}
