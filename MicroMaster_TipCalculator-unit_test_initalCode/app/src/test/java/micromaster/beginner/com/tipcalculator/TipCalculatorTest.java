package micromaster.beginner.com.tipcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Byron on 2/14/2017.
 */
public class TipCalculatorTest {

    private TipCalculator tipCalculator;

    @Before
    public void setUp() throws Exception {
        tipCalculator = new TipCalculator();
    }

    @Test
    public void calculateTip_15() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.15;
        String totalExpected = "115.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        //expected: 100 + (100*15%) = 115.0
        assertEquals(totalExpected, totalAmount);
    }

}