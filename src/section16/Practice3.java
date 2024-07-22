package section16;

// 제네릭의 타입 제약주기

class NumberBox<T extends Number> { // 모든 숫자타입만 제네릭으로 들어오게끔 허용
  private T item;

  public T getItem() {
    return this.item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}

public class Practice3 {
  public static void main(String[] args) {
    NumberBox<Integer> intBox1 = new NumberBox<>();
    intBox1.setItem(10);
    System.out.println(intBox1.getItem());

    // NumberBox<String> intBox2 = new NumberBox<>(); // String타입은 Number에 해당되지 않아서 사용불가
    // intBox2.setItem("20");
    // System.out.println(intBox2.getItem());
  }
}
