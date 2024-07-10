package section09.callByReference;

public class Practice1 {
    static void modifyValue(int value) {
        value = 20; // 이 value값과 매개변수로 들어오고있는 value값은 다르기때문에 결과적으로 바깥에서 콘솔 찍히는 value값은 들어오는 매개변수값으로 들어가게됨.
        System.out.println("modifyValue() 메소드 내에서 변경된 value\t: " + value);
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.println("modifyValue() 메소드 호출 전 value\t: " + value);
        
        // 값에 의한 호출
        modifyValue(value); // 같은 클래스 내에서 참조하려고 할때 생성되기 이전에 불러오기때문에 에러가 발생, modifyValue메소드를 static으로 해서 바로 메모리에 올라가게끔 하면 즉시 참조 가능.
        System.out.println("modifyValue() 메소드 호출 후 value\t: " + value);
    }
}
