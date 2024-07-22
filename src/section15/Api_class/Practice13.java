package section15.Api_class;

import java.util.Calendar;

// java.util 패키지의 calendar 클래스

public class Practice13 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance(); // 객체 생성

    calendar.get(Calendar.YEAR);
    calendar.get(Calendar.MONTH + 1); // 월은 0~11 이라 1더해줌
    calendar.get(Calendar.DAY_OF_MONTH);
    calendar.get(Calendar.HOUR);
    calendar.get(Calendar.MINUTE);
    calendar.get(Calendar.SECOND);
    calendar.get(Calendar.DAY_OF_WEEK);

    int month = calendar.get(Calendar.MONTH);

    switch (month) {
      case Calendar.JULY:
        System.out.println("지금은 7월");
        break;
      case Calendar.AUGUST:
        System.out.println("지금은 8월");
        break;
      case Calendar.SEPTEMBER:
        System.out.println("지금은 9월");
        break;
      default:
        break;
    }

    int ampm = calendar.get(Calendar.AM_PM); // 0 또는 1
    if (ampm == Calendar.AM) {
      System.out.println("오전");
    } else {
      System.out.println("오후");
    }

    // 이외에도 calendar 클래스 메소드엔
    // set, add, roll, getTime, setTime등이 존재.
    calendar.getTime(); // date 객체

    calendar.set(Calendar.YEAR, 2025); // 캘린더값의 연도값을 2025년으로 변경
    calendar.set(Calendar.MONTH, Calendar.DECEMBER);

    calendar.add(Calendar.DAY_OF_MONTH, 3); // 현재 일수에서 3일을 더함

    calendar.roll(Calendar.YEAR, false); // 연도를 1씩 당기거나 밀수있음 (false, true)
  
    Calendar newCalendar = Calendar.getInstance();
    newCalendar.setTime(calendar.getTime()); // date객체 자체로 갈아끼우기
  }
}
