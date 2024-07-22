package section15.Api_class;

// Wrapper 클래스
// 기본타입을 객체로 변환한것 (generic에서 사용가능)
// autoBoxing, autoUnBoxing 컴파일러가 자동으로 처리함

public class Practice12 {
  // Integer intObject = new Integer(100); // deplicated
  Integer intObject = Integer.valueOf(100); // 이게 원래 선언방식
  Integer intObject2 = 100; // autoBoxing 

  Double doubleObj = 123.456;

  Character charObj = 'A';

  int intValue = intObject; // autoUnBoxing


  String strNumber = "200";
  int intNumber = Integer.parseInt(strNumber); // 문자열 > 정수

  double doubleNum = Double.parseDouble("123.456");

  int maxInt = Integer.max(1, 10); // 최대값
  int minInt = Integer.min(1, 10); // 최소값
}
