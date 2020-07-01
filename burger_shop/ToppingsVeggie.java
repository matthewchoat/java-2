package burger_shop;

public class ToppingsVeggie extends Toppings{
  public ToppingsVeggie(String toppingName, int toppingAmount, double toppingPrice) {
    super(toppingName, toppingAmount, toppingPrice);
  }

  @Override
  public void setToppingAmount(int toppingAmount) throws Exception {
    if(toppingAmount <= 4 ) {
      super.setToppingAmount(toppingAmount);
    }
    else throw new Exception("Cannot add more than quadruple veggie per burger, please try again.");
  }
}
