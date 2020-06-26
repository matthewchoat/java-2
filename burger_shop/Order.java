package burger_shop;

import java.awt.*;
import java.util.Scanner;

public class Order {
    
    //NOTE 1st Order contructors requirement for exercise 2 moved to 'OrderMenu.java' class since my properties will be defined by the menu and accept user input.

    public static double dailyIncome = 0d;
    public static void main(String[] args) {

        while(purchaseOrder());
        System.out.println("Today's total gross was $" + dailyIncome);
        System.out.println("Bryan's Burgers is now closed, POS system going offline...");
    }

    //addToppings() method for exercise 2 moved to 'Burger.java' class. Method prompts to remove or add each topping, topping amounts are variable based on the type of burger (plain, health, deluxe).

    private static boolean addItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'y' to continue or press any key to end.");
        char ch = scanner.next().charAt(0);
        if (ch == 'y'||ch =='Y') {
            return true;
        }
        return false;
    }

    private static String addBurger(OrderMenu menu){ //addBurger method for exercise 2 that adds a specific burger from my OrderMenu class based on user input.
        String burgerName = "";
        Scanner scanner = new Scanner(System.in);
        OrderMenu.printMenu();
        System.out.println("Please enter the name of the menu item you want to add : " );
        burgerName = scanner.nextLine();

        if(menu.inMenu(burgerName)){
            return burgerName;
        }
        System.out.println("Invalid selection, please enter another menu item.");
        return addBurger(menu);
    }

    private static boolean purchaseOrder(){ // purchaseOrder method for exercise 2. Also includes output for interface tasks.
        double totalOrderPrice = 0d;
        OrderMenu bryansMenu = new OrderMenu();
        System.out.println("************ Welcome to Bryan's Burgers ************** ");
        do{
            totalOrderPrice += bryansMenu.orderFromMenu(addBurger(bryansMenu), howMany());
            System.out.println("Do you want to add another item ? ");
        }while (addItem());
        System.out.println("Your total comes to $" + totalOrderPrice);
        dailyIncome+=totalOrderPrice;
        System.out.println("Order complete, please come again!");
        System.out.println("Continue taking orders ? ");
        return addItem();
    }

    private static int howMany(){
        Scanner scanner = new Scanner(System.in);
        int quantity=0;
        System.out.println("How many would you like ? ");
        if(scanner.hasNextInt()){
            quantity=scanner.nextInt();
            return quantity;
        }else{
            System.out.println("Invalid input, only whole numbers are accepted \nplease try again");

            return howMany();
        }
    }


}