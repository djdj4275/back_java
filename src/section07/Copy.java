package section07;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        // 얕은복사 / 깊은복사 (포인터 개념)
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = originalArray; // 얕은복사 (원본 데이터의 주소(참조)만 복사되어 데이터 변경시 같은 값 공유)

        // 때문에 깊은복사 (재귀적으로 새로운 메모리를 할당 복사) 하여서 전혀 다른값으로서 운용하도록 하는것이 좋음

        // 이 방법은 배열의 내용을 새 배열로 복사하는것이기때문에 포인터가 같진않지만,
        // 다차원배열의 경우 내부배열까지 깊은복사 하지 않기때문에 또 같은 값을 공유하게 됨
        // 따로 깊은복사의 방법은 정해져있지 않고 새롭게 객체 선언후 for문 등으로 새롭게 넣어서 직접구현하거나,
        // ObjectOutputStream 이나 ObjectInputStream을 이용해서 deep copy를 구현할 수 있음
        int[] copiedArray2 = Arrays.copyOf(originalArray, originalArray.length);
        int[] copiedArray3 = new int[3];
        // System.arraycopy(originalArray, 0, copiedArray3, 0, originalArray.length);

        originalArray[0] = 100;

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copiedArray));
        System.out.println(Arrays.toString(copiedArray2));

        System.out.println();

        int[][] arrs = new int[3][2]; // 선언만 했기때문에

        // arrs[0][1] = 2; // 부분값 할당
        // arrs[2][0] = 30;

        // 이렇게 초기화를 별도로 지정할때에 각각의 배열의 길이를 다시 정해줄수있음.
        arrs[0] = new int[] {0,1};
        arrs[1] = new int[] {2,3,4};
        arrs[2] = new int[] {5,6,7,8};

        int index = 0;
        for (int[] arr : arrs) {
            System.out.println("index" + index + ":" + Arrays.toString(arr));
            index ++;
        }

        // [[0,0,0,0], [0,0,0,0], [0,0,0,0]]
        int[][] ex = new int[3][4];
        
        for (int[] e : ex) {
            System.out.println("index" + index + ":" + Arrays.toString(e));
            index ++;
        }

        System.out.println();

        // 다차원배열의 깊은복사
        int[][] Arrs = new int[3][4];

        // 예시를 위해 임의로 값 할당 (이렇게 하면 다차원배열안의 각각의 배열들이 주소값이 아닌 새로운 객체로서 선언됨.)
        Arrs[0] = new int[]{1, 2, 3, 4};
        Arrs[1] = new int[]{5, 6, 7, 8};
        Arrs[2] = new int[]{9, 10, 11, 12};

        int[][] copiedArrs = new int[3][4];

        for (int i = 0; i < Arrs.length; i++) {
            copiedArrs[i] = Arrays.copyOf(Arrs[i], Arrs[i].length);
        }

        System.out.println();

        // ex1 ------------------------------------------------------------------------------
        // 배열 요소 : 10 20 30 40 50

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        // ex2 ------------------------------------------------------------------------------
        // 배열 요소의 합

        int[] ns = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int n : ns) {
            sum += n;
        }

        System.out.print("배열 요소의 합: " + sum);

        System.out.println();

        // ex3 ------------------------------------------------------------------------------
        // 배열 요소의 평균

        int[] es = {10, 20, 30, 40, 50};
        int s = 0;

        for (int e : es) {
            s += e;
        }

        System.out.print("배열 요소의 평균: " + s/es.length);
    }
}
