package section13.Practice;

public class Practice5 {
  interface ClickListener {
    void onClick();
  }

  public static void simulateButtonClick(ClickListener listener) {
    listener.onClick();
  }

  public static void main(String[] args) {
    ClickListener listener = new ClickListener() {
      @Override
      public void onClick() {
        System.out.println("Button clicked!");
      }
    };

    simulateButtonClick(listener);

    ClickListener listener2 = () -> {
      System.out.println("Button clicked!");
    };

    simulateButtonClick(listener2);
  }
}
