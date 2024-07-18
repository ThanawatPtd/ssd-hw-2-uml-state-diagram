package src;

/**
 * Thanawat Potidet
 * 6510450445
 */
public class Main {
  public static void main(String[] args) {
    int inventory = 5;
    GumballMachine gumballMachine = new GumballMachine(inventory);

//    System.out.println(gumballMachine);
    // gumballMachine.insertQuarter();
    // gumballMachine.turnCrank();

    // gumballMachine.startMessage();
    // gumballMachine.insertQuarter();
    // gumballMachine.ejectQuarter();
    // gumballMachine.turnCrank();

//    System.out.println(gumballMachine);
    // gumballMachine.insertQuarter();
    // gumballMachine.turnCrank();

    // gumballMachine.insertQuarter();
    // gumballMachine.turnCrank();
    // gumballMachine.turnCrank();

    // gumballMachine.startMessage();
    // gumballMachine.insertQuarter();
    // gumballMachine.insertQuarter();
    // gumballMachine.turnCrank();
    // gumballMachine.insertQuarter();
    // gumballMachine.turnCrank();
    // gumballMachine.insertQuarter();
    // gumballMachine.turnCrank();

//    System.out.println(gumballMachine);

    GumballMachine gMachine = new GumballMachine(5);

    System.out.println(gMachine);

    gMachine.insertQuarter();
    gMachine.turnCrank();

    System.out.println(gMachine);

    gMachine.insertQuarter();
    gMachine.turnCrank();
    gMachine.insertQuarter();
    gMachine.turnCrank();
  }
}
