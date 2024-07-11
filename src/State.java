package src;

public interface State {
  void insertQuarter(GumballMachine gm);
  void ejectQuarter(GumballMachine gm);
  void turnCrank(GumballMachine gm);
  void dispense(GumballMachine gm);
}
