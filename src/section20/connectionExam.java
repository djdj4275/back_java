package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// JDBC 연동 (java data base connnect)

// 1. mysql connector j (window : platform independent) 다운로드후 압축풀고
// 2. 안에 mysql-connector-j-9.0.0.jar 파일을 현 프로젝트 디렉토리의 lib(라이브러리)에 옮김 (JDBC 연관 클래스 사용위함)
// 3. mysql workbanch 설치 (mysql 공홈에서 설치)
// modify = (mysql server, mysql workbench, mysql router, samples and examples)

// 데이터베이스는 기본적으로 특정 컴퓨터(즉, 서버)에 종속되기때문에 db를 어떤 컴퓨터에 만들었다면
// 그 데이터베이스에 접근하려면 방호벽이나 보안설정에서 허용처리를 해주어야하며,
// 그 서버 컴퓨터가 항시 켜져있어야한다.

public class connectionExam {
  public static void main(String[] args) {

    Connection conn = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=minty&password=greatsqldb");
    } catch (SQLException e) {
      System.out.println("SQLException: " + e.getMessage());
      System.out.println("SQLState: " + e.getSQLState());
      System.out.println("VendorError: " + e.getErrorCode());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
