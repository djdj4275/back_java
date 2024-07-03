package section02;

// 파일 내부에서 class 선언시 public으로 설정을 하려면 파일 이름과 같아야함 (public 클래스는 파일 하나당 하나)
// java 컴파일러가 클래스와 파일을 쉽게 식별하고 일관성있게 처리를 위함
public class Comment {
  public static void main(String[] args) { // main 메소드는 클래스당 하나로 클래스 실행시의 실행기점
    System.out.println("java");
  }
}
