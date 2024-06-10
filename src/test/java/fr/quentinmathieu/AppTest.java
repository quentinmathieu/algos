package fr.quentinmathieu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void calcSumNumbersTest()
    {
        assertEquals(App.calcSumNumbers(14), 5);
        assertEquals(App.calcSumNumbers(18), 9);
        assertEquals(App.calcSumNumbers(12), 3);
    }


    @Test
    public void checkCardNumberIsLuhn()
    {
        assertEquals(App.checkCardNumber(4263982640269299L
        ), true);
        assertEquals(App.checkCardNumber(4539319503436467L), true);


        assertEquals(App.checkCardNumber(4223982640269299L), false);
        assertEquals(App.checkCardNumber(4539319503436476L), false);
        assertEquals(App.checkCardNumber(8273123273520569L), false);
    }
}
