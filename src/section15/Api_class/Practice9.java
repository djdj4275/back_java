package section15.Api_class;

// StringBuffer
// 멀티스레드 환경에서는 StringBuffer를 사용, 아니라면 StringBuilder가 좋음

// 기존 String 타입에서 값에 추가하게되면 새로운 객체를 생성해서 갖다붙이는 형식이기 때문에 메모리 효율이 떨어짐
// 그치만 StringBuffer나 StringBuilder는 값만 새로 갈아끼우는 형식이기에 효율성이 좋음

public class Practice9 {
    public static void main(String[] args) {
        String result = "";
        result += "hello";
        result += " ";
        result += "jump to java";

        System.out.println(result);

        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        buffer.append(" ");
        buffer.append("jump to java");

        buffer.insert(5, ","); // 원하는 인덱스에 문자 삽입

        buffer.replace(15, 15, "JAVA"); // 시작점, 끝점의 문자열을 지우고 3번째 파라미터값으로 대체

        buffer.delete(15, buffer.length()); // 시작점부터 끝점까지 문자열 삭제

        System.out.println(buffer);
    }
}
