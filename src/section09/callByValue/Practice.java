package section09.callByValue;

class Updater {
    void updateValue(int count) {
        count++;
    }

    void updateObject(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0;
}

public class Practice {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before - myCounter.count\t" + myCounter.count);

        Updater myUpdater = new Updater();

        myUpdater.updateValue(myCounter.count); // 값을 넘겨서 바꾸려고 했기 때문에 바뀌지 않음.
        System.out.println("after value - myCounter.count\t" + myCounter.count);

        myUpdater.updateObject(myCounter); // 객체를 넘기고 그 객체안의 필드값을 변경했기 때문에 변경됨.
        System.out.println("after object - myCounter.count\t" + myCounter.count);
    }
}
