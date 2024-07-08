package section06;

public class Practice3 {
    public static void main(String[] args) {
        /* 
        <역순별찍기>
        *****
        ****
        ***
        **
        *
        */

        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
