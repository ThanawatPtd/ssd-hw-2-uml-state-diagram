package src;

import java.util.Random;

/**
 * Thanawat Potidet
 * 6510450445
 */
class HasQuarterState implements State {
  Random randomWinner = new Random(System.currentTimeMillis());

  @Override
  public void insertQuarter(GumballMachine gm) {
    System.out.println("You can't insert another quarter");
  }

  @Override
  public void ejectQuarter(GumballMachine gm) {
    System.out.println("Quarter returned.");
    gm.setState(new NoQuarterState());
  }

  @Override
  public void turnCrank(GumballMachine gm) {
    System.out.println("You turned...");
    int winner = randomWinner.nextInt(10);
    if ((winner == 0) && (gm.getInventory() > 1)) {
      gm.setState(new WinnerState());
    } else {
      gm.setState(new SoldState());
    }
  }

  @Override
  public void dispense(GumballMachine gm) {
    System.out.println("Please turn crank");
  }
}
