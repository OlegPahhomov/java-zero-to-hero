package ee.itcollage.level5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveTest {

    @Test
    void positiveTest() {
        assertEquals(new ArrayList<>(), Positives.analyze(new ArrayList<>()));
        assertEquals(List.of(1, 2, 3), Positives.analyze(List.of(1, 2, 3)));
        assertEquals(List.of(1), Positives.analyze(List.of(-1, 0, 1)));
        assertEquals(new ArrayList<>(), Positives.analyze(List.of(-1, -2, -3)));
    }
}
