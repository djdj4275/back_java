package section14.try_catch;

import java.util.Scanner;

// throws
// : 예외처리를 호출하는쪽에서 하도록함.

public class Practice6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("나이를 입력해 주세요.");
    int age = scanner.nextInt();

    try {
      checkAge(age);
    } catch (Exception e) {
      System.out.println("접근불가 : " + e.getMessage());
    }

    scanner.close();
  }

  // throws 를 사용하면 사용하는쪽에서 try catch 하도록 할수있음
  // 이때 뒤에오는 Exception은 예외처리할 타입
  static void checkAge(int age) throws Exception {
    if (age < 19) {
      throw new Exception("미성년자 입니다.");
    } else {
      System.out.println("접근 허가");
    }
  }
}
