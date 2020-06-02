package leapYear;

import org.junit.Assert;
import org.junit.Test;


public class leapYearTest {

    
    
    @Test
    public final void checkIfItsAMultipleOf4(){
        Assert.assertTrue(leapYear.multipleFour(1996));
    }

    @Test
    public final void checkIfItsAMultipleOf400(){
        Assert.assertTrue(leapYear.multipleFourhundred(2000));
    }

    @Test
    public final void checkIfItsAMultipleOf100(){
        Assert.assertTrue(leapYear.multipleOnehundred(1400));
    }

    @Test
    public final void checkIfItsLeapYear(){
        Assert.assertTrue(leapYear.isLeapYear(2000));
    }

}