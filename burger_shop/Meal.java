package burger_shop;

import java.awt.*;
import java.util.Scanner;

public class Meal {
    private Burger Burger;
    private Side Side;
    private Drink Drink;
    private Boolean cheese, mayo;
    public Meal(String name,String bread,String meat, Double burgerPrice, String sideName, String sideSize, Double sidePrice, String drinkName, String drinkSize, Double drinkPrice) {
      Burger = new Burger(name, bread, meat, burgerPrice); //establishing a "has a" relationship with Burger.
      Side = new Side(sideName, sideSize, sidePrice); //establish a "has a" relationship with Side.
      Drink = new Drink(drinkName, drinkSize, drinkPrice); //establish a "has a" relationship with Drink.
      this.cheese = false;
      this.mayo = false;
    }

    public void addMayo(){
      mayo = true;
    }
    public void addCheese(){
      cheese = true;
    }

    public void removeMayo(){
      mayo = false;
    }
    public void removeCheese(){
      cheese = false;
    }

    public double burgerPrice(){
      return Burger.burgerPrice() + Side.sidePrice() + Drink.getDrinkPrice() + ((cheese?1:0) * .5d) + ((mayo?1:0) * .25d);
    }

    public Burger getBurger(){
      return Burger;
    }

    public String getName(){
      return  Burger.getName();
    }

    public Side getSide(){
      return Side;
    }

    public Drink getDrink(){
      return Drink;
    }

  protected boolean addToppings(String toppings){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to add " + toppings + "?");
    System.out.println("Enter 'y' to add " + toppings + ", press any other key to not add.");
    char ch = scanner.next().charAt(0);
    if (ch == 'y'||ch =='Y') {
      return true;
    }
    return false;
  }

    public void variableToppings(){
      if(addToppings("Cheese")){addCheese();}else removeCheese();

      if (addToppings("Mayo"))addMayo(); else removeMayo();

    }
  }