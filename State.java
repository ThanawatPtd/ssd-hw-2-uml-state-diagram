package src;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public interface State {
  void insertQuarter(GumballMachine gm);
  void ejectQuarter(GumballMachine gm);
  void turnCrank(GumballMachine gm);
  void dispense(GumballMachine gm);
}
