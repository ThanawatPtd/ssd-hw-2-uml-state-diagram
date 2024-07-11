package src;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Main {
    public static void main(String[] args) {
        int inventory = 5;
        GumballMachine gumballMachine = new GumballMachine(inventory);

        gumballMachine.startMessage();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispenseGumball();

        gumballMachine.startMessage();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        gumballMachine.startMessage();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispenseGumball();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispenseGumball();
        gumballMachine.turnCrank();

        gumballMachine.startMessage();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispenseGumball();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispenseGumball();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.startMessage();
    }
}
