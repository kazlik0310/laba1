import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComplex {

    @Test
    public void minus() {
        Complex testNum1 = new Complex(5,2);
        Complex testNum2 = new Complex(1, 1);
        Complex res = new Complex(0,0);
        res = testNum1.minus(testNum2);
        Complex expectedResult = new Complex(4,1);
        assertEquals(res.lengthSQ(), expectedResult.lengthSQ(), "Something get wrong, check method");
    }

    @Test
    public void plus() {
        Complex testNum1 = new Complex(5,2);
        Complex testNum2 = new Complex(1, 1);
        Complex res = new Complex(0,0);
        res = testNum1.plus(testNum2);
        Complex expectedResult = new Complex(6,3);
        assertEquals(res.lengthSQ(), expectedResult.lengthSQ(), "Something get wrong, check method");
    }

    @Test
    public void times() {
        Complex testNum1 = new Complex(5,2);
        Complex testNum2 = new Complex(1, 1);
        Complex res = new Complex(0,0);
        res = testNum1.times(testNum2);
        Complex expectedResult = new Complex(3,7);
        assertEquals(res.lengthSQ(), expectedResult.lengthSQ(), "Something get wrong, check method");
    }


}
