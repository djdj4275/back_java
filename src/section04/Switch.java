package section04;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int month = 7;
        String monthString = "";

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            default:
                monthString = "Invalid month";
                break;
        }

        System.out.println(monthString);


        // ex1 -----------------------------------------------------------------
        System.out.println("주문하신 커피가 나왔습니다.");
        System.out.println("시럽을 넣어 드릴까요?");
        
        boolean ans = true;

        if (ans) {
            System.out.println("시럽을 넣었습니다.");
        }

        System.out.println("만족도 조사에 참여하시겠어요?");
        
        // ex2 -----------------------------------------------------------------
        System.out.println("질문1. 다음에도 저희 매장에 방문하시겠어요? (O, X)");
        char ansChar = 'O';
        if (ansChar == 'O') {
            System.out.println("O를 체크하셨습니다");
        } else if (ansChar == 'X') {
            System.out.println("X를 체크하셨습니다");
        }

        // ex3 -----------------------------------------------------------------
        System.out.println("질문2. 오늘 커피 맛에 만족하시나요? (매우만족, 만족, 보통, 불만족, 매우불만족)");
        String ansStr = "매우만족";

        if (ansStr == "매우만족") {System.out.println("매우만족");} 
        else if (ansStr == "만족") {System.out.println("만족");} 
        else if (ansStr == "보통") {System.out.println("보통");} 
        else if (ansStr == "불만족") {System.out.println("불만족");} 
        else if (ansStr == "매우불만족") {System.out.println("매우불만족");}

        switch (ansStr) {
            case "매우만족":
                System.out.println("매우만족");
                break;
            case "만족":
                System.out.println("만족");
                break;
            case "보통":
                System.out.println("보통");
                break;
            case "불만족":
                System.out.println("불만족");
                break;
            case "매우불만족":
                System.out.println("매우불만족");
                break;
            default:
                break;
        }

        // ex4 -----------------------------------------------------------------
        int num = -10;

        if (num > 0) {System.out.println("양수입니다.");}
        else if (num == 0) {System.out.println("0입니다.");}
        else if (num < 0) {System.out.println("음수입니다.");}

        // ex5 -----------------------------------------------------------------
        int num2 = 15;
        
        if (num2 % 2 == 0) {System.out.println("짝수입니다.");}
        else if (num2 % 2 == 1) {System.out.println("홀수입니다.");}

        // ex6 -----------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");
        int intNum = scanner.nextInt();

        if (intNum >= 90) {System.out.println("A학점");}
        else if (intNum >= 80) {System.out.println("B학점");}
        else if (intNum >= 70) {System.out.println("C학점");}
        else if (intNum >= 60) {System.out.println("D학점");}
        else if (intNum < 60) {System.out.println("F학점");}

        switch (intNum / 10) {
            case 10:
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
        }

        scanner.close();

        // ex7 -----------------------------------------------------------------
        String username = "admin";
        String password = "password123";

        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
