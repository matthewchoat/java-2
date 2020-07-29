package burger_shop;

import java.util.ArrayList;

public class HealthBurger extends Burger {
  private ArrayList<Toppings> toppings = new ArrayList<>();

  public HealthBurger(){
    super();
    this.setName("Healthy Grass-fed Beef Burger");
    this.setBread(new Bread("Organic Wheat"));
    this.setMeat(new Meat("Organic Grass-fed Beef"));
    this.setPrice(7.99);

  }


  @Override
  public void addToppings(Toppings topping) throws Exception {
    if (topping instanceof ToppingsMeat || topping instanceof ToppingsCheese) throw new Exception("Cannot add Meat or Cheese toppings to Healthy Burgers, please try again.");
    if (getToppings().size() + 1 <= 4) { //Limited to FOUR toppings max per healthy burger
      getToppings().add(topping);
    }
    else throw new Exception("Cannot add more than 4 toppings to a Healthy Burger");

  }

}

