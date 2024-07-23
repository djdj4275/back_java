package section17;

class Sample2 extends Thread {
  int seq;

  public Sample2(int seq) {
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

public class Practice2 {
  public static void main(String[] args) {
    Thread t = new Sample2(1);
    t.start();

    try {
      t.join(); // 스레드 종료될때까지 대기하게 시킴 (아래 코드 순서적 진행시키기위함)
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("main end.");
  }
}
