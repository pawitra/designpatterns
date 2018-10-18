package statePatternLab9;

public class VendingMachine {
    private State readyState = new ReadyState(this);
    private State expendingState = new expendingState(this);
    private State EndState = new EndState(this);

    private int amount = 0;
    private int prices = 0;

    private State currentState = this.readyState;

    public State getReadyState() {
        return this.readyState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getExpendingState() {
        return this.expendingState;
    }

    public int getPrices() {
        return this.prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public State getEndState() {
        return this.EndState;
    }

}
