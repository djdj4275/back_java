package section17;

import java.util.ArrayList;

// runnable 클래스

class Sample3 implements Runnable {
  int seq;

  public Sample3(int seq) {
    this.seq = seq;
  }

  @Override
  public void run() { 
    System.out.println(this.seq + "thread start.");
    try {
      Thread.sleep(1000); // 1초만큼 대기
    } catch (Exception e) {
      e.printStackTrace(); // 에러발생시 함수 지속 추적함
    }
    System.out.println(this.seq + "thread end.");
  }
}

public class Practice3 {
  public static void main(String[] args) {

    ArrayList<Thread> threads = new ArrayList<>();

    // 10개의 스레드를 생성하고 병렬적으로 처리됨. (순서x)
    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(new Sample3(i)); // 구현으로 선언시에는 형식 이렇게
      t.start();
      threads.add(t);
    }

    // 위에 생성한 10개의 각각 스레드에 join을 걸어줌
    for (int i = 0; i < threads.size(); i++) {
      Thread t = threads.get(i);
      try {
        t.join();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    System.out.println("main end."); // 위에서 스레드 종료후 실행되도록 join메소드를 스레드마다 걸어둠
  }
}
