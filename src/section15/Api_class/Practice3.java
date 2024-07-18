package section15.Api_class;

class Customer {
  private int customerId;
  private String customerName;

  public int getCustomerId() {
    return this.customerId;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerId(int id) {
    this.customerId = id;
  }

  public void setCustomerName(String name) {
    this.customerName = name;
  }

  @Override
  public int hashCode() {
    return customerId;
  }
}

public class Practice3 {
  public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.setCustomerId(1);
    c1.setCustomerName("김일남");
    System.out.println(c1.hashCode());
  }
}
