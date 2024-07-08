package section06;

public class Practice4 {
    public static void main(String[] args) {
        /* 
            <공백 별찍기>
            ----*
            ---**
            --***
            -****
            *****
        */

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
