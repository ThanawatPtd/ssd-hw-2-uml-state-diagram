package src;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class NoQuarterState implements State{

    public void insertQuarter(GumballMachine gm) {
        System.out.println("You inserted a quarter.");
        gm.setState(new HasQuarterState());
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {
        System.out.println("No quarter exists.");
    }

    @Override
    public void turnCrank(GumballMachine gm) {
        System.out.println("You turned but there's no quarter");
        System.out.println();
    }

    @Override
    public void dispense(GumballMachine gm) {
        System.out.println("No quarter exists.");
    }
}
