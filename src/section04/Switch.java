package section04;

public class Switch {
    public static void main(String[] args) {
        int month = 7;
        String monthString = "";

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            default:
                monthString = "Invalid month";
                break;
        }

        System.out.println(monthString);


        // ex1
        System.out.println("주문하신 커피가 나왔습니다.");
        System.out.println("시럽을 넣어 드릴까요?");
        
        boolean ans = true;

        if (ans) {
            System.out.println("시럽을 넣었습니다.");
        }

        System.out.println("만족도 조사에 참여하시겠어요?");
    }
}
