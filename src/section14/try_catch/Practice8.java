package section14.try_catch;

import java.util.Scanner;

// ex

// 피제수를 입력하세요 : 5
// 제수를 입력하세요 : 0
// 0으로 나눌 수 없습니다.
// 프로그램을 종료합니다.

// 나눗셈 결과 : (제대로된 값)

public class Practice8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int dividend;
    int divisor;

    System.out.println("피제수를 입력하세요 : ");
    dividend = scanner.nextInt();

    System.out.println("제수를 입력하세요 : ");
    divisor = scanner.nextInt();

    try {
      System.out.println("나눈셈 결과: " + dividend / divisor);
    } catch (Exception e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      System.out.println("프로그램을 종료합니다");
      scanner.close();
    }
  }
}
