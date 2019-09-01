package ee.itcollage.level5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PositiveTest {

    @Test
    public void positiveTest() {
        assertEquals(new ArrayList<>(), Positives.analyze(new ArrayList<>()));
        assertEquals(Arrays.asList(1, 2, 3), Positives.analyze(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(1), Positives.analyze(Arrays.asList(-1, 0, 1)));
        assertEquals(new ArrayList<>(), Positives.analyze(Arrays.asList(-1, -2, -3)));
    }
}