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
        
        scanner = new Scanner(System.in);
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
        scanner = new Scanner(System.in);
        int dan;
        System.out.println("출력할 구구단의 단을 입력하세요 : ");
        dan = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i ,dan*i);
        }

        scanner.close();

        // ex4 ---------------------------------------------------------------------
        // 1부터 10까지의 홀수의 합: 25
        scanner = new Scanner(System.in);
        int s = 0;
        int start;
        int end;
        int q;

        System.out.println("시작 값을 입력하세요.");
        start = scanner.nextInt();

        System.out.println("마지막 값을 입력하세요.");
        end = scanner.nextInt();

        System.out.println("홀수는 0, 짝수는 1를 입력하세요: ");
        q = scanner.nextInt();

        if (q == 0 || q == 1) {
            for (int i = start; i <= end; i ++) {
                if (i % 2 != q) {
                    s += i;
                }
            }
    
            if (q == 0) {
                System.out.printf("%d부터 %d까지 홀수의 합 : %d", start, end, s);
            } else {
                System.out.printf("%d부터 %d까지 짝수의 합 : %d", start, end, s);
            }

        } else {
            System.out.println("입력한 값이 1, 2 이외입니다.");
        }

        
        scanner.close();

        // ex5 ---------------------------------------------------------------------
        /* 
            문자열을 입력하세요: java
            문자열 뒤집기: avaj
         */

        String len;
        String reversed = "";
        scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요: ");
        len = scanner.next();
        
        for (int i = len.length()-1; i >= 0; i--) {
            reversed = len.charAt(i) + reversed;
        }

        System.out.println("뒤집기 : " + reversed);

        scanner.close();
    }
}
