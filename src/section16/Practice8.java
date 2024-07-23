package section16;

import java.util.HashMap;
import java.util.Map;

// <Map 인터페이스>
// list, set과 달리 별도 인터페이스 존재
// 키는 중복없음, 값은 중복가능

public class Practice8 {
  public static void main(String[] args) {
    // HashMap (타입도 key, value 둘다 적어줘야함)
    HashMap<String, String> map = new HashMap<>();

    map.put("people", "사람");
    map.put("baseball", "야구");

    map.get("people"); // "사람"

    // apple이라는 key에 해당하는 값이 없으면 "값이 없음" 이라는 값을 리턴
    map.getOrDefault("apple", "값이 없음");

    map.containsKey("people"); // 해당 키 값이 있는지 확인.

    map.containsValue("사람"); // 해당 값이 있는지 확인.

    map.remove("people"); // 해당 키값 지움 (그리고 value값 반환)

    map.size();

    map.keySet(); // key값만 set 객체로 리턴

    map.entrySet(); // 전체 set 객체로 리턴

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey());
    }
  }
}
