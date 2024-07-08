package section06;

public class Practice2 {
    public static void main(String[] args) {
        /* 
            <별찍기>
            *
            **
            ***
            ****
            *****
         */

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
