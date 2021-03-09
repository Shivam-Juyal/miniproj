import org.junit.Test;

import static org.junit.Assert.*;

public class TestCases {

    @Test
    public void testSquareRoot()
    {
        assertEquals(4.0,Calculator.findSquareRoot(16.0),0.001);
        assertEquals(9,Calculator.findSquareRoot(81.0),0.001);

        assertEquals(6,Calculator.findFactorial(3));
        assertEquals(120,Calculator.findFactorial(5));

        assertEquals(1,Calculator.findPower(2,0),0.001);
        assertEquals(1024,Calculator.findPower(2,10),0.001);

        assertEquals(2.3025,Calculator.findNaturalLog(10),0.001);
        assertEquals(4.6051,Calculator.findNaturalLog(100),0.001);

    }

}
