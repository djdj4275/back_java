package section10.singleton;

public class Singleton {
    // 싱글톤

    // = 소프트웨어 디자인패턴중 하나로 특정 클래스의 인스턴스가 애플리케이션 전체에서
    // 단, 하나만 존재하도록 보장하는 패턴.

    // = 해당 클래스의 객체가 전역적으로 하나만 존재하므로, 이 객체에 접근할 수 있는 단일지점을 제공
    // = 주로 전역상태를 관리하거나, 애플리케이션 전체에서 공통적으로 사용되는 자원을 관리할때 사용

    // = 메모리절약 / 전역상태관리 / 객체생성비용절감 등의 장점
    // = 테스트어려움 / 클래스간의 강한 결합 / 멀티스레드 환경에서의 문제 등의 단점
    // (멀티스레드에서 인스턴스 생성을 동시에 해버릴수 있으므로 인스턴스의 중복생성 가능성)

    // = 클래스의 인스턴스 생성을 내부에서만 제어하고 외부에서는 생성할 수 없도록 함.

    // >>> 싱글톤 방식의 사용 사례
    // 1. 로그관리 (모든 로그는 동일한 인스턴스를 통해 기록)
    // 2. 데이터베이스 연결 (애플리케이션이 db에 접속시 단일 연결 객체를 사용하면 여러 연결관리 복잡성 x)
    // 3. 설정관리 (애플리케이션 전역으로 설정을 관리)
    // 4. 캐시 (전역적으로 하나의 캐시 인스턴스 유지해 데이터 일관성 보장)
    // 5. 스레드 (전역적으로 하나의 스레드 풀 인스턴스를 유지해 스레드 관리 용이)

    private Singleton() { // 생성자를 private으로 두어서 다른 곳에서 new Singleton으로 생성불가

    }

    // 싱글톤 방식 x (호출시마다 새롭게 객체를 생성하기때문에 객체가 하나만 보장된다는 부분에서 x)
    public static Singleton getNewInstance() { // 객체 자체를 생성해서 리턴해주는 메소드 자체를 지원
        return new Singleton();
    }

    // 싱글톤 방식 o
    private static Singleton singleton; // 싱글톤 객체 미리 생성 (초기화는 아직)
    public static Singleton getInstance() { // 메소드 호출시
        if (singleton == null) { // 아직 초기화 전으로 객체의 값이 null이라면 (주소값이 없다면)
            return singleton = new Singleton(); // 초기화를 해주고 리턴
        } else { // 초기화가 이미 되어있다면 (이미 사용되어서 주소값이 있다면)
            return singleton; // 그대로 리턴
        }
    }
}

class practice {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); // 생성자가 private이라서 호출불가
        Singleton singleton1 = Singleton.getNewInstance(); // get 인스턴스 호출자로 생성
        Singleton singleton2 = Singleton.getNewInstance(); // get 인스턴스 호출자로 생성
        System.out.println(singleton1 == singleton2); // false (싱글톤 방식이 아님)

        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        System.out.println(singleton3 == singleton4); // true (싱글톤 방식이 맞음)
    }
}
