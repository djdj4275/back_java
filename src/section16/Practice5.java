package section16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// 컬렉션 인터페이스, 컬렉션 프레임워크

// 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
// 데이터 저장하는 자료구조, 데이터 처리하는 알고리즘을 구조화해 클래스로 구현한것.

// list : 순서 o / 중복 o / 구현클래스 (Arraylist, linkedlist)
// Set : 순서 x / 중복 x / 구현클래스 (HashSet)
// Map : 순서 x / 키 중복 x, 값 중복 o / 구현클래스 (HashMap)

// <List 인터페이스>
public class Practice5 {
  public static void main(String[] args) {
    // ArrayList
    ArrayList<String> pitches = new ArrayList<>();
    pitches.add("138");
    pitches.add("129");
    pitches.add("142");

    pitches.get(0);
    pitches.contains("142"); // true
    // pitches.contains(142)); // false
    pitches.remove("142");

    String[] data = {"138", "129", "142"};
    ArrayList<String> pitches1 = new ArrayList<>(Arrays.asList(data));

    String result = "";
    for (int i = 0; i < pitches1.size(); i++) {
      result += pitches1.get(i);
    }

    result = String.join(",", pitches1); // 값 사이에 콤마 넣기
    
    // LinkedList
    LinkedList<String> linkedList = new LinkedList<>();

    linkedList.add("Tue");
    linkedList.add("Thu");
    linkedList.add("Fri");

    linkedList.addFirst("Mon");
    linkedList.addLast("Sun");

    linkedList.add(2, "Wen");
    linkedList.add(5, "Sat");

    linkedList.remove("Sun");

    linkedList.removeLast();

    linkedList.removeFirst();
    
    linkedList.size();

    // ArrayList, LinkedList의 특징
    // 값 추가 속도는 ArrayList가 더 빠름 (add(i))
    // 값 반환 속도는 ArrayList가 더 빠름 (get(i))
    // 값 중간 삽입 속도는 LinkedList가 더 빠름 (add(i,i))
    // 값 삭제 속도는 LinkedList가 더 빠름 (remove(i))
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkList = new LinkedList<>();

    long startTime = System.nanoTime();

    for (int i = 0; i < 1000000; i++) {
      arrayList.add(i); // 값 추가
      // arrayList.get(i); // 값 반환
      // arrayList.add(i, i); // 값 삽입
      arrayList.remove(i); // 값 삭제
    }

    long endTime = System.nanoTime();

    long duration = endTime - startTime;
    System.out.println("arrayList 소요시간 : " + duration);

    startTime = System.nanoTime();

    for (int i = 0; i < 1000000; i++) {
      linkList.add(i); // 값 추가
      // linkList.get(i); // 값 반환
      // linkList.add(i, i); // 값 삽입
      linkList.remove(i); // 값 삭제
    }

    endTime = System.nanoTime();

    duration = endTime - startTime;
    System.out.println("linkedList 소요시간 : " + duration);
  }
}
