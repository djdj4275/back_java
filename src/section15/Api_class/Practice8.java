package section15.Api_class;

// 기본 API class (String 클래스)

public class Practice8 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = new String("java programm1ing");

        // 문자열 길이
        int length = str1.length();
        int length2 = str2.length();
        System.out.println(length);
        System.out.println(length2);

        // 문자 접근
        char firstChar = str1.charAt(0);
        System.out.println(firstChar);

        // 문자열 검색
        int index1 = str1.indexOf("world");
        int index2 = str1.indexOf("o");
        int index3 = str1.indexOf("o", 5); // 두번째 파라미터는 시작점

        // 문자열 포함 여부
        boolean contains = str1.contains("world");

        // 문자열 변경 (전부)
        String replaceStr = str1.replaceAll("world", "java");

        // 문자열 잘라오기
        String subStr = str1.substring(5, str1.length()); // 시작점, 마지막지점 (생략시 마지막까지 자름)
    
        // 문자열 비교
        String str3 = new String(str1);
        boolean isEqual = str1.equals(str3);

        // 대소문자 변환
        String strUpper = str1.toUpperCase();
        String strLower = str1.toLowerCase();

        // 문자열 나누기
        String[] str2Arr = str2.split(" "); // 공백 기준으로 여러값으로 나눠서 문자열 배열로 리턴함
    
        // 배열을 문자열로 반환 (나눠졌던 배열을 공백을 붙여서 다시 합쳐줌)
        String str2ArrJoin = String.join(" ", str2Arr);
    }
}
