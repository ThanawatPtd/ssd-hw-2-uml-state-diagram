package src;

/**
 * WinnerState
 */
public class WinnerState implements State {
  @Override
  public void turnCrank(GumballMachine gm) {
    System.out.println("Turning twice doesn't get you another gumball!");

  }

  @Override
  public void dispense(GumballMachine gm) {
    System.out.println("You'RE A WINNER! You get two gumball for your quarter");
    gm.releaseBall();
    if (gm.getInventory() == 0) {
      gm.setState(new OutOfGumballsState());
    } else {
      gm.releaseBall();
      if (gm.getInventory() > 0) {
        gm.setState(new NoQuarterState());
      } else {
        System.out.println("Oops, out of gumballs!");
        gm.setState(new OutOfGumballsState());
      }

    }

  }

  @Override
  public void ejectQuarter(GumballMachine gm) {
    System.out.println("Sorry, you  already turned the crank");

  }

  @Override
  public void insertQuarter(GumballMachine gm) {
    System.out.println("Please wait, we're already giving you a gumball");
  }

}
