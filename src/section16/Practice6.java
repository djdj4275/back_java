package section16;

import java.util.Arrays;
import java.util.HashSet;

// <Set 인터페이스>
public class Practice6 {
  public static void main(String[] args) {
    // HashSet
    HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
    HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

    HashSet<Integer> intersection = new HashSet<>(s1);
    intersection.retainAll(s2); // 교집합 리턴

    HashSet<Integer> union = new HashSet<>(s1);
    union.addAll(s2); // 합집합 리턴

    HashSet<Integer> substract = new HashSet<>(s1);
    substract.removeAll(s2); // 차집합 리턴

    HashSet<String> set = new HashSet<>();

    set.add("set");
    set.addAll(Arrays.asList("set2", "set3"));
    set.addAll(Arrays.asList("set2", "set3")); // 두번해도 중복허용이 되지않아서 한번만 들어감

    set.remove("set2");
    set.size();
  }
}
