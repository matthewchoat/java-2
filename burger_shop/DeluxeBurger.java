package burger_shop;

public class DeluxeBurger extends Burger {
  public boolean swissCheese,dijonMustard, mushrooms, peppers, bbqSauce, friedEgg;
  public DeluxeBurger(String name,String bread, String meat,double burgerPrice){
    super(name,bread,meat,burgerPrice);
    bbqSauce = false; //SIX TOPPINGS ALLOWED FOR DELUXE BURGER CLASS
    friedEgg = false;   //SIX TOPPINGS ALLOWED FOR DELUXE BURGER CLASS
    swissCheese = false;    //SIX TOPPINGS ALLOWED FOR DELUXE BURGER CLASS
    dijonMustard = false;   //SIX TOPPINGS ALLOWED FOR DELUXE BURGER CLASS
    mushrooms = false; //SIX TOPPINGS ALLOWED FOR DELUXE BURGER CLASS
    peppers = false;   //SIX TOPPINGS ALLOWED FOR DELUXE BURGER CLASS

  }
  public void addBbqSauce(){
    bbqSauce = true;
  }
  public void addFriedEgg(){
    friedEgg = true;
  }
  public void addSwissCheese(){
    swissCheese = true;
  }
  public void addDijonMustard(){
    dijonMustard = true;
  }
  public void addMushrooms(){
    mushrooms = true;
  }
  public void addPeppers(){
    peppers = true;
  }
  public void removeBbqSauce(){
    bbqSauce = false;
  }
  public void removeFriedEgg(){
    friedEgg = false;
  }
  public void removeSwissCheese(){
    swissCheese = false;
  }
  public void removeDijonMustard(){
    dijonMustard = false;
  }
  public void removeMushrooms(){
    mushrooms = false;
  }
  public void removePeppers(){
    peppers = false;
  }

  @Override
  public double burgerPrice(){
    return super.burgerPrice() + (((swissCheese?1d:0d) *.5d) + ((bbqSauce?1d:0d) *.25d) + ((dijonMustard?1d:0d) *1d) + ((mushrooms?1d:0d) *.75d) + ((peppers?1d:0d) *.60d)+ ((friedEgg?1d:0d) *1.5d));
  }


  public void variableToppings(){

    if(addToppings("Swiss Cheese"))addSwissCheese();else removeSwissCheese();
    if(addToppings("BBQ Sauce"))addBbqSauce();else removeBbqSauce();
    if(addToppings("Dijon Mustard"))addDijonMustard();else removeDijonMustard();
    if(addToppings("Portobello Mushrooms"))addMushrooms();else removeMushrooms();
    if(addToppings("Chopped Red & Green Peppers"))addPeppers();else removePeppers();
    if(addToppings("Fried Egg"))addFriedEgg();else removeFriedEgg();

  }

}

