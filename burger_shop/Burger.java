package burger_shop;

import java.util.Scanner;

public class Burger {
  private String name;
  private String bread,meat;
  private double burgerPrice;
  private boolean cheese,mayo;

  public Burger(String name,String bread,String meat,double burgerPrice){
    this.name = name;
    this.bread = bread;
    this.meat = meat;
    this.burgerPrice = burgerPrice;
    this.cheese = false; //ONLY TWO TOPPINGS ALLOWED FOR PLAIN BURGER CLASS
    this.mayo = false;   //ONLY TWO TOPPINGS ALLOWED FOR PLAIN BURGER CLASS
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

  public double burgerPrice(){ //calculating total burger price with toppings
    return burgerPrice + (cheese?1:0) * .5d + (mayo?1:0) * .25d;
  }

  public String getName(){
    return  name;
  }

  public void variableToppings(){
    if(addToppings("Cheese")){addCheese();}else removeCheese();

    if (addToppings("Mayo"))addMayo(); else removeMayo();

  }

  protected boolean addToppings(String toppings){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Would you like to add " + toppings + "?");
    System.out.println("Enter 'y' to add " + toppings + ", press any other key to not add.");
    char ch = scanner.next().charAt(0);
    if (ch == 'n'||ch =='N') {
      return false;
    }
    if (ch == 'y'||ch =='Y') {
      return true;
    }
    return false;
  }

}
