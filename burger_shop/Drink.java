package burger_shop;

public class Drink {
  private String drinkName;
  private String drinkSize;
  private double drinkPrice;

  public Drink(String drinkName, String drinkSize, double drinkPrice){
    this.drinkName = drinkName;
    this.drinkSize = drinkSize;
    this.drinkPrice = drinkPrice;

  }

  public String getDrinkName(){
    return  drinkName;
  }

  public String getDrinkSize(){
    return  drinkSize;
  }

  public double getDrinkPrice(){
    return drinkPrice;
  }


}