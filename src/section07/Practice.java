package section07;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // ex1 ------------------------------------------------------------------------------
        /* 
            배열의 최댓값 : 50
            배열의 최솟값 : 10
        */

        int[] numbers = {10, 20, 30, 40, 50};

        int max = numbers[0];
        int min = numbers[0];

        // for each
        for (int number : numbers) {
            max = number;
        }

        System.out.println("배열의 최댓값: " + max);
        System.out.println("배열의 최솟값: " + min);

        // ex2 ------------------------------------------------------------------------------
        /* 
            찾을 값을 입력하세요 : 70
            배열에 70값이 존재하지 않습니다.
        */
        
        int target;

        Scanner scanner = new Scanner(System.in);

        System.out.println("찾을 값을 입력하세요 : ");
        target = scanner.nextInt();

        int[] nums = {10, 20, 30, 40, 50};
        boolean found = false;

        // for each
        for (int num : nums) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("배열에 " + target + "값이 존재합니다.");
        } else {
            System.out.println("배열에 " + target + "값이 존재하지 않습니다.");
        }
    }
}
