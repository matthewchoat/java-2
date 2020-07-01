package burger_shop;

public class ToppingsCondiments extends Toppings {
  public ToppingsCondiments(String toppingName, int toppingAmount, double toppingPrice) {
    super(toppingName, toppingAmount, toppingPrice);
  }

  @Override
  public void setToppingAmount(int toppingAmount) throws Exception {
    System.out.println(toppingAmount);
    if(toppingAmount <= 3 ) {
      super.setToppingAmount(toppingAmount);
    }
    else throw new Exception("Cannot add more than triple sauce to a burger, please try again.");
  }
}
