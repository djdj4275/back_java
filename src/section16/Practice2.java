package section16;

// 제네릭 메소드

public class Practice2 {
  // 제네릭 메소드
  public static <T> void printArray(T[] array) {
    for (T element: array) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    Integer[] intArr = {1,2,3,4,5}; // 제네릭은 기본타입이 아니라 wrapper 클래스 사용해야함
    printArray(intArr);
  }
}
