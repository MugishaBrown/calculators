import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTestOne {
    Calculation calculation = new Calculation();

    @Test
    public void twoPlusTwoEqualsFour() {
        assertEquals(4, calculation.add(2, 2));
    }

    @Test
    public void fourMinusfourEqualsZero() {
        assertEquals(0, calculation.substract(4, 4));
    }

    @Test
    public void tenPlustenEqualsTwenty() {
        assertEquals(20, calculation.add(10, 10));
    }

    @Test
    public void sevenDivideByThree() {
        assertEquals(3.5, calculation.division(8, 2), 1);
    }


}
