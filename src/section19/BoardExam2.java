package section19;

import java.util.Scanner;

// 미니프로젝트 : 게시판 만들기

public class BoardExam2 {
  private Scanner scanner = new Scanner(System.in);

  public void list() {
    System.out.println(); // 개행
    System.out.println("[게시물 목록]");
    System.out.println("----------------------------------------------------------------------");
    // 공간차지 숫자를 -를 입력하면 왼쪽정렬됨.
    System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
    System.out.println("----------------------------------------------------------------------");
    System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "김일남", "2024.07.24", "오징어게임1");
    System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "김이남", "2024.07.24", "오징어게임1");
    
    mainMenu();
  }
  
  public void mainMenu() {
    System.out.println();
    System.out.println("----------------------------------------------------------------------");
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    System.out.print("메뉴 선택: ");
    String menuNo = scanner.nextLine();
    System.out.println();

    // break문을 안쓰면 나머지 case도 다 훑게 되는데 이걸 fall-through 라고함.
    // 하지만 switch문 사용시에 람다식을 사용하면 break가 알아서 적용됨. (java 17버전이상)
    switch (menuNo) {
      case "1" ->
        create(); 
      case "2"->
        read();
      case "3"->
        clear();
      case "4"->
        exit();
    }
  }

  public void create() {
    System.out.println("create() 메소드 실행");
    list();
  }

  public void read() {
    System.out.println("read() 메소드 실행");
    list();
  }

  public void clear() {
    System.out.println("clear() 메소드 실행");
    list();
  }

  public void exit() {
    System.out.println("exit() 메소드 실행");
    System.exit(0); // 0번은 정상적인 종료
  }

  public static void main(String[] args) {
    BoardExam2 boardExam = new BoardExam2();
    boardExam.list();
  }
}
