//separating my menu functions and declarations from the Order class

package burger_shop;

import java.awt.*;

public class OrderMenu {
  private Burger plainBurger, chickenBurger;
  private DeluxeBurger bisonBurger;
  private HealthBurger blackBeanQuinoa;
  private Meal kobeBeefMeal, plainMeal;

  public OrderMenu() {
    this.plainBurger = new Burger("Plain Burger","white","grass-fed beef",6.99d);
    this.chickenBurger = new Burger("Chicken Burger","organic wheat","chicken",7.49d);
    this.bisonBurger = new DeluxeBurger("Bison Deluxe Burger","sourdough","bison",10.49d);
    this.blackBeanQuinoa = new HealthBurger("Healthy Black Bean Quinoa Burger", "Gluten-free Rice Bun","black bean & quinoa",7.99d);
    this.plainMeal = new Meal("Plain Burger Combo Meal","white","grass-fed beef",6.49d,"French Fries", "Medium", 1.34d, "Iced Tea", "Medium", 2.00d);
    this.kobeBeefMeal = new Meal("Kobe Beef Combo Meal","parmesan","kobe beef",10.48d,"Sweet Potato Fries", "Medium", 1.79d, "Dr. Pepper", "Medium", 2.00d);
  }

  public double orderFromMenu(String burgerName,int quantity){
    if(!inMenu(burgerName.toLowerCase())){
      System.out.println("Menu item not found, try again. ");
      return 0;
    }
    double price = 0d;
    if(quantity <= 0)
      return 0;

    for(int i = 1;i<=quantity;i++){
      System.out.println("Processing item number "+ i);
      price += makeBurger(burgerName);
    }
    return price;
  }

  private double makeBurger(String burgerName){
    burgerName = burgerName.toLowerCase();

    if(burgerName.equals(plainBurger.getName().toLowerCase())){
      System.out.println("Now preparing your " + plainBurger.getName() + "...");
      plainBurger.variableToppings();
      return plainBurger.burgerPrice();
    }
    if(burgerName.equals(chickenBurger.getName().toLowerCase())){
      System.out.println("Now preparing your "+ chickenBurger.getName() + "...");
      chickenBurger.variableToppings();
      return chickenBurger.burgerPrice();
    }
    if(burgerName.equals( bisonBurger.getName().toLowerCase())){
      System.out.println("Now preparing your " + bisonBurger.getName() + "...");
      bisonBurger.variableToppings();
      return bisonBurger.burgerPrice();
    }
    if(burgerName.equals( blackBeanQuinoa.getName().toLowerCase())){
      System.out.println("Now preparing your "+ blackBeanQuinoa.getName() + "...");
      blackBeanQuinoa.variableToppings();
      return blackBeanQuinoa.burgerPrice();
    }
    if(burgerName.equals( plainMeal.getName().toLowerCase())) {
      System.out.println("Now preparing your " + plainMeal.getBurger().getName() + " with " + plainMeal.getSide().getSideName() + " and a " + plainMeal.getDrink().getDrinkSize() + " " + plainMeal.getDrink().getDrinkName() + "...");
      plainMeal.variableToppings();
      return plainMeal.burgerPrice();
    }
    else{
      System.out.println("Now preparing your " + kobeBeefMeal.getBurger().getName() + " with " + kobeBeefMeal.getSide().getSideName() + " and a " + kobeBeefMeal.getDrink().getDrinkSize() + " " + kobeBeefMeal.getDrink().getDrinkName() + "...");
      kobeBeefMeal.variableToppings();
      return  kobeBeefMeal.burgerPrice();

    }
  }
  public boolean inMenu(String burgerName){
    burgerName = burgerName.toLowerCase();
    return burgerName.equals(plainBurger.getName().toLowerCase())
        || burgerName.equals(chickenBurger.getName().toLowerCase())
        || burgerName.equals(bisonBurger.getName().toLowerCase())
        || burgerName.equals(blackBeanQuinoa.getName().toLowerCase())
        || burgerName.equals(plainMeal.getBurger().getName().toLowerCase())
        || burgerName.equals(kobeBeefMeal.getBurger().getName().toLowerCase());
  }

  public static void printMenu(){
    OrderMenu dispMenu = new OrderMenu();
    System.out.println("Enter the name of a menu item to order :");
    System.out.println("Burger Name  " + "\t||\t" +"base price" );

    //Plain burgers
    System.out.println( dispMenu.plainBurger.getName()+ "\t||\t" +dispMenu.plainBurger.burgerPrice() );
    System.out.println( dispMenu.chickenBurger.getName()+ "\t||\t" +dispMenu.chickenBurger.burgerPrice() );

    //Healthy burgers
    System.out.println( dispMenu.blackBeanQuinoa.getName() + "\t||\t" + dispMenu.blackBeanQuinoa.burgerPrice() );

    //Deluxe burgers
    System.out.println( dispMenu.bisonBurger.getName() + "\t||\t" + dispMenu.bisonBurger.burgerPrice() );

    //Combo meals
    System.out.println( dispMenu.plainMeal.getBurger().getName() + "\t||\t" + dispMenu.plainMeal.burgerPrice() );
    System.out.println( dispMenu.kobeBeefMeal.getBurger().getName() + "\t||\t" + dispMenu.kobeBeefMeal.burgerPrice() );

  }

}