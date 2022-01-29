package ee.itcollage.level5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquaresTest {

    @Test
    void squareTest() {
        assertEquals(new ArrayList<>(), Squares.square(new ArrayList<Integer>()));
        assertEquals(List.of(1, 1, 0), Squares.square(List.of(1, 1, 0)));
        assertEquals(List.of(1, 4, 9), Squares.square(List.of(1, 2, 3)));
        assertEquals(List.of(1, 4, 9), Squares.square(List.of(-1, -2, -3)));
    }
}
