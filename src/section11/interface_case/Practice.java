package section11.interface_case;

// 인터페이스

// 1. 객체 직접 생성불가 (타입으로선 사용가능)
// 2. 상수, 추상메소드만 필드에 존재가능 (단, java 8 이후부턴 default메소드도 포함가능)
// 3. 클래스가 특정기능을 구현하도록 강제
// 4. 다중상속을 흉내낼수있음.
// 5. 다형성 지원

// ex) >>> JDBC (java database connectivity) = 자바의 db 커넥터 사용시에 인터페이스 사용함
// = 다형성 및 유연성 제공 : 각 db 벤더는 인터페이스 구현을 통해 자신의 db에 특화된 연결방식 제공, 자바 애플리케이션 개발자가 특정 db에 종속되지 않고 JDBC API를 사용가능
// = 추상화를 통한 DB 독립성 : 추상화된 메소드로 DB 연결관리, 동일한 JDBC 코드 사용해 다른 DB 손쉽게 전환
// = 프로그래밍 모델 통일 : DB 접속, 쿼리실행, 결과처리 등 작업 일관적으로 수행가능
// = 확장 가능성 및 커스텀 : 특정 DB 벤더가 제공하는 고유기능 활용가능한 메소드 추가가능


// < 추상클래스 / 인터페이스 >

// 추상클래스 사용효과
// 1. 추상 메소드를 포함할수있음
// 2. 일반 메소드를 포함할수있음
// 3. 상속을 통한 확장성 제공

// 인터페이스 사용효과
// 1. 다중구현 및 상속을 지원
// 2. 특정 행위 보장
// 3. 클래스 간 결합도 낮추고 유연성 제공

interface RemoteControl {
    // 인터페이스에선 상수 선언에 대해 default 값이 public static final 이기때문에 안붙여도 컴파일 단계에서 알아서 붙는다.
    public static final int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    void turnOff();

    // 이것은 추상메소드가 아닌 default 메소드
    // java 8 이후부터는 인터페이스안에 default 메소드도 추가가능 (static 메소드, private 메소드도 가능)
    default void userGuide() { 
        System.out.println("Welcome!");
    }
}

interface Rollable {
    void rollUp();
    void rollDown();
}

interface Foldable {
    void fold();
    void unfold();
}

// 인터페이스도 인터페이스를 상속가능 / 다중상속가능
// >> 이렇게되면 상속받은 인터페이스의 추상메소드와 현재 이 인터페이스의 추상메소드 모두 구현이 필요해짐
interface AdvancedTV extends Rollable, Foldable { 
    void activateAI();
    void deActivateAI();
}

// SamsungTV 클래스는 RemoteControl 인터페이스를 <구현> 한다.
class SamsungTV implements RemoteControl, Rollable { // 인터페이스는 다중상속 가능.
    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung TV is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV is now OFF");
    }

    @Override
    public void rollUp() {
        System.out.println("Samsung TV is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("Samsung TV is rolling down");
    }
}

class LGTV implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("LG TV is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV is now OFF");
    }
}

public class Practice {
    public static void main(String[] args) {
        SamsungTV samsungTV = new SamsungTV();
        samsungTV.userGuide();
        samsungTV.turnOn();
        samsungTV.turnOff();

        LGTV lgTV = new LGTV();
        lgTV.turnOn();
        lgTV.turnOff();
    }
}
