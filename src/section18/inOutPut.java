package section18;

public class inOutPut {
    public static void main(String[] args) {
        // 자바의 입출력 (I/O)

        // print는 줄을 따로 구분하지않고 출력함 (println은 줄을 구분함)
        System.out.print("Java is ");
        System.out.print("nice! ");

        System.out.print("Java is \n"); // \n 은 개행문자 (줄바꿈)
        System.out.print("nice! ");

        // 서식문자
        System.out.println(String.format("I eat %d apples.", 5)); // println은 서식문자 사용하려면 String.format 사용
        // printf는 서식문자 사용가능(줄바꿈은 하지않음 - 줄바꿈은 println만)
        System.out.printf("I eat %d apples\n", 5); // %d : 정수(10진수)
        System.out.printf("I eat %f apples\n", 2.5); // %f : 실수
        System.out.printf("I eat %s apples\n", "five"); // %s : 문자열
        System.out.printf("I eat %c apples\n", 'y'); // %c : 문자
        System.out.printf("I eat %o apples\n", 5); // %o : 정수(8진수)
        System.out.printf("I eat %x apples\n", 5); // %x : 정수(16진수)
        System.out.printf("I eat %e apples\n", 8.749163e+02); // %e : 지수형 실수
        System.out.printf("I eat %% apples\n"); // %% : 특수문자%

        // 파라미터를 넣는 갯수는 내가 사용한 서식문자의 갯수만큼 추가가능
        System.out.printf("I have completed %d%% of my Java studies\n", 100);
        System.out.printf("I have completed %d%% of my %s studies\n", 100, "Java");
        // 서식문자 앞에 숫자를 입력하면 서식문자가 콘솔에서 차지하는 공간을 조정가능 (음수도 가능)
        System.out.printf("I have completed %3d%% of my %s studies\n", 90, "Java");
        System.out.printf("I have completed %-3d%% of my %s studies\n", 90, "Java");
        // %f(실수) 사용시 앞에 소수점을 사용해 자릿수 표현, 반올림됨
        System.out.printf("I have completed %.2f%% of my %s studies\n", 99.9999999, "Java");
        System.out.printf("I have completed %.2f%% of my %s studies\n", "99.9999999", "Java"); // 문자열로 하게되면 반올림 방지

        // ex1
        int age = 25;
        double height = 175.5;
        String city = "Busan";

        System.out.printf("나이: %d, 키: %f, 도시: %s\n", age, height, city);

        // ex2
        int num1 = 123;
        int num2 = 567;

        System.out.printf("%d", num1);
        System.out.printf("%4d\n", num2);
    }
}
