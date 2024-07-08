package section05;

public class For {
    public static void main(String[] args) {
        // 짝수 출력 1~10
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 이중 for문
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+j);
            }
        }

        // 구구단
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\t", i, j, i*j);
            }
            System.out.println();
        }
    }
}
