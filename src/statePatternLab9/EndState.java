package statePatternLab9;

public class EndState implements State{
    VendingMachine vendingMachine;

    public EndState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void addCoin(int amount) {
        System.err.println("Invalid State");
    }

    @Override
    public void chooseTerminus(String state) {
        System.err.println("Invalid State");
    }

    @Override
    public void getTicket() {
        vendingMachine.setCurrentState(vendingMachine.getReadyState());
        System.out.println("Please receive your ticket. I hope you enjoy your trip.");

    }
}
