package src;
/**
 * Thanawat Potidet
 * 6510450445
 * */

public class GumballMachine {
  private int inventory;
  private State state;
  private String flavor;
  public GumballMachine(int inventory){
    this.inventory = inventory;
    this.state = new NoQuarterState();
    this.flavor = "";
  }

  public void insertQuarter(){
    this.state.insertQuarter(this);
  }
  public void ejectQuarter(){
    this.state.ejectQuarter(this);
  }
  public void turnCrank(){
    this.state.turnCrank(this);
    this.state.dispense(this);
  }
  public void dispenseGumball(){
    this.state.dispense(this);
  }

  public void choose(String flavor){
   this.flavor = flavor;
  }

  public String toString(){
    System.out.println();
    System.out.println("Mighty Gumball, Inc.");
    System.out.println("Java-enabled Standing Gumball Model #2004");
    int flag = this.inventory > 1 ? 1 : 0;
      switch(flag){
        case 0:
          System.out.println("Inventory : " + this.inventory + " gumball");
          System.out.println("Machine is sold out");
          return null;
        case 1:
          System.out.println("Inventory : " + this.inventory + " gumballs");
          break;
      }
    System.out.println("Machine is waiting for a quarter");
    return "";
  }

  private void decreaseInventory(){
    this.inventory -= 1;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void releaseBall() {
    System.out.printf("A %s gumball comes rolling out the slot...\n", flavor);
    if (inventory != 0) {
      setInventory(this.inventory - 1);
    }
  }

  private void setInventory(int inventory) {
    this.inventory = inventory;
  }

  public int getInventory() {
    return this.inventory;
  }

  public String getFlavor() {
    return flavor;
  }
}
