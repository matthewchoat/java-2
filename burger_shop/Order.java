package burger_shop;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class Order {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    //calculate total order price
    public double getTotal(){
        double price = 0d;
        for(MenuItem menuItem : menuItems){
            price += menuItem.getPrice();

        }
        return price;
    }

    public ArrayList<String> getLineItems(){
        ArrayList<String> lineItems = new ArrayList<>();
        for(MenuItem menuItem : menuItems){
           lineItems.add(menuItem.getName() + "  ||   $" + menuItem.getPrice());
        }
        return lineItems;
    }

}