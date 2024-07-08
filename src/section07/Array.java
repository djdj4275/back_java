package section07;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열
        // 배열은 콘솔로 찍어보면 배열 자체는 객체 해시코드(16진수)로 표현된다.
        // 값을 참조하고싶다면 index를 사용해 확인하거나 배열 자체를 확인하고 싶다면 특정 메소드를 이용해 변환해서 확인해야함
        // 배열은 선언시 크기가 지정되며, 이후 공간 크기 추가 또는 삭제가 불가함
        // 배열은 지정 자료형 값만 저장이 가능함
        int[] oddArr = {1, 3, 5, 7, 9};
        int evenArr[] = {2, 4, 6, 8, 10}; // 이렇게 선언도 가능
        System.out.println(evenArr);

        for (int i = 0; i < oddArr.length; i++) {
            System.out.printf("%d ", oddArr[i]);
        }

        // 선언 및 값 초기화
        int[] oddArrObject; // 선언
        // oddArrObject = {1, 3, 5, 7, 9}; 이렇게는 적용되자않음 위는 객체를 선언한것이므로 넣을때도 객체로 넣어줘야함
        oddArrObject = new int[] {1, 3, 5, 7, 9}; // 초기화
        System.out.println(Arrays.toString(oddArrObject)); //  [1, 3, 5, 7, 9]

        int[] intArr = new int[3]; // 이런식으로 빈배열 생성도 가능 (단, 배열은 길이가 정해져있기에 길이도 정해줘야함, 빈자리에 0이 들어감)
        System.out.println(Arrays.toString(intArr)); // [0, 0, 0, 0, 0]
    }
}
