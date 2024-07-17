package section13.lambda.anonymous_inner;

// 일반 클래스

interface Calculator {
  int calculator(int a, int b);
}

public class Practice {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;

    Calculator add = new Calculator() {
      @Override
      public int calculator(int a, int b) {
        return a + b;
      };
    };

    System.out.println("add : " + add.calculator(num1, num2));

    Calculator sub = new Calculator() {
      @Override
      public int calculator(int a, int b) {
        return a - b;
      };
    };

    System.out.println("sub : " + sub.calculator(num1, num2));

    Calculator mul = new Calculator() {
      @Override
      public int calculator(int a, int b) {
        return a * b;
      };
    };

    System.out.println("mul : " + mul.calculator(num1, num2));

    Calculator div = new Calculator() {
      @Override
      public int calculator(int a, int b) {
        return a / b;
      };
    };

    System.out.println("div : " + div.calculator(num1, num2));
  }
}
