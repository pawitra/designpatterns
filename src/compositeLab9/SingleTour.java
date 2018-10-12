package compositeLab9;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
    }

    public void reservedSeats(int num){
        if (num > 0) reservedSeats += num;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAvailableSeats() {
        return this.allSeats - this.reservedSeats;
    }
}
