package src;

class HasQuarterState implements State {

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
        gm.setState(new SoldState());
    }

    @Override
    public void dispense(GumballMachine gm) {
        System.out.println("Please turn crank");
    }
}
