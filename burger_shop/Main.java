package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Burger grassFedPlain = new Burger("Plain", "grass-fed beef", 6.56, "white");
        grassFedPlain.burgerAddTopping1("Tomato", 0.27);
        grassFedPlain.burgerAddTopping2("Lettuce", 0.75);
        System.out.println("The total price of your burger is $" + grassFedPlain.itemizedBurger());

        HealthBurger healthVeggie = new HealthBurger("Black Bean & Quinoa Patty", 7.75);
        healthVeggie.burgerAddTopping1("Tomato", 1.00);
        healthVeggie.burgerAddTopping2("Pickle", 1.85);
        healthVeggie.addHealthTopping3("Avocado", 0.27);
        healthVeggie.addHealthTopping4("Mushroom", 0.47);
        healthVeggie.addSoda("Coke", "L", 2.50); //should receive error
        healthVeggie.addCheese("American", 1.13); //should receive error
        healthVeggie.addBacon("Applewood", 2.00); //should receive error
        healthVeggie.addFries("L", 2.25); //should receive error
        System.out.println("The total price of your Health Burger is $" + healthVeggie.itemizedBurger());

        DeluxeBurger db = new DeluxeBurger();
        db.burgerAddTopping1("Pickle", 1.00); //CALLING ALL 6 ALLOWED TOPPINGS FOR DELUXE BURGER
        db.burgerAddTopping2("Tomato", 1.00); //CALLING ALL 6 ALLOWED TOPPINGS FOR DELUXE BURGER
        db.addDeluxeTopping3("Mustard", 0.00); //CALLING ALL 6 ALLOWED TOPPINGS FOR DELUXE BURGER
        db.addDeluxeTopping4("Relish", 0.50); //CALLING ALL 6 ALLOWED TOPPINGS FOR DELUXE BURGER
        db.addDeluxeTopping5("Onion", 0.60); //CALLING ALL 6 ALLOWED TOPPINGS FOR DELUXE BURGER
        db.addDeluxeTopping6("Lettuce", 0.27); //CALLING ALL 6 ALLOWED TOPPINGS FOR DELUXE BURGER
        db.addBacon("Smoked Maple", 2.00); //should receive error
        db.addFries("L", 2.25); //should receive error
        db.addCheese("Swiss", 2.25); //cheese is allowed to add to a Deluxe Burger.
        System.out.println("The total price of your Deluxe Burger is $" + db.itemizedBurger());
    }
}
