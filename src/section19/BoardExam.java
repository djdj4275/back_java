package section19;

// 미니프로젝트 : 게시판 만들기

public class BoardExam {
  public void list() {
    System.out.println(); // 개행
    System.out.println("[게시물 목록]");
    System.out.println("----------------------------------------------------------------------");
    // 공간차지 숫자를 -를 입력하면 왼쪽정렬됨.
    System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
    System.out.println("----------------------------------------------------------------------");
    System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "김일남", "2024.07.24", "오징어게임1");
    System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "김이남", "2024.07.24", "오징어게임1");
  }
  
  public void mainMenu() {
    System.out.println();
    System.out.println("----------------------------------------------------------------------");
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    System.out.println("메뉴 선택: ");
    System.out.println();
  }

  public static void main(String[] args) {
    BoardExam boardExam = new BoardExam();
    boardExam.list();
    boardExam.mainMenu();
  }
}
