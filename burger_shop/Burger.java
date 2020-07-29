package burger_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger implements MenuItem {
  private String name = "Plain Burger";
  private Bread bread = new Bread("white");
  private Meat meat = new Meat("Grass-fed Beef");
  private double burgerPrice = 6.99d;
  private ArrayList<Toppings> toppings = new ArrayList<>();

  public Burger(){ }

  public void setName(String name) { this.name = name; }
  public void setBread(Bread bread) { this.bread = bread; }
  public void setMeat(Meat meat) { this.meat = meat; }
  public void setPrice(double price) { this.burgerPrice = price; }
  public void setToppings(ArrayList<Toppings> toppings) { this.toppings = toppings; }

  public String getName(){ return  name; }
  public Bread getBread() { return bread; }
  public Meat getMeat() { return meat; }
  public double getPrice(){
    double priceTotal = getToppings().stream().map(topping -> topping.getToppingPrice()).reduce(0d, (accum, amount) -> accum + amount );
    return burgerPrice + priceTotal; }
  public ArrayList<Toppings> getToppings() { return toppings; }


  public void addToppings(Toppings topping) throws Exception {
    for(Toppings t: toppings){
      if (t.getToppingName().equals(topping.getToppingName())) throw new Exception("Cannot add the same topping twice.");
    }
    if (this.toppings.size() + 1 <= 2) { //Limited to TWO toppings max per plain burger
      this.toppings.add(topping);
    }
    else throw new Exception("Cannot add more than 2 toppings to a Plain Burger");


  }

}
