package section04;

public class If {
    public static void main(String[] args) {
        boolean isRain = true;

        if (isRain) {
            System.out.println("우산을 가져 가라");
        }

        boolean money = false;
        if (money) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

        // ex1
        int m = 2000;
        boolean hasCard = true;

        if (m >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
    }
}
