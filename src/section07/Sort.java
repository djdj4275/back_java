package section07;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 2, 7, 9};
        
        System.out.println(Arrays.toString(numbers)); // 정렬 전

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); // 정렬 후

        // wrapper (정렬을 오름차순 이외의 방법을 진행하고 싶다면 객체형식으로 변경이 필요)
        Integer[] numbersWrapper = {10, 5, 8, 2, 7, 9};
        
        Arrays.sort(numbersWrapper, Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(Arrays.toString(numbersWrapper));
    }
}
