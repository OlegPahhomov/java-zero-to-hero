package ee.itcollage.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumbestTest {

    @Test
    void pick_largest_of_2() {
        assertEquals(1, LargestNumber.pickLargest(1, 0));
        assertEquals(1, LargestNumber.pickLargest(0, 1));
    }

    @Test
    void pick_largest_of_3() {
        assertEquals(1, LargestNumber.pickLargest(1, 0, -1));
        assertEquals(1, LargestNumber.pickLargest(0, 1, -1));
    }
}
