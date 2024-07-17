package section14.try_catch;

public class Practice3 {
  public static void main(String[] args) {

    try {
      // int result = 4 / 0;

      int[] arr = {1, 2, 3};
      System.out.println(arr[3]);

    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
    }
  }
}
