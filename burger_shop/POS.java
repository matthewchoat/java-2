package burger_shop;

//Moved all Input/Output UI to POS class

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class POS {
  private static double dailyIncome = 0d;

  public static void main(String[] args) {

    while (purchaseOrder()) ;
    System.out.println("Today's total gross was $" + dailyIncome);
    System.out.println("Bryan's Burgers is now closed, POS system going offline...");
  }

  private static boolean continueOrder() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 'y' to continue or press any key to end.");
    char ch = scanner.next().charAt(0);
    if (ch == 'y' || ch == 'Y') {
      return true;
    }
    return false;
  }

  private static String addItemOrder(OrderMenu menu) { //addItemOrder method for exercise 2 that adds a specific burger from my OrderMenu class based on user input.
    String burgerName = "";
    Scanner scanner = new Scanner(System.in);

    burgerName = scanner.nextLine();

    if (menu.inMenu(burgerName)) {
      return burgerName;
    }
    System.out.println("Invalid selection, please enter another menu item.");
    return addItemOrder(menu);
  }

  private static boolean purchaseOrder() { // purchaseOrder method for exercise 2. Also includes output for interface tasks.
    Order order = new Order();
    OrderMenu bryansMenu = new OrderMenu();

    while (true) {

      System.out.println("************ Welcome to Bryan's Burgers ************** ");
      do {
        ArrayList<String> menuArray = bryansMenu.printMenu();
        menuArray.stream().forEach(menuItem -> System.out.println(menuItem));

        orderFromMenu(addItemOrder(bryansMenu), howMany(), bryansMenu, order);

        System.out.println("Do you want to add another item ? ");
      } while (continueOrder());
      order.getLineItems().stream().forEach(lineItems -> System.out.println(lineItems));
      System.out.println("Your total comes to $" + order.getTotal());
      dailyIncome += order.getTotal();
      System.out.println("Order complete, please come again!");
      System.out.println("Continue taking orders ? ");
      return continueOrder();
    }
  }

  private static int howMany() {
    Scanner scanner = new Scanner(System.in);
    int quantity = 0;
    System.out.println("How many would you like ? ");
    if (scanner.hasNextInt()) {
      quantity = scanner.nextInt();
      return quantity;
    } else {
      System.out.println("Invalid input, only whole numbers are accepted \nplease try again.");

      return howMany();
    }

  }

  private static int howMuch() {
    Scanner scanner = new Scanner(System.in);
    int quantity = 0;
    System.out.println("How much of this topping would you like?");
    System.out.println("'1' = Normal amount  '2' = Double  '3' = Triple  '4' = Quad");
    if (scanner.hasNextInt()) {
      quantity = scanner.nextInt();
      System.out.println(quantity);
      return quantity;
    } else {
      System.out.println("Invalid input, only whole numbers between 1 and 4 are accepted \nplease try again.");

      return howMuch();
    }

  }

  protected static boolean getToppingsMenu(Burger burger, OrderMenu menu, int quantity) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      menu.printToppings().stream().forEach(menuItem -> System.out.println(menuItem));
      try {
        int integ = scanner.nextInt();
        if (integ >= 1 && integ <= 18) {
          Toppings topping = menu.inToppingsMenu(String.valueOf(integ));

          if (null != topping) {
            System.out.println("Processing burger topping: " + topping.getToppingName() + " ...");

            try {
              burger.addToppings(topping);
              quantity = howMuch();
              if (quantity <= 0)
                return false;
              else {
                topping.setToppingAmount(quantity);
                System.out.println("Added " + quantity + " " + topping.getToppingName() + " to your burger!");
              }
              topping = null;
            } catch (Exception e) {
              System.out.println(e.toString());
            }
          }
        }
      } catch (InputMismatchException ex) {
        return false;
      }
    }
  }
  public static double orderFromMenu (String itemName,int quantity, OrderMenu menu, Order order){
      if (!menu.inMenu(itemName.toLowerCase())) {
        System.out.println("Menu item not found, try again. ");
        return 0;
      }
      if (quantity <= 0)
        return 0;

      for (int i = 1; i <= quantity; i++) {
        System.out.println("Processing item number " + i);
        MenuItem burger = menu.makeMenuItem(itemName);

        order.addItem(burger);
        if (burger instanceof Burger) {
          getToppingsMenu((Burger) burger, menu, quantity);
        }
        else if (burger instanceof Meal) {
          getToppingsMenu(((Meal)burger).getBurger(), menu, quantity);
        }
      }
      return order.getTotal();
    }
  }
