package section15.Api_class;

import java.util.Scanner;

public class Practice11 {
  public static void main(String[] args) {
    double pi = 3.145436346;
    Math.round(pi); // 반올림
    Math.ceil(pi); // 올림
    Math.floor(pi); // 내림

    Math.round(pi); // 첫째자리 반올림
    Math.round(pi * 10 / 10.0); // 첫째자리 반올림
    Math.round(pi * 100 / 100.0); // 둘째자리 반올림
    // 올림과 내림도 자릿수 컨트롤은 위와 동일

    Math.random(); // 랜덤난수 0~1 사이의 실수
    int ex = (int)(Math.random() * 10) + 1; // 1~10 사이 정수

    // ex1 (업다운게임)

    /*
      1~10 사이 숫자를 입력하세요 : 8
      DOWN!
      1~10 사이 숫자를 입력하세요: 6
      UP!
      1~10 사이 숫자를 입력하세요: 7
      정답! 3회 만에 맞췄습니다.
     */

    Scanner scanner = new Scanner(System.in);
    int goal = 0;
    int value = 0;
    int count = 0;

    goal = (int)((Math.random() * 10) + 1);

    while (count < 10) {
      System.out.println("1~10 사이 숫자를 입력하세요: ");
      value = scanner.nextInt();

      count++;

      if (goal > value) {
        System.out.println("UP");
      } else if (goal < value) {
        System.out.println("DOWN");
      } else {
        System.out.println("정답! " + count + "회 만에 맞췄습니다.");
        break;
      }
    }

    scanner.close();
  }
}
