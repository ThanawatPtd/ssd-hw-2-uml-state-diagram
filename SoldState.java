package src;
/**
 * Thanawat Potidet
 * 6510450445
 * */
class SoldState implements State {

    @Override
    public void insertQuarter(GumballMachine gm) {
        System.out.println("Wait for gumball");
    }

    @Override
    public void ejectQuarter(GumballMachine gm) {
        System.out.println("Cannot eject gumball");
    }

    @Override
    public void turnCrank(GumballMachine gm) {
        System.out.println("You turned the crank");
    }

    @Override
    public void dispense(GumballMachine gm) {
        gm.releaseBall();
        if (gm.getInventory() > 0) {
            gm.setState(new NoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gm.setState(new OutOfGumballsState());
        }
    }
}