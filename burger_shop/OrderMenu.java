//separating my menu functions and declarations from the Order class

package burger_shop;

import java.util.ArrayList;

public class OrderMenu {

  public OrderMenu() {}

  //MEALS
  private Meal getPlainMeal(){
    return
        new Meal(
            new Burger(),
            new Drink(),
            new Side());

  }
  private Meal getPlainMeal(Drink drink){
    return
        new Meal(
            new Burger(),
            drink,
            new Side());
  }

  private Meal getPlainMeal(Side side){
    return
        new Meal(
            new Burger(),
            new Drink(),
            side);
  }

  private Meal getPlainMeal(Side side, Drink drink){
    return
        new Meal(
            new Burger(),
            drink,
            side);
  }
  private Meal getHealthyMeal(){
    return
        new Meal(
            new HealthBurger(),
            getWater(),
            getSideSalad());
  }

  private Meal getHealthyMeal(Drink drink){
    return
        new Meal(
            new HealthBurger(),
            drink,
            new Side());
  }

  private Meal getHealthyMeal(Side side){
    return
        new Meal(
            new HealthBurger(),
            new Drink(),
            side);
  }

  private Meal getHealthyMeal(Side side, Drink drink){
    return
        new Meal(
            new HealthBurger(),
            drink,
            side);
  }

  private Meal getDeluxeMeal(){
    return
        new Meal(
            new DeluxeBurger(),
            new Drink(),
            new Side());
  }

  private Meal getDeluxeMeal(Drink drink){
    return
        new Meal(
            new DeluxeBurger(),
            drink,
            new Side());
  }

  private Meal getDeluxeMeal(Side side){
    return
        new Meal(
            new DeluxeBurger(),
            new Drink(),
            side);
  }

  private Meal getDeluxeMeal(Side side, Drink drink){
    return
        new Meal(
            new DeluxeBurger(),
            drink,
            side);
  }

  private Meal getDxMealExSides(){
    Meal dxMealExSide = getDeluxeMeal();
    try {
      dxMealExSide.addSide(getMixVeggie());
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      dxMealExSide.addSide(getSideSalad());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return dxMealExSide;
  }

  //PLAIN BURGERS - Default is plain Beef
  private Burger getPlainBurger(){
    return new Burger();
  }

  private Burger getChickenBurger(){
    Burger chickenBurger = getPlainBurger();
    chickenBurger.setName("Chicken Burger");
    chickenBurger.setMeat(new Meat("Grilled Chicken Breast"));
    chickenBurger.setPrice(7.51d);
        return chickenBurger;
  }

//DELUXE BURGERS - Default is Kobe Beef Deluxe
  private DeluxeBurger getDeluxeBurger(){
    return new DeluxeBurger();
  }

  private DeluxeBurger getBisonDeluxe(){
    DeluxeBurger bisonDeluxe = getDeluxeBurger();
    bisonDeluxe.setName("Deluxe Bison Burger");
    bisonDeluxe.setMeat(new Meat("100% Bison"));
    bisonDeluxe.setPrice(9.51d);
    return bisonDeluxe;
  }

  //HEALTHY BURGERS - Default HB is Organic Grass-fed Beef
  private HealthBurger getHealthBurger(){
    return new HealthBurger();
  }

  private HealthBurger getBlackBeanQuinoa(){
    HealthBurger blackBeanQuinoa = getHealthBurger();
    blackBeanQuinoa.setName("Black Bean Quinoa Burger");
    blackBeanQuinoa.setMeat(new Meat("Black Bean & Quinoa"));
    blackBeanQuinoa.setPrice(7.45d);
    return blackBeanQuinoa;
  }

  //SIDES - Default side is medium French Fries
  private Side getSide(){ return new Side(); }

  private Side getSweetPotatoFries() {
    Side sweetPotatoFries = getSide();
    sweetPotatoFries.setName("Sweet Potato Fries");
    sweetPotatoFries.setSize("Medium");
    sweetPotatoFries.setPrice(1.65d);
    return sweetPotatoFries;
  }

  private Side getSideSalad(){
    Side sideSalad = getSide();
    sideSalad.setName("Garden Side Salad");
    sideSalad.setSize("Small");
    sideSalad.setPrice(2.50d);
    return sideSalad;
  }

  private Side getGreenBeans(){
    Side greenBeans = getSide();
    greenBeans.setName("Steamed Green Beans");
    greenBeans.setSize("Medium");
    greenBeans.setPrice(2.45d);
    return greenBeans;
  }

  private Side getMixVeggie(){
    Side mixVeggie = getSide();
    mixVeggie.setName("Steamed Veggie Mix");
    mixVeggie.setSize("Medium");
    mixVeggie.setPrice(2.45d);
    return mixVeggie;
  }

  private Side getCarrotSticks(){
    Side carrotSticks = getSide();
    carrotSticks.setName("Fresh Carrot Sticks");
    carrotSticks.setSize("Small");
    carrotSticks.setPrice(.75d);
    return carrotSticks;
  }

  //DRINKS - Default drink is Medium Coke

  private Drink getDrink(){ return new Drink(); }

  private Drink getDrPepper(){
    Drink drPepper = getDrink();
    drPepper.setName("Dr. Pepper");
    drPepper.setSize("Medium");
    drPepper.setPrice(1.49d);
    return drPepper;
  }

  private Drink getIcedTea(){
    Drink icedTea = getDrink();
    icedTea.setName("Iced Tea");
    icedTea.setSize("Medium");
    icedTea.setPrice(1.39d);
    return icedTea;
  }

  private Drink getWater(){
    Drink water = getDrink();
    water.setName("Water");
    water.setSize("Small");
    water.setPrice(0.00d);
    return water;
  }

  //toppings

  private Burger addToppings(Burger burger, Toppings ... toppings) {
    for(Toppings t : toppings) {
      try{
      burger.addToppings(t);
      } catch(Exception e){System.out.println(e.getMessage());}
    }
    return burger;
  }

  private Burger addCondiments(Burger burger, ToppingsCondiments condiment){
    try{
    burger.addToppings(condiment);
    } catch(Exception e){System.out.println(e.getMessage());}
    return burger;
  }

  private Burger addCheese(Burger burger, ToppingsCheese cheese){
    try{
    burger.addToppings(cheese);
    } catch(Exception e){System.out.println(e.getMessage());}
    return burger;
  }

  private Burger addMeat(Burger burger, ToppingsMeat meat){
    try{
    burger.addToppings(meat);
    } catch(Exception e){System.out.println(e.getMessage());}
    return burger;
  }

  private Burger addVeggie(Burger burger, ToppingsVeggie veggie){
    try{
    burger.addToppings(veggie);
    } catch(Exception e){System.out.println(e.getMessage());}
    return burger;
  }


  //make burger - add menu item
  public MenuItem makeMenuItem(String itemName){
    itemName = itemName.toLowerCase();

    if(itemName.equals(getPlainBurger().getName().toLowerCase())){
      System.out.println("Now preparing your " + getPlainBurger().getName() + "...");
      return getPlainBurger();
    }

    if(itemName.equals(getChickenBurger().getName().toLowerCase())){
      System.out.println("Now preparing your "+ getChickenBurger().getName() + "...");
      return getChickenBurger();
    }

    if(itemName.equals( getDeluxeBurger().getName().toLowerCase())){
      System.out.println("Now preparing your " + getDeluxeBurger().getName() + "...");
      return getDeluxeBurger();
    }

    if(itemName.equals( getBisonDeluxe().getName().toLowerCase())){
      System.out.println("Now preparing your " + getBisonDeluxe().getName() + "...");
      return getBisonDeluxe();
    }

    if(itemName.equals( getHealthBurger().getName().toLowerCase())){
      System.out.println("Now preparing your "+ getHealthBurger().getName() + "...");
      return getHealthBurger();
    }

    if(itemName.equals( getBlackBeanQuinoa().getName().toLowerCase())){
      System.out.println("Now preparing your "+ getBlackBeanQuinoa().getName() + "...");
      return getBlackBeanQuinoa();
    }

    if(itemName.equals( getPlainMeal().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getPlainMeal().getName() + "...");
      return getPlainMeal();
    }
    if (itemName.equals( getHealthyMeal().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getHealthyMeal().getName() + "...");
      return  getHealthyMeal();

    }
    if (itemName.equals( getDxMealExSides().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getDxMealExSides().getName() + "...");
      return  getDxMealExSides();
    }

    if (itemName.equals( getSide().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getSide().getName() + "...");
      return  getSide();

    }
    if (itemName.equals( getSweetPotatoFries().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getSweetPotatoFries().getName() + "...");
      return  getSweetPotatoFries();

    }
    if (itemName.equals( getSideSalad().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getSideSalad().getName() + "...");
      return  getSideSalad();

    }
    if (itemName.equals( getGreenBeans().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getGreenBeans().getName() + "...");

      return  getGreenBeans();

    }
    if (itemName.equals( getMixVeggie().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getMixVeggie().getName() + "...");

      return  getMixVeggie();

    }
    if (itemName.equals( getCarrotSticks().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getCarrotSticks().getName() + "...");

      return  getCarrotSticks();

    }
    if (itemName.equals( getDrink().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getDrink().getName() + "...");

      return  getDrink();

    }
    if (itemName.equals( getDrPepper().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getDrPepper().getName() + "...");
      return  getDrPepper();

    }
    if (itemName.equals( getIcedTea().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getIcedTea().getName() + "...");
      return  getIcedTea();

    }
    if (itemName.equals( getWater().getName().toLowerCase())) {
      System.out.println("Now preparing your " + getWater().getName() + "...");
      return  getWater();

    }
    else {
        System.out.println("Now preparing your " + getHealthyMeal().getName() + "...");
        return  getHealthyMeal();

      }
    }

  public boolean inMenu(String itemName){
    itemName = itemName.toLowerCase();
    return itemName.equals(getPlainBurger().getName().toLowerCase())
        || itemName.equals(getChickenBurger().getName().toLowerCase())
        || itemName.equals(getDeluxeBurger().getName().toLowerCase())
        || itemName.equals(getBisonDeluxe().getName().toLowerCase())
        || itemName.equals(getHealthBurger().getName().toLowerCase())
        || itemName.equals(getBlackBeanQuinoa().getName().toLowerCase())
        || itemName.equals(getPlainMeal().getName().toLowerCase())
        || itemName.equals(getHealthyMeal().getName().toLowerCase())
        || itemName.equals(getDxMealExSides().getName().toLowerCase())
        || itemName.equals(getSide().getName().toLowerCase())
        || itemName.equals(getSweetPotatoFries().getName().toLowerCase())
        || itemName.equals(getSideSalad().getName().toLowerCase())
        || itemName.equals(getGreenBeans().getName().toLowerCase())
        || itemName.equals(getMixVeggie().getName().toLowerCase())
        || itemName.equals(getCarrotSticks().getName().toLowerCase())
        || itemName.equals(getDrink().getName().toLowerCase())
        || itemName.equals(getDrPepper().getName().toLowerCase())
        || itemName.equals(getIcedTea().getName().toLowerCase())
        || itemName.equals(getWater().getName().toLowerCase());
  }

  public Toppings inToppingsMenu(String toppingName){
    toppingName = toppingName.toLowerCase();
    switch(toppingName) {
      case "1":
        return
            new ToppingsCheese("American Cheese", 1, 0.34d);
      case "2":
        return
            new ToppingsCheese("Swiss Cheese", 1, 0.55d);
      case "3":
        return
            new ToppingsCheese("Provolone Cheese", 1, 0.45d);
      case "4":
        return
            new ToppingsCheese("Blue Cheese", 1, 0.65d);
      case "5":
        return
            new ToppingsMeat("Applewood Bacon", 1, 1.25d);
      case "6":
        return
            new ToppingsMeat("Canadian Bacon", 1, 1.00d);
      case "7":
        return
            new ToppingsMeat("Fried Egg", 1, 1.55d);
      case "8":
        return
            new ToppingsCondiments("Ketchup", 1, 0.00);
      case "9":
        return
            new ToppingsCondiments("Mustard", 1, 0.15d);
      case "10":
        return
            new ToppingsCondiments("Dijon", 1, 0.30d);
      case "11":
        return
            new ToppingsCondiments("Mayonnaise", 1, 0.35d);
      case "12":
        return
            new ToppingsCondiments("BBQ Sauce", 1, 0.50d);
      case "13":
        return
            new ToppingsVeggie("Spinach", 1, 0.55d);
      case "14":
        return
            new ToppingsVeggie("Lettuce", 1, 0.15d);
      case "15":
        return
            new ToppingsVeggie("Portobello Mushrooms", 1, 0.75d);
      case "16":
        return
            new ToppingsVeggie("Tomato", 1, 0.20d);
      case "17":
        return
            new ToppingsVeggie("Onion", 1, 0.20d);
      case "18":
        return
            new ToppingsVeggie("Jalepeno", 1, 0.45d);
    }
    return null;
  }

  public ArrayList<String> printMenu(){
    ArrayList<String> menu = new ArrayList<>();
    OrderMenu dispMenu = new OrderMenu();
    menu.add("Please browse our menu :");
    menu.add("Burger Name  " + "\t||\t" +"base price" );

    //Plain burgers
    menu.add("************** Plain Burgers **************" );
    menu.add( dispMenu.getPlainBurger().getName()+ "\t||\t" + dispMenu.getPlainBurger().getPrice() );
    menu.add( dispMenu.getChickenBurger().getName()+ "\t||\t" + dispMenu.getChickenBurger().getPrice() );

    //Healthy burgers
    menu.add("************* Healthy Burgers *************" );
    menu.add( dispMenu.getHealthBurger().getName() + "\t||\t" + dispMenu.getHealthBurger().getPrice() );
    menu.add( dispMenu.getBlackBeanQuinoa().getName() + "\t||\t" + dispMenu.getBlackBeanQuinoa().getPrice() );

    //Deluxe burgers
    menu.add("************* Deluxe Burgers **************" );
    menu.add( dispMenu.getDeluxeBurger().getName() + "\t||\t" + dispMenu.getDeluxeBurger().getPrice() );
    menu.add( dispMenu.getBisonDeluxe().getName() + "\t||\t" + dispMenu.getBisonDeluxe().getPrice() );

    //Combo meals
    menu.add("************** Combo Meals ***************" );
    menu.add( dispMenu.getPlainMeal().getName() + "\t||\t" + dispMenu.getPlainMeal().getPrice() );
    menu.add( dispMenu.getHealthyMeal().getName() + "\t||\t" + dispMenu.getHealthyMeal().getPrice() );
    menu.add( dispMenu.getDxMealExSides().getName() + "\t||\t" + dispMenu.getDxMealExSides().getPrice() );

    //Sides
    menu.add("****************** Sides *****************" );
    menu.add( dispMenu.getSide().getName() + "\t||\t" + dispMenu.getSide().getPrice() );
    menu.add( dispMenu.getSweetPotatoFries().getName() + "\t||\t" + dispMenu.getSweetPotatoFries().getPrice() );
    menu.add( dispMenu.getSideSalad().getName() + "\t||\t" + dispMenu.getSideSalad().getPrice() );
    menu.add( dispMenu.getGreenBeans().getName() + "\t||\t" + dispMenu.getGreenBeans().getPrice() );
    menu.add( dispMenu.getMixVeggie().getName() + "\t||\t" + dispMenu.getMixVeggie().getPrice() );
    menu.add( dispMenu.getCarrotSticks().getName() + "\t||\t" + dispMenu.getCarrotSticks().getPrice() );

    //Healthy burgers
    menu.add("***************** Drinks ****************" );
    menu.add( dispMenu.getDrink().getName() + "\t||\t" + dispMenu.getDrink().getSize() + "\t||\t" + dispMenu.getDrink().getPrice() );
    menu.add( dispMenu.getDrPepper().getName() + "\t||\t" + dispMenu.getDrPepper().getSize() + "\t||\t" + dispMenu.getDrPepper().getPrice() );
    menu.add( dispMenu.getIcedTea().getName() + "\t||\t" + dispMenu.getIcedTea().getSize() + "\t||\t" + dispMenu.getIcedTea().getPrice() );
    menu.add( dispMenu.getWater().getName() + "\t||\t" + dispMenu.getWater().getSize() + "\t||\t" + dispMenu.getWater().getPrice() );
    menu.add("*****************************************" );
    menu.add("Enter the name of a menu item to order :");
    return menu;
  }

  public ArrayList<String> printToppings(){
    ArrayList<String> toppingsMenu = new ArrayList<>();
    OrderMenu dispToppings = new OrderMenu();
    toppingsMenu.add("**********Available Toppings************");
    toppingsMenu.add("Topping Name  " + "\t||\t" +"base price" );

    //Cheeses
    toppingsMenu.add("************** CHEESES ****************" );
    toppingsMenu.add( "1 - American" + "\t||\t" + "$.34" );
    toppingsMenu.add( "2 - Swiss" + "\t||\t" + "$.55" );
    toppingsMenu.add( "3 - Provolone" + "\t||\t" + "$.45" );
    toppingsMenu.add( "4 - Blue" + "\t||\t" + "$.65" );

    //Meats
    toppingsMenu.add("*************** MEATS *****************" );
    toppingsMenu.add( "5 - Applewood Bacon" + "\t||\t" + "$1.25" );
    toppingsMenu.add( "6 - Canadian Bacon" + "\t||\t" + "$1.00" );
    toppingsMenu.add( "7 - Fried Egg" + "\t||\t" + "$1.55" );

    //Condiments
    toppingsMenu.add("************* CONDIMENTS **************" );
    toppingsMenu.add( "8 - Ketchup" + "\t||\t" + "$.00" );
    toppingsMenu.add( "9 - Mustard" + "\t||\t" + "$.15" );
    toppingsMenu.add( "10 - Dijon" + "\t||\t" + "$.30" );
    toppingsMenu.add( "11 - Mayonnaise" + "\t||\t" + "$.35" );
    toppingsMenu.add( "12 - BBQ Sauce" + "\t||\t" + "$.50" );

    //Veggies
    toppingsMenu.add("************** VEGGIES ****************" );
    toppingsMenu.add( "13 - Spinach" + "\t||\t" + "$.55" );
    toppingsMenu.add( "14 - Lettuce" + "\t||\t" + "$.15" );
    toppingsMenu.add( "15 - Portobello Mushrooms" + "\t||\t" + "$.75" );
    toppingsMenu.add( "16 - Tomato" + "\t||\t" + "$.20" );
    toppingsMenu.add( "17 - Onion" + "\t||\t" + "$.20" );
    toppingsMenu.add( "18 - Jalepenos" + "\t||\t" + "$.45" );
    toppingsMenu.add("************** ************** ****************" );
    toppingsMenu.add("Enter the number of a topping you want to add. Otherwise press any other key to continue :");


    return toppingsMenu;
  }

}