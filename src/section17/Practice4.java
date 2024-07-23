package section17;

class Counter {
  private int count;

  public int getCount() {
    return this.count;
  }

  public synchronized void setCount() { // (메소드 동기화)
    this.count++;
  }
}

class Sample4 extends Thread {
  int seq;
  private Counter counter;

  public Sample4(int seq, Counter counter) {
    this.seq = seq;
    this.counter = counter;
  }

  @Override
  public void run() {
    synchronized (counter) { // (블럭 동기화)
      try {
        for (int i = 0; i < 10; i++) {
          Thread.sleep(1000); // 1초만큼 대기
          counter.setCount();
          System.out.println(this.seq + "thread add count" + counter.getCount());
        }
      } catch (Exception e) {
        e.printStackTrace(); // 에러발생시 함수 지속 추적함
      }
    }
  }
}

public class Practice4 {
  public static void main(String[] args) {
    Counter counter = new Counter();

    // 각각의 스레드지만 자원(counter)은 공유
    // 때문에 각각의 스레드가 공유된 자원을 같이 건드리기때문에
    // 예상한것과 다르게 동작할수있음. 때문에 스레드 동기화가 필요
    // >>> (메소드 동기화) 사용하는 메소드에 synchronized 붙여주면됨
    // >>> (블럭 동기화) 실행부분에 synchronized 블럭을 생성하고 그안에서 로직실행, 파라미터로 객체를 받아서 그 객체에 한해서 동기화 진행
    Sample4 sample1 = new Sample4(1, counter);
    Sample4 sample2 = new Sample4(2, counter);
    sample1.start();
    sample2.start();
  }
}
