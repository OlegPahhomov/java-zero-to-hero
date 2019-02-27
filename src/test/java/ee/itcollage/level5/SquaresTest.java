package ee.itcollage.level5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SquaresTest {

    @Test
    public void squareTest() {
        assertEquals(new ArrayList<>(), Squares.square(new ArrayList<Integer>()));
        assertEquals(Arrays.asList(1, 1, 0), Squares.square(Arrays.asList(1, 1, 0)));
        assertEquals(Arrays.asList(1, 4, 9), Squares.square(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(1, 4, 9), Squares.square(Arrays.asList(-1, -2, -3)));
    }
}