package section05;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // 반복 횟수가 정해져 있지 않았을때 효과적

        // 1 ~ 10 출력
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        // do while문 (최초 한 번 실행후 조건식이 true면 반복)
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= 10);

        System.out.println(sum); // 55

        // 1 ~ 10 짝수 출력
        int num2 = 1;
        while (true) {
            num2++;
            if (num2 % 2 != 0) { // 홀수일때 continue (continue 아래구문 스킵)
                continue;
            }
            System.out.println(num2);
            if (num2 >= 10) {
                break; // 반복문 탈출
            }
        }

        // ex1 ----------------------------------------------------------------------
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }

        // ex2 ----------------------------------------------------------------------
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "잔 입니다.");
            if (coffee == 0) {
                System.out.println("판매를 중지합니다.");
                break;
            }
        }

        // ex3 ----------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int number;

        do {
            System.out.println("숫자를 입력하세요 (종료는 0입력): ");
            number = scanner.nextInt();
            s += number;
        } while (number!= 0);

        System.out.println("입력된 숫자의 합: " + s);
        scanner.close();
    }
}
