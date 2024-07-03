package section02;

public class DataType {
  // byte (-128 ~ 127) - 1바이트
  // short : (-3만 ~ 3만) - 2바이트 
  // int : (-20억 ~ 20억) - 4바이트 
  // long : int 상위호환 - 8바이트 
  // (java에서는 long 타입 선언값 뒤에 L붙임) 
  long a = 1000L;

  // 실수 계산시에는 소수점 오차가 반드시 생기는데 형태별로 오차의 폭이 크냐 작냐의 차이가 존재
  // float > double > BigDecimal (float 가장 오차가 크고 BigDecimal 거의 오차가 없음)
  // float f = 4.000f; (뒤에 f 붙여야함) / double은 그냥쓰면됨 / BigDecimal은 클래스이기 때문에 리터럴 형태가 아닌 new BigDecimal형태로 선언필요
  
  // float (7자리) - 4바이트
  // double (15자리) - 8바이트
  // BigDecimal (제한없음, 임의의 정밀도 설정)
  float f = 10.15f;

  // 계산시에는 상위호환과 하위호환은 계산이 가능하지만 하위호환으로 선언된것을 상위호환으로 계산은 불가
  // long l = 0; ing i = 0; 일때 long sum = l + i; 는 가능하지만 int sum = l + i; 는 불가

  // * 캐스트란, 강제로 형태를 변환시키는것 위의 불가한 계산식도 int sum = (int)(l + i); 이런식으로 강제로 결과값을 int형으로 바꾸면 가능

  // * upCasting
  // 상위 클래스가 하위 클래스로 변환될때는 형변환 문구를 적어주지 않아도 자동적으로 형변환 되는것
  // 하위에서 상위로 갈때에는 캐스트 필요 (downCasting)

  public static void main(String[] args) {
    int i = 10;
    double d = 1.0;

    d = i;
    System.out.println(d);

    // * overflow
    // 강제형변환시에 범위를 벗어나게되면 형변환된 타입의 가장 첫값으로 변경됨. (논리적 오류로 이상한 값이 도출될수있음)
    // byte는 -128~127이기때문에 128을 byte화 하면 -128이 됨.
    // 오버플로우는 데이터손실, 소수점이하 자리 손실, 예상치못한 논리적 오류등의 문제가 있을수있으므로 주의
    int Num128 = 128;
    byte byteNum = (byte)Num128;
    System.out.println(byteNum); // -128

    // ex
    double doubleNum = 1.0e100; // 1.0 * 10^100
    float floatNum = (float)doubleNum;
    System.out.println(floatNum); // infinity (overflow를 양수로 넘으면 infinity)

    doubleNum = 1.0e-100; // 1.0 * -10^100
    floatNum = (float)doubleNum; 
    System.out.println(floatNum); // 0.0 (overflow를 음수로 넘으면 0)
  }

  // private : 현재 클래스에서만 사용가능한 변수
  // public : 모든 클래스에서 그 변수 참조가 가능
  // protected : 선언된 클래스를 상속받은 자식 클래스까지만 변수 참조 가능

  // static 공유자원이란 뜻으로 이 t가 변경되면 선언된 클래스로 만들어진곳의 자원이 다 함께 바뀜 (정적변수)
}
