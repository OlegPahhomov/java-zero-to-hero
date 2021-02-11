package ee.itcollage.level5;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SumOfNumbersTest {

    @Test
    public void sum() {
        assertNull(SumOfNumbers.sum(new ArrayList<>()));
        assertEquals(6, (int) SumOfNumbers.sum(List.of(1, 2, 3)));
        assertEquals(15, (int) SumOfNumbers.sum(List.of(5, 5, 5)));
    }
}
