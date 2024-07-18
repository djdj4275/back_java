package section14.try_catch;

import java.util.Scanner;

// 에러 최상위 클래스인 Exception 을 상속받은 새로운 클래스 생성
class InvalidAgeException extends Exception {
  private String message;

  public InvalidAgeException(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return this.message;
  }
}

public class Practice7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("나이를 입력해 주세요.");
    int age = scanner.nextInt();

    try {
      if (age < 19) {
        throw new InvalidAgeException("미성년자 입니다.");
      } else {
        System.out.println("접근 허가");
      }
    } catch (InvalidAgeException e) {
      System.out.println("접근 불가: " + e.getMessage());
    } finally {
      scanner.close();
    } 
  }
}
