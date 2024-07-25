package section18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 입력

public class input {
  public static void main(String[] args) throws IOException {
    byte[] bytes = new byte[1024];
    
    // out.txt라는 파일을 읽어오고
    FileInputStream inputStream = new FileInputStream("out.txt");

    // 그 읽어온것을 바이트로 읽어오도록함.
    inputStream.read(bytes);

    // 읽어온 바이트 값을 String으로 변환
    System.out.println(new String(bytes));
    inputStream.close();

    // ---------------------------------------------------------
    FileReader reader = new FileReader("out2.txt");

    int read;

    while (true) {
      read = reader.read();
      if (read == -1) {
        break;
      }
      System.out.print((char)read);
    }

    // ---------------------------------------------------------
    BufferedReader bufferedReader = new BufferedReader(reader); // file reader를 파라미터로 받음

    while (true) {
      String line = bufferedReader.readLine(); // 한글자씩이 아닌 한 라인으로 읽어옴
      if (line == null) {
        break;
      }
      System.out.println((char)read);
    }

    reader.close();
  }
}
