package section07;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // ex1 ------------------------------------------------------------------------------
        /* 
            1. 3 x 3 크기의 2차원 배열을 선언하고 다음 값을 할당하시오.

            1 2 3
            4 5 6
            7 8 9
        */

        int[][] arr = new int[3][3];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{4, 5, 6};
        arr[2] = new int[]{7, 8, 9};

        // ex2 ------------------------------------------------------------------------------
        // 2. for문을 이용해 배열의 모든 요소를 출력하는 프로그램을 작성하시오.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // for each문 버전
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // ex3 ------------------------------------------------------------------------------
        /* 
            3. 2차원 배열을 다음과 같이 초기화하시오.

            10 20 30
            40 50 60
            70 80 90
        */

        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // ex4 ------------------------------------------------------------------------------
        // 4. for문을 이용해 배열의 모든 요소의 합을 계산해 출력하는 프로그램을 작성하시오.

        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
        }
        System.out.println("배열의 모든 요소의 합 : " + sum);

        // for each
        int sum2 = 0;
        for (int[] row : arr2) {
            for (int value : row) {
                sum2 += value;
            }
        }
        System.out.println("배열의 모든 요소의 합 : " + sum2);

        // ex5 ------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        int target;
        boolean found = false;

        int[][] arrs ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("검색할 값을 입력하세요: ");
        target = scanner.nextInt();
        
        // for문 작성
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (arrs[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("값" + target + "은(는) 2차원 배열 arrs에서 찾았습니다.");
        } else {
            System.out.println("값" + target + "은(는) 2차원 배열 arrs에서 찾을 수 없습니다.");
        }
    }
}
