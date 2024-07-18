package section14.try_catch;

import java.util.Scanner;

// throw : 의도적인 에러 발생

public class Practice5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("나이를 입력해 주세요.");
    int age = scanner.nextInt();

    try {
      if (age < 19) {
        // 일부러 에러 일으키고 파라미터 값으로는 message값 넣어줌
        // 넘길 catch에 해당하는 에러값으로 선언하고 던짐
        throw new Exception("미성년자 입니다.");
      } else {
        System.out.println("접근 허가");
      }
    } catch (Exception e) {
      // throw값 받아서 파라미터로 들어간 message값 도출
      System.out.println("접근 불가: " + e.getMessage());
    } finally {
      scanner.close();
    } 
  }
}
