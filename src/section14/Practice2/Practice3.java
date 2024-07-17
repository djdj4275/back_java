package section14.Practice2;

public class Practice3 {
  public static void main(String[] args) {
    String numberString = "123abc";

    int number = Integer.parseInt(numberString);
    System.out.println(number); // NumberFormatException
  }
}
