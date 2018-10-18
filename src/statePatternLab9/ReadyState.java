package statePatternLab9;

import java.util.Map;
import java.util.TreeMap;

public class ReadyState implements State{
    VendingMachine vendingMachine;
    Map<String, Integer> destinationPriceMap = new TreeMap<>();

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationPriceMap.put("Ari", 200);
        destinationPriceMap.put("Phaya Thai", 100);
        destinationPriceMap.put("Siam", 300);
    }

    @Override
    public void addCoin(int amount) {
        System.err.println("Invalid State.");
    }

    @Override
    public void chooseTerminus(String station) {
        int prices;
        if (destinationPriceMap.containsKey(station))
            System.err.println("Invalid terminus station.");
        else {
            prices = destinationPriceMap.get(station);
            vendingMachine.setCurrentState(vendingMachine.getExpendingState());
            System.out.println("Select " + station + ", " + prices + " bahts.");
        }

    }

    @Override
    public void getTicket() {
        System.err.println("Invalid State.");
    }
}
