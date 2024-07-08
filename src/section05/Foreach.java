package section05;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Foreach {
    public static void main(String[] args) {
        // foreach
        String[] n = {"one", "two", "three", "four", "five"};

        // for each는 반복가능한 객체 (iterable object)에서 사용가능 
        for (String ns : n) { 
            System.out.println(ns);
        }

        int[] marks = {90, 25, 67, 45, 80};

        for (int mark : marks) {
            if (mark < 60) {
                continue;
            }
            System.out.println("합격");
        }

        // IntStream을 사용하면 index값은 받을수있지만 value를 받을순 없음 array[i]이런식으로 자체적으로 써야함
        IntStream.range(0, marks.length).forEach(i -> {
            System.out.println("인덱스값 받기");
        });

        // 아니면 AtomicInteger를 선언해 forEach문을 돌리면서 값을 1씩 증가시켜서 index값으로 활용도 가능
        // 이때 그냥 int변수값을 안쓰고 AtomicInteger를 쓰는 경우의 차이점은
        // 일단 단일스레드 환경에서 둘의 차이는 거의 없지만 멀티스레드 방식에서
        // AtomicInteger는 원자적 연산으로 모든 연산이 중단되지 않고 한번이 이루어지며, 동기화 없이 안전하게 사용되어 여러 스레드가 동시에 접근해도 데이터의 일관성과 정확성을 유지함
        int[] ar = {1, 2, 3, 4, 5};
        AtomicInteger index = new AtomicInteger();
        Arrays.stream(ar).forEach(value -> {
            System.out.println("Index: " + index.getAndIncrement() + ", Value: " + value);
        });

        // 멀티 스레드시의 예제
        // Runnable 인터페이스를 구현한 익명 클래스를 사용하여 스레드의 실행 로직을 정의
        // Runnable : java 스레드 실행을 위한 인터페이스 구현 (run 메소드 오버라이드 필요)
        Runnable task = () -> { // runnable run 메소드를 구현
            // 5번 반복하여 실행될 코드
            for (int i = 0; i < 5; i++) {
                // 현재 실행 중인 스레드의 이름과 반복 횟수를 출력
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    // 잠시 대기 상태로 전환하여 다음 작업을 지연
                    Thread.sleep(100); // 100밀리초(0.1초) 동안 대기
                } catch (InterruptedException e) {
                    // InterruptedException이 발생하면 스레드가 interrupted됐음을 처리
                    System.out.println("Thread interrupted: " + e.getMessage());
                    return; // 스레드 종료
                }
            }
        };

        // 새로운 스레드 객체를 생성하고 Runnable task를 실행할 준비
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // 각각의 스레드를 시작
        thread1.start();
        thread2.start();

        try {
            // 메인 스레드는 thread1과 thread2가 완료될 때까지 기다림
            thread1.join(); // thread1이 완료될 때까지 대기
            thread2.join(); // thread2가 완료될 때까지 대기
        } catch (InterruptedException e) {
            // InterruptedException이 발생하면 메인 스레드가 interrupted됐음을 처리
            System.out.println("Main thread interrupted: " + e.getMessage());
            // 현재 스레드를 다시 interrupted 상태로 설정
            Thread.currentThread().interrupt(); // 현재 스레드를 다시 interrupted 상태로 설정
        }

        // 모든 스레드가 완료된 후 마지막에 출력
        System.out.println("Main thread is finished.");
    }
}
