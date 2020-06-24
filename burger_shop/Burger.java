package burger_shop;

public class Burger {
  private String name;
  private String meat;
  private double price;
  private String breadRollType;

  private String addToppingName1;
  private double addToppingPrice1;

  private String addToppingName2;
  private double addToppingPrice2;

  private String addCheeseName;
  private double addCheesePrice;

  private String addBaconName;
  private double addBaconPrice;

  private String addFriesSize;
  private double addFriesPrice;

  private String addSodaName;
  private String addSodaSize;
  private double addSodaPrice;

  public Burger(String name, String meat, double price, String breadRollType) {
    this.name = name;
    this.meat = meat;
    this.price = price;
    this.breadRollType = breadRollType;
  }

  public void burgerAddTopping1(String name, double price) { //ONLY 2 TOPICS ALLOWED FOR PLAIN BURGER
    this.addToppingName1 = name;
    this.addToppingPrice1 = price;

  }

  public void burgerAddTopping2(String name, double price) { //ONLY 2 TOPICS ALLOWED FOR PLAIN BURGER
    this.addToppingName2 = name;
    this.addToppingPrice2 = price;

  }

  public void addCheese(String name, double price) {
    this.addCheeseName = name;
    this.addCheesePrice = price;

  }

  public void addBacon(String name, double price) {
    this.addBaconName = name;
    this.addBaconPrice = price;

  }

  public void addFries(String size, double price) {
    this.addFriesSize = size;
    this.addFriesPrice = price;

  }

  public void addSoda(String name, String size, double price) {
    this.addSodaName = name;
    this.addSodaSize = size;
    this.addSodaPrice = price;

  }

  public double itemizedBurger() {
    double plainBurgerPrice = this.price;
    double totalBurgerPrice = plainBurgerPrice;

    System.out.println(this.name + " Burger" + " on a " + this.breadRollType + " roll " + "with " + this.meat + ": $" + plainBurgerPrice);
    if (this.addToppingName1 != null) {
      totalBurgerPrice += this.addToppingPrice1;
      System.out.println("Added " + this.addToppingName1 + " for an extra $" + this.addToppingPrice1);
    }

    if (this.addToppingName2 != null) {
      totalBurgerPrice += this.addToppingPrice2;
      System.out.println("Added " + this.addToppingName2 + " for an extra $" + this.addToppingPrice2);
    }

    if (this.addFriesSize != null) {
      totalBurgerPrice += this.addFriesPrice;
      System.out.println("Added a size " + this.addFriesSize + " fry for an extra $" + this.addFriesPrice);
    }

    if (this.addSodaName != null) {
      totalBurgerPrice += this.addSodaPrice;
      System.out.println("Added a size " + this.addSodaSize + " " + this.addSodaName + " for an extra $" + this.addSodaPrice);
    }

    if (this.addCheeseName != null) {
      totalBurgerPrice += this.addCheesePrice;
      System.out.println("Added " + this.addCheeseName + " cheese for an extra $" + this.addCheesePrice);
    }

    if (this.addBaconName != null) {
      totalBurgerPrice += this.addBaconPrice;
      System.out.println("Added " + this.addBaconName + " bacon for an extra $" + this.addBaconPrice);
    }

    return totalBurgerPrice;
  }
}
