package burger_shop;
//Creating abstract class for inherited topping classes

public abstract class Toppings {
  private String toppingName;
  private double toppingPrice;
  private int toppingAmount;

  public Toppings(String toppingName, int toppingAmount, double toppingPrice){
    this.toppingName = toppingName;
    this.toppingAmount = toppingAmount;
    this.toppingPrice = toppingPrice;
  }

  public void setToppingName(String toppingName) {
    this.toppingName = toppingName;
  }
  public void setToppingPrice(double toppingPrice) {
    this.toppingPrice = toppingPrice;
  }
  public void setToppingAmount(int toppingAmount) throws Exception{
    this.toppingAmount = toppingAmount;
  }

  public double getToppingPrice(){
    return toppingPrice * toppingAmount;
  }
  public int getToppingAmount() {
    return toppingAmount;
  }
  public String getToppingName(){
    return  toppingName;
  }
  
}
