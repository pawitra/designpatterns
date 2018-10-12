package compositeLab9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {
    PackageTour packageTour;

    @BeforeEach
    public void init(){
        packageTour = new PackageTour("Inging Group");
        packageTour.addTour(new SingleTour("A",200,20));//180
        packageTour.addTour(new SingleTour("B",100,10));//90
        packageTour.addTour(new SingleTour("C",300,30));//270
    }

    @Test
    void getAvailableSeatsTest(){
        assertEquals(10,packageTour.getAvailableSeats());
    }

    @Test
    void getPriceTest(){
        assertEquals(540,packageTour.getPrice());
    }


}