package section14.try_catch;

import java.util.Scanner;

// ex

class AgeException extends Exception {
  private String message;

  public AgeException(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return this.message;
  }
}

public class Practice11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int age;

    System.out.println("나이를 입력하세요: ");
    age = scanner.nextInt();

    try {
      checkAge(age);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      scanner.close();
    }
  }

  static void checkAge(int age) throws Exception {
    if (age > 0) {
      System.out.println("정상적인 처리 : " + age + "세입니다.");
    } else {
      throw new AgeException("에러 발생: 음수 나이는 입력할 수 없습니다.");
    }
  }
}
