package src;

public class OutOfGumballsState implements State{

    @Override
    public void insertQuarter(GumballMachine gm) {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {

    }

    @Override
    public void turnCrank(GumballMachine gm) {
        System.out.println("You turned, but there are no gumballs");
        System.out.println();
    }

    @Override
    public void dispense(GumballMachine gm) {

    }
}
