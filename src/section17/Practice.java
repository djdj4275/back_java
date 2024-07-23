package section17;

// 멀티스레딩

// 프로그램이 실행되면 프로세스 상태가 됨.
// cpu가 이 프로세스를 처리하는 단위를 쓰레드 라고함.

class Sample extends Thread {
  @Override
  public void run() { // Thread 상속을 위해 무조건 run메소드 오버라이딩 해야함
    System.out.println(Thread.currentThread().getName()); 
  }
}

public class Practice {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName()); // main

    Sample sample = new Sample();
    sample.start(); // 쓰레드 클래스의 run 메소드 실행 (Thread-0)
    
    Sample sample2 = new Sample();
    sample2.setName("스레드2");
    sample2.start(); // (스레드2)
  }
}
