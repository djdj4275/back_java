package section02;

public class StringType {
  public static void main(String[] args) {
    // string은 "(쌍따옴표 사용, 글자 제한 x)
    // char 는 '(따옴표 사용, 한글자만 저장가능 = 그 글자에 대한 UNICODE를 저장하는것)
    String a = "java"; // 리터럴 생성방식
    String b = "java";
    String c = new String("java"); // 객체 생성방식

    // 리터럴 생성은 String Pool (java에서 문자열 리터럴이 관리되는 특별한 메모리 영역 = 힙메모리에 존재)에 저장되어 참조
    // 객체 생성은 새로운 String 객체가 힙메모리 영역에 생성 => "java"라는 문자열 리터럴을 가지고 새로운 String 객체를 생성하는것
    // 리터럴 String 선언은 String Pool이라는 힙메모리 영역에 저장 / 객체 String 선언은 힙메모리에 새로운 객체로서 저장
    // 둘다 힙메모리 영역에 저장되는것은 맞지만 String Pool은 특정 문자열이 중복되지 않도록 관리하며 이미 존재하는 문자열은
    // 재사용하여 메모리를 절약하는 과정을 거친다. 하지만 새롭게 힙메모리에 객체선언을 하게되면 이때는 String Pool에서 문자열을
    // 찾지 않고 새로운 객체를 생성하게되기때문에 같은 메모리에 위치하지만 다른게 취급되는것
    System.out.println(a == b); // true
    System.out.println(c == a); // false
    System.out.println(a.equals(c)); // true (equals 메소드를 사용하면 데이터값 자체를 비교)

    // * 힙(Heap)메모리와 스택(Stack)메모리의 차이
    // 힙 메모리는 객체 인스턴스, 배열 같은 동적 할당 데이터를 저장하는곳.
    // java에서는 new 연산자를 사용해 힙 메모리에 객체를 생성하며, 가비지 컬렉션에 의해 관리됨.
    // 스택 메모리는 메소드 호출시 지역변수, 매개변수, 복귀주소 등을 저장하는곳
    // 각 메소드 호출시때 해당 스레드 스택에 새로운 스택프레임이 생성되고, 메소드 실행완료시 스택프레임이 제거됨

    // * String Pool
    // 보통 정수, 실수, char, boolean등 String을 제외한 다른 타입들은 스택메모리에 저장되지만
    // String 타입은 String Pool이라 불리는 힙메모리에 저장되고 관리됨.
    // 힙메모리에 관리되지만 가비지컬렉션의 대상이 아니며, 문자열 리터럴이 중보고디지 않도록 관리됨.
    // (이는 메모리사용과 성능 최적화를 위한 java의 기본적인 메모리 관리방식중 하나)
  }
}
