package statePatternLab9;

public class expendingState implements State{
    VendingMachine vendingMachine;

    public expendingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void addCoin(int amount) {
        int curAmount = vendingMachine.getAmount() + amount;
        if (curAmount < vendingMachine.getPrices()) {
            System.out.println("Need more " + (vendingMachine.getPrices() - curAmount) + " bahts.");
        } else
            if (curAmount > vendingMachine.getPrices())
                System.out.println("Here your " + (curAmount - vendingMachine.getPrices())+ " baht changes.");
            System.out.println("Please receive your ticket.");
            vendingMachine.setCurrentState(vendingMachine.getEndState());
            vendingMachine.setPrices(0);
            vendingMachine.setAmount(0);
    }

    @Override
    public void chooseTerminus(String station) {
        System.err.println("Invalid State.");
    }

    @Override
    public void getTicket() {
        System.err.println("Invalid State.");
    }
}
