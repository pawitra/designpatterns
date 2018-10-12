package compositeLab9;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<>();

    public PackageTour(String packageName) {
        this.packageName = packageName;
    }

    public void addTour(Tour t){
        tours.add(t);
    }
    @Override
    public String getName() {
        return this.packageName;
    }

    @Override
    public double getPrice() {
        double totalPrice=0;
        for (Tour t : tours)
            totalPrice += t.getPrice();
        return totalPrice*0.9;
    }

    @Override
    public int getAvailableSeats() {
        if (tours.isEmpty()) return 0;
        int minSeat = tours.get(0).getAvailableSeats();
        for (Tour t : tours)
            if (t.getAvailableSeats()<minSeat)
                minSeat=t.getAvailableSeats();
        return minSeat;
    }
}
