import java.util.Arrays;

public class App {
    // args 값은 JVM이 컴파일시에 자체적으로 string[]로 생성,초기화해서 전달함
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 여기서 args 는 App 애플리케이션 실행 시점에 파라미터로 넣어준 값을 string의 배열로 받아서 나타내겠단 의미
        // ex. 터미널에서 java App 가 나 다 >>> [가,나,다]
        // 또한 여기선 포인터로서 들어오기때문에 형변환 필요함
        System.out.println(args); 
        // 이런식으로 형 변환하면 제대로 콘솔에 값이 나옴
        System.out.println(Arrays.toString(args)); 
    }
}
