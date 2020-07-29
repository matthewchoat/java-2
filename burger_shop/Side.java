package burger_shop;

public class Side implements MenuItem{
  private String sideName = "French Fries";
  private String sideSize = "Medium";
  private double sidePrice = 1.49d;

  public Side(){ }

  public Side(String sideName, String sideSize, double sidePrice) {
    this.sideName = sideName;
    this.sideSize = sideSize;
    this.sidePrice = sidePrice;
  }

  public void setName(String sideName) { this.sideName = sideName; }
  public void setSize(String sideSize) { this.sideSize = sideSize; }
  public void setPrice(double sidePrice) { this.sidePrice = sidePrice; }

  public String getName(){
    return  sideName;
  }
  public String getSize() {
    return sideSize;
  }
  public double getPrice(){
    return sidePrice;
  }


}