package section20;

import java.util.HashSet;
import java.util.Set;

public class test {

  // 구구단
  static int[] gugu(int dan) {
    int[] result = new int[9];
    for (int i = 0; i < 9; i++) {
      result[i] = dan * (i+1);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] result = gugu(2);
    for (int dan : result) {
      System.out.println(dan);
    }

    // 3과 5의 배수의 합
    Set<Integer> multiples = new HashSet<>(); // HashSet은 중복값을 허용하지않기때문에 적절한 구조

    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            multiples.add(i);
        }
    }

    int sum = 0;
    for (int number : multiples) {
        sum += number;
    }

    System.out.println(sum);
  }
}
