package section13.lambda.anonymous_lambda;

// 람다식

// 함수형 인터페이스는 추상형 메소드를 하나만 만들수있음.
@FunctionalInterface // 함수형 인터페이스
interface Calculator {
  int calculator(int a, int b);
}

@FunctionalInterface // 함수형 인터페이스
interface AbsoluteCalculator {
  int calculator(int a);
}

public class Practice {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;

    Calculator add = (int a, int b) -> { // 람다식 추상형 메소드 구현
      return a + b;
    };

    System.out.println("add : " + add.calculator(num1, num2));

    Calculator sub = (a, b) -> { // 매개변수 타입도 빼도 됨.
      return a - b;
    };

    System.out.println("sub : " + sub.calculator(num1, num2));

    Calculator mul = (a, b) -> 
       a * b; // 중괄호, 리턴값을 같이 빼도 가능 (추가 로직이 필요 없다면)
    ;

    System.out.println("mul : " + mul.calculator(num1, num2));

    Calculator div = (a, b) -> {
      System.out.println("나누기 계산");
      return a / b;
    };

    System.out.println("div : " + div.calculator(num1, num2));
  
    int number = 10;

    AbsoluteCalculator abs = (a) -> a < 0 ? -a : a;
    System.out.println(abs.calculator(-number));

    // 지역변수와 람다식의 관리 메모리가 다르기때문 (힙, 스택)
    AbsoluteCalculator abs2 = (a) -> {
      // number = a < 0 ? -a : a; // 지역변수 값 초기화는 불가
      return number;
    };
    System.out.println(abs2.calculator(-10));
  }
}
