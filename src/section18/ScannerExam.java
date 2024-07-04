package section18;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 스캐너란?
        // 스캐너는 java 프로그래밍 언어에서 사용자의 입력을 읽어들이는데 사용되는 기존 클래스. (java.util 패키지에 포함)
        // 이때 입력메소드를 호출할때 입력 버퍼에서 데이터를 가져와 처리함
        // 스캐너 객체 사용후에는 close() 메소드를 호출하여 자원을 반납해야함
        // 단, 스캐너를 사용하려면 콘솔 설정을 externalTerminal 로 바꿔야함

        Scanner scanner = new Scanner(System.in); // 스캐너로 터미널에서 입력값을 받음

        System.out.println("하나의 정수를 입력하세요: ");
        int intNum = scanner.nextInt(); // 받을 입력값 갯수만큼 실행

        System.out.println("intNum1 : " + intNum);

        // 입력값 받을때 엔터로 구분, 스페이스로 구분해서 한꺼번에 입력 둘다 상관없음
        System.out.println("세 개의 정수를 입력하세요(스페이스로 구분): ");
        int intNum1 = scanner.nextInt();
        int intNum2 = scanner.nextInt();
        int intNum3 = scanner.nextInt();

        System.out.println("intNum1\t: " + intNum1);
        System.out.println("intNum2\t: " + intNum2);
        System.out.println("intNum3\t: " + intNum3);

        System.out.println("스페이스를 포함한 문자열을 입력하세요: ");
        String strNextLine = scanner.nextLine();

        System.out.println("strNextLine\t: " + strNextLine);

        // ex1
        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("나이을 입력하세요: ");
        int age = scanner.nextInt(); 

        System.out.println("키를 입력하세요: ");
        double height = scanner.nextDouble(); 

        System.out.printf("이름: %s, 나이: %d, 키: %.2f\n", name, age, height); // 뒤는 서식문자로 나올 수 만큼 파라미터 넣어주기

        scanner.close(); // 사용후에는 항상 닫아줘야함
    }
}
