package burger_shop;

public class HealthBurger extends Burger {
  private String healthToppingName3;
  private double healthToppingPrice3;

  private String healthToppingName4;
  private double healthToppingPrice4;

  public void addHealthTopping3(String name, double price) {  //EXTRA 2 TOPPINGS ALLOWED FOR HEALTH BURGER TO MAKE 4 TOTAL
    this.healthToppingName3 = name;
    this.healthToppingPrice3 = price;

  }

  public void addHealthTopping4(String name, double price) { //EXTRA 2 TOPPINGS ALLOWED FOR HEALTH BURGER TO MAKE 4 TOTAL
    this.healthToppingName4 = name;
    this.healthToppingPrice4 = price;

  }

  @Override
  public void addSoda(String name, String size, double price) {
    System.out.println("Cannot add a soda to the Health Burger. Have some water instead!");
  }

  @Override
  public void addFries(String size, double price) {
    System.out.println("Cannot add fries to the Health Burger. Maybe try some carrot sticks?");
  }

  @Override
  public void addBacon(String name, double price) {
    System.out.println("Bacon on a Health Burger? Nope, try again!");
  }

  @Override
  public void addCheese(String name, double price) {
    System.out.println("Cheese on a Health Burger? Nope, try again!");
  }



  @Override
  public double itemizedBurger() {
    double totalBurgerPrice = super.itemizedBurger();
    if(this.healthToppingName3 != null) {
      totalBurgerPrice += this.healthToppingPrice3;
      System.out.println("Added " + this.healthToppingName3 + " for an extra " + this.healthToppingPrice3);
    }

    if(this.healthToppingName4 != null) {
      totalBurgerPrice += this.healthToppingPrice4;
      System.out.println("Added " + this.healthToppingName4 + " for an extra " + this.healthToppingPrice4);
    }
    return totalBurgerPrice;
  }

  public HealthBurger(String meat, double price) {
    super("Health", meat, price, "Brown Rye");
  }
}

