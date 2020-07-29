package burger_shop;

public class Drink implements MenuItem{
  private String drinkName = "Coca-Cola";
  private String drinkSize = "Medium";
  private double drinkPrice = 1.49;

  public Drink(){ }

  public Drink(String drinkName, String drinkSize, double drinkPrice) {
    this.drinkName = drinkName;
    this.drinkSize = drinkSize;
    this.drinkPrice = drinkPrice;
  }

  public void setName(String drinkName) { this.drinkName = drinkName; }
  public void setSize(String drinkSize) { this.drinkSize = drinkSize; }
  public void setPrice(double drinkPrice) { this.drinkPrice = drinkPrice; }

  public String getName(){
    return  drinkName;
  }
  public String getSize(){
    return  drinkSize;
  }
  public double getPrice(){
    return drinkPrice;
  }


}