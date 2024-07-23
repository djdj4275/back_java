package section16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Iterator 인터페이스
public class Practice7 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    Iterator<Integer> iter = list.iterator();

    int value = iter.next(); // 인덱스 다음값
    System.out.println(value); 

    iter.hasNext(); // 다음요소가 있는지 확인
  }
}
