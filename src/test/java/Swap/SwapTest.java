package Swap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest {
    @Test
    public void testSwap() throws Exception {
        Double [] result = Swap.swap(1,2,1.5, 2.0,3.0);
        Double [] expected = {1.5, 3.0, 2.0};
        Assert.assertArrayEquals(expected, result);
    }
}