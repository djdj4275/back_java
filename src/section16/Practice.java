package section16;

// generic (제네릭)
// 데이터 타입의 일반화
// 코드 재사용성을 높여줌
// 타입 안정성 보장
// 관리의 편리성

class ClassInt {
  private int element;

  public int getElement() {
    return this.element;
  }

  public void setElement(int element) {
    this.element = element;
  }
}

// 제네릭 타입 클래스
class ClassGeneric <E> {
  private E element;

  public E getElement() {
    return this.element;
  }

  public void setElement(E element) {
    this.element = element;
  }

}

public class Practice {
  public static void main(String[] args) {
    ClassInt classInt = new ClassInt();
    classInt.setElement(10);
    System.out.println(classInt.getElement());

    ClassGeneric<Integer> classGeneric = new ClassGeneric<>(); // 우측은 타입 생략가능
    classGeneric.setElement(10);
    System.out.println(classGeneric.getElement());
  }
}
