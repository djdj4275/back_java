package section02;

// 파일 내부에서 class 선언시 public으로 설정을 하려면 파일 이름과 같아야함 (public 클래스는 파일 하나당 하나)
// java 컴파일러가 클래스와 파일을 쉽게 식별하고 일관성있게 처리를 위함
public class Constant {
  public static void main(String[] args) { // main 메소드는 클래스당 하나로 클래스 실행시의 실행기점
    // final 사용시 변수의 값이 고정되어 바뀌지 않음 (상수가 됨) => 관례적으로 상수는 대문자 사용
    final double PI; // 여기서는 초기화만 진행하고 최초 값 설정을 아직 하지 않았기 때문에
    PI = 4.14; // 이 부분에서 값 설정시에 final이지만 error를 띄우지 않음
  }
}