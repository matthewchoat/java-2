package burger_shop;

import java.util.Scanner;

public class Side {
  private String sideName;
  private String sideSize;
  private double sidePrice;

  public Side(String sideName, String sideSize, double sidePrice){
    this.sideName = sideName;
    this.sideSize = sideSize;
    this.sidePrice = sidePrice;

  }

  public double sidePrice(){
    return sidePrice;
  }

  public String getSideName(){
    return  sideName;
  }

}