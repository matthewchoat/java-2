package burger_shop;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Meal implements MenuItem{
    private Burger burger; //Limited to one burger per meal
    private ArrayList<Side> sides = new ArrayList<>(); //Limited to THREE sides per meal
    private Drink drink; //Limited to one drink per meal
    private int comboNumber = 1;

  public Meal(Burger burger, Drink drink, Side side) {
    this.burger = burger;
    this.sides.add(side);
    this.drink = drink;

  }

    public void setBurger(Burger burger){ this.burger = burger; }

    public void addSide(Side side) throws Exception {
    for(Side s: sides) { //Prevented from adding multiples of the same item to a meal.
      if (s.getName().equals(side.getName())) throw new Exception("Cannot add more than one of the same item to a combo.");
      }

      if (sides.size() < 3) { //Limited to THREE sides per meal

        this.sides.add(side);
      }
      else throw new Exception("Cannot add more than 3 sides");
    }

    public void setDrink(Drink drink) {
      this.drink = drink;
    }

    public String getName(){ return burger.getName() +" with " + getSideNames() + " and a " + drink.getName(); }
    public double getPrice(){ return burger.getPrice() + getSidePrice() + drink.getPrice() ; }

    protected double getSidePrice(){
      return sides.stream().map(side -> side.getPrice()).reduce(0d,(total,price) -> total + price);
    }

    protected String getSideNames(){
      return sides.stream().map(side -> side.getName()).collect(Collectors.joining(", "));
    }

    public Burger getBurger(){
      return burger;
    }

    public ArrayList<Side> getSide(){
      return this.sides;
    }

    public Drink getDrink(){
      return drink;
    }

  }