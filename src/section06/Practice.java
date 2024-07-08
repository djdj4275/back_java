package section06;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // ex1 ---------------------------------------------------------------------
        /* 
            숫자를 입력하세요 (종료 : 0) 1
            숫자를 입력하세요 (종료 : 0) 2
            숫자를 입력하세요 (종료 : 0) 3
            숫자를 입력하세요 (종료 : 0) 4
            숫자를 입력하세요 (종료 : 0) 5
            숫자를 입력하세요 (종료 : 0) 0
            입력한 숫자들의 합 : 15
        */
        int number;
        int sum = 0;

        Scanner scanner = new Scanner(System.in); // 스캐너 선언해 터미널 입력을 받음
        System.out.println("숫자를 입력하세요 (종료 : 0): ");
        number = scanner.nextInt(); // 사용자로부터 첫번째 숫자 입력받음

        // while문 사용
        while (number != 0) {
            sum += number;

            System.out.println("숫자를 입력하세요 (종료 : 0): ");
            number = scanner.nextInt(); // 사용자에게 새로운 입력을 요구
        }

        System.out.println("입력된 숫자들의 합: " + sum);
        scanner.close();


        // ex2 ---------------------------------------------------------------------
        /* 
            비밀번호를 입력하세요 : python
            잘못된 비밀번호입니다.
            비밀번호를 입력하세요: java
            확인되었습니다.
         */

        String correntPassword = "java";
        String password;

        System.out.println("비밀번호를 입력하세요 : ");
        password = scanner.next();

        // while문 사용
        while (!password.equals(correntPassword)) {
            System.out.println("잘못된 비밀번호입니다.");
            System.out.println("비밀번호를 입력하세요 : ");
            password = scanner.next();
        }

        System.out.println("확인되었습니다.");
        scanner.close();

        // ex3 ---------------------------------------------------------------------
        /* 
            출력할 구구단의 단을 입력하세요 : 5
            5 x 1 = 5
            5 x 2 = 10
            ...
         */

        int dan;
        System.out.println("출력할 구구단의 단을 입력하세요 : ");
        dan = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i ,dan*i);
        }

        scanner.close();
    }
}
