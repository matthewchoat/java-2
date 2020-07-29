package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {


  public DeluxeBurger(){
    super();
    this.setName("Kobe Beef Deluxe Burger");
    this.setBread(new Bread("Brioche Bun"));
    this.setMeat(new Meat("Kobe Beef"));
    this.setPrice(8.96);

  }


  @Override
  public void addToppings(Toppings topping) throws Exception {
    if (getToppings().size() + 1 <= 6) { //Limited to SIX toppings max per Deluxe burger
      getToppings().add(topping);
    }
    else throw new Exception("Cannot add more than 6 toppings to a Deluxe Burger");

  }

}

