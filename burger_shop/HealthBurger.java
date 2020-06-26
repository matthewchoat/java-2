package burger_shop;

public class HealthBurger extends Burger {
  public boolean spinach,avocado, mushrooms, peppers;
  public HealthBurger(String name,String bread, String meat,double burgerPrice){
    super(name,bread,meat,burgerPrice);
    spinach = false; //ONLY FOUR TOPPINGS ALLOWED FOR HEALTHY BURGER CLASS
    avocado = false;   //ONLY FOUR TOPPINGS ALLOWED FOR HEALTHY BURGER CLASS
    mushrooms = false; //ONLY FOUR TOPPINGS ALLOWED FOR HEALTHY BURGER CLASS
    peppers = false;   //ONLY FOUR TOPPINGS ALLOWED FOR HEALTHY BURGER CLASS
  }
  public void addSpinach(){
    spinach = true;
  }
  public void addAvocado(){
    avocado = true;
  }
  public void addMushrooms(){
    mushrooms = true;
  }
  public void addPeppers(){
    peppers = true;
  }
  public void removeSpinach(){
    spinach = false;
  }
  public void removeAvocado(){
    avocado = false;
  }
  public void removeMushrooms(){
    mushrooms = false;
  }
  public void removePeppers(){
    peppers = false;
  }

  @Override
  public double burgerPrice(){
    return super.burgerPrice() + ((spinach?1d:0d) *.5d) + ((avocado?1d:0d) *1d) + ((mushrooms?1d:0d) *.75d) + ((peppers?1d:0d) *.60d);
  }


  public void variableToppings(){
    if(addToppings("Baby Spinach"))addSpinach();else removeSpinach();
    if(addToppings("Avocado slices"))addAvocado();else removeAvocado();
    if(addToppings("Portobello Mushrooms"))addMushrooms();else removeMushrooms();
    if(addToppings("Chopped Red & Green Peppers"))addPeppers();else removePeppers();
  }

}

