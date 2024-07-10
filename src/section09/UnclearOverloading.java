package section09;

public class UnclearOverloading {
    String s;
    int a;
    int b;

    UnclearOverloading () {
        s = "java";
        a = 1;
        b = 2;
    }

    UnclearOverloading (String s, int a, int b) {
        this.s = s;
        this.a = a;
        this.b = b;
    }

    // 이런식으로 같은 타입의 매개변수가 연달아 오게되면 생성자 입장에서 각각의 매개변수를 구분할수없기때문에 이렇게 자리 변경하는것은 적용되지 않음.
    // UnclearOverloading (String s, int b, int a) {
    //     this.s = s;
    //     this.a = a;
    //     this.b = b;
    // }

    UnclearOverloading (int a, int b, String s) { // 이런식으로 자리를 바꿀때에는 매개변수의 타입이 연달아 오는 중복은 피해야한다.
        this.s = s;
        this.a = a;
        this.b = b;
    }

    void printField () {
        System.out.printf("s = %s, a = %d, b = %d\n", s, a, b);
    }

    public static void main(String[] args) {
        UnclearOverloading uo = new UnclearOverloading();
        uo.printField();

        UnclearOverloading uo1 = new UnclearOverloading("JAVA", 10, 100);
        uo1.printField();
    }
}
