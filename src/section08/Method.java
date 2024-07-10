package section08;

public class Method {
    // 메소드의 형태 4가지

    // 인수 (argument)는 사용하는곳에서 method.multiply(5, 3) 이런식으로 받는 5,3을 인수라고하고,
    // 파라미터 (parameter)는 메소드 정의부분에서 multiply(int x, int y) x,y 처럼 올 값들을 네이밍 정한게 파라미터 또는 매개변수 라고 함.

    // 메소드(함수) 생성시에 반환값(return value)이 존재하면 함수 앞에 해당 리턴값의 타입을 써주고 리턴이 없다면 void사용

    // 1. 인수가 없고, 반환값이 없는 메소드
    void onCalc() {
        System.out.println("calc");
    }

    // 2. 인수가 있고, 반환값이 없는 메소드
    void printNumber(int number) {
        System.out.println(number);
    }
    
    // 3. 인수가 없고, 반환값이 있는 메소드
    int sum() {
        return 10 + 20;
    }

    // 4. 인수가 있고, 반환값이 있는 메소드
    int multiply(int x, int y) {
        return x * y;
    }

    // ex1 ------------------------------------------------------------------------------
    int sumFromOneToTen() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // 실행부분 (main)
    public static void main(String[] args) {
        Method method = new Method();
        
        method.onCalc();
        method.printNumber(10);
        System.out.println(method.sum());
        System.out.println(method.multiply(5, 3));

        System.out.println(method.sumFromOneToTen()); // ex1
    }
}
