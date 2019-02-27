package ee.itcollage.level3;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumbestTest {

    @Test
    public void pick_largest_of_2() {
        assertEquals(1, LargestNumbest.pickLargest(1, 0));
        assertEquals(1, LargestNumbest.pickLargest(0, 1));
    }

    @Test
    public void pick_largest_of_3() {
        assertEquals(1, LargestNumbest.pickLargest(1, 0, -1));
        assertEquals(1, LargestNumbest.pickLargest(0, 1, -1));
    }
}