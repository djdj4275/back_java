package section14.try_catch;

// try catch

public class Practice {
  public static void main(String[] args) {
    int result;

    try {
      result = 4 / 0;
    } catch(ArithmeticException e) {
      result = 0;
    }
    

    System.out.println(result);
  }
}
