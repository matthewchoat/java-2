package burger_shop;

public class ToppingsMeat extends Toppings{
  public ToppingsMeat(String toppingName, int toppingAmount, double toppingPrice) {
    super(toppingName, toppingAmount, toppingPrice);
  }

  @Override
  public void setToppingAmount(int toppingAmount) throws Exception {
    if(toppingAmount <= 2 ) {
      super.setToppingAmount(toppingAmount);
    }
    else throw new Exception("Cannot add more than double meat per burger, please try again.");
  }
}
