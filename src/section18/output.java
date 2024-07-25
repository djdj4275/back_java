package section18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

// 출력

public class output {
  public static void main(String[] args) throws IOException {
    // out.txt라는 이름의 파일을 생성함.
    FileOutputStream output = new FileOutputStream("out.txt"); // 파라미터는 파일명

    String data = "파일 출력";
    output.write(data.getBytes()); // 파일에 텍스트 추가

    output.close();

    FileWriter output2 = new FileWriter("out2.txt");

    output2.write(data);

    output2.close();

    // 두번째 파라미터는 기존에 파일이 있다면 거기에 내용을 추가할지 여부 (default는 false = 지우고 새로만듬)
    FileWriter output3 = new FileWriter("out2.txt", true);

    output3.write(data);

    output3.close();
  }
}
