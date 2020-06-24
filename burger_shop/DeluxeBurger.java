package burger_shop;

public class DeluxeBurger extends Burger {

  private String deluxeToppingName3;
  private double deluxeToppingPrice3;

  private String deluxeToppingName4;
  private double deluxeToppingPrice4;

  private String deluxeToppingName5;
  private double deluxeToppingPrice5;

  private String deluxeToppingName6;
  private double deluxeToppingPrice6;

  public void addDeluxeTopping3(String name, double price) {  //EXTRA 4 TOPPINGS ALLOWED FOR DELUXE BURGER TO MAKE 6 TOTAL
    this.deluxeToppingName3 = name;
    this.deluxeToppingPrice3 = price;

  }

  public void addDeluxeTopping4(String name, double price) { //EXTRA 4 TOPPINGS ALLOWED FOR DELUXE BURGER TO MAKE 6 TOTAL
    this.deluxeToppingName4 = name;
    this.deluxeToppingPrice4 = price;

  }

  public void addDeluxeTopping5(String name, double price) {  //EXTRA 4 TOPPINGS ALLOWED FOR DELUXE BURGER TO MAKE 6 TOTAL
    this.deluxeToppingName5 = name;
    this.deluxeToppingPrice5 = price;

  }

  public void addDeluxeTopping6(String name, double price) { //EXTRA 4 TOPPINGS ALLOWED FOR DELUXE BURGER TO MAKE 6 TOTAL
    this.deluxeToppingName6 = name;
    this.deluxeToppingPrice6 = price;

  }


  @Override
  public void addSoda(String name, String size, double price) {
    System.out.println("Cannot add additional drinks for the Deluxe Burger");
  }

  @Override
  public void addFries(String size, double price) {
    System.out.println("Cannot add additional sides for the Deluxe Burger");
  }

  @Override
  public void addBacon(String name, double price) {
    System.out.println("Your Deluxe Burger already comes with bacon!");
  }

  @Override
  public double itemizedBurger() {
    double totalBurgerPrice = super.itemizedBurger();
    if(this.deluxeToppingName3 != null) {
      totalBurgerPrice += this.deluxeToppingPrice3;
      System.out.println("Added " + this.deluxeToppingName3 + " for an extra " + this.deluxeToppingPrice3);
    }

    if(this.deluxeToppingName4 != null) {
      totalBurgerPrice += this.deluxeToppingPrice4;
      System.out.println("Added " + this.deluxeToppingName4 + " for an extra " + this.deluxeToppingPrice4);
    }
    if(this.deluxeToppingName5 != null) {
      totalBurgerPrice += this.deluxeToppingPrice5;
      System.out.println("Added " + this.deluxeToppingName5 + " for an extra " + this.deluxeToppingPrice5);
    }

    if(this.deluxeToppingName4 != null) {
      totalBurgerPrice += this.deluxeToppingPrice6;
      System.out.println("Added " + this.deluxeToppingName6 + " for an extra " + this.deluxeToppingPrice6);
    }

    return totalBurgerPrice;
  }

  public DeluxeBurger() {
    super("Deluxe", "Kobe Beef", 14.50, "white");
    super.addFries("L", 0.00);
    super.addSoda("Dr. Pepper", "L", 0.00);
    super.addBacon("Applewood", 0.00);
  }
}
