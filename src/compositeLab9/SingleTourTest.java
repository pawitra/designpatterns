package compositeLab9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleTourTest {
    SingleTour singleTour;
    @BeforeEach
    public void init(){
        singleTour = new SingleTour("Inging",100,10);
    }

    @Test
    void reserveOverZeroTest(){
        singleTour.reservedSeats(2);
        assertEquals(8,singleTour.getAvailableSeats());
    }

    @Test
    void reserveLowerZeroOrZero(){
        singleTour.reservedSeats(-1);
        assertEquals(10,singleTour.getAvailableSeats());
    }

    @Test
    void getPriceTest(){
        assertEquals(100,singleTour.getPrice());
    }

}