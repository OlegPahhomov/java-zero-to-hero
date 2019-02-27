package ee.itcollage.level4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumOfNumbersTest {

    @Test
    public void sum() {
        assertNull(SumOfNumbers.sum(new ArrayList<Integer>()));
        assertEquals(6, (int) SumOfNumbers.sum(Arrays.asList(1, 2, 3)));
        assertEquals(15, (int) SumOfNumbers.sum(Arrays.asList(5, 5, 5)));
    }
}