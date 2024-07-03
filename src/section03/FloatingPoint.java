package section03;

import java.math.BigDecimal;

public class FloatingPoint { // 부동소수점
  public static void main(String[] args) {
    // 부동소수점 오차 (floating point error)란,
    // 컴퓨터에서 부동소수점 숫자 표현, 연산시 발생하는 근본적인 오차를 의미함
    // 유한한 비트로 무한한 실수를 표현하고, 유효 숫자 자리수 제한, 이진 표현의 한계등으로 생기는 오차
    double doubleNum1 = 0.1;
    doubleNum1 += 0.1;
    doubleNum1 += 0.1;
    System.out.println(doubleNum1); // 0.300000000004

    BigDecimal bdNum1 = new BigDecimal("0.1"); // BigDecimal 형태는 문자열로 파라미터 받음
    BigDecimal bdNum2 = new BigDecimal("0.1");
    BigDecimal bdNum3 = new BigDecimal("0.1");
    System.out.println(bdNum1.add(bdNum2).add(bdNum3)); // 메소드 체이닝
  }
}
