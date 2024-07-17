package section13.Practice;

// 익명 내부 클래스

interface ButtonClickListener {
  void onClick();
}

public class Practice4 {
  public static void simulateButtonClick(ButtonClickListener listener) {
    listener.onClick();
  }

  public static void main(String[] args) {
    ButtonClickListener button = new ButtonClickListener() {
      @Override
      public void onClick() {
        System.out.println("Button clicked!");
      }
    };
    simulateButtonClick(button);
  }
}
