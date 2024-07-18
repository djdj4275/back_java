package section14.try_catch;

import java.util.Scanner;

// ex

/* 
  나이를 입력하세요: 99
  정상적인 처리 : 99세입니다.

  나이를 입력하세요: -99
  에러 발생: 음수 나이는 입력할 수 없습니다.
*/

public class Practice9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int age;

    System.out.println("나이를 입력하세요: ");
    age = scanner.nextInt();

    try {
      if (age > 0) {
        System.out.println("정상적인 처리 : " + age + "세입니다.");
      } else {
        throw new Exception("에러 발생: 음수 나이는 입력할 수 없습니다.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
