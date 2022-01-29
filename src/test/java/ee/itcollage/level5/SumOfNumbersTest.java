package ee.itcollage.level5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SumOfNumbersTest {

    @Test
    void sum() {
        assertNull(SumOfNumbers.sum(new ArrayList<Integer>()));
        assertEquals(6, (int) SumOfNumbers.sum(List.of(1, 2, 3)));
        assertEquals(15, (int) SumOfNumbers.sum(List.of(5, 5, 5)));
    }
}
