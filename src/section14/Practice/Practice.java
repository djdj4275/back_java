package section14.Practice;

import java.io.BufferedReader;
import java.io.FileReader;

// 예외처리

public class Practice {
  public static void main(String[] args) throws Exception { // 예외처리
    BufferedReader br = new BufferedReader(new FileReader("src\\section14\\Practice\\text_sample.txt"));
    
    String line;
    line = br.readLine();
    System.out.println(line);
    br.close();
  }
}
