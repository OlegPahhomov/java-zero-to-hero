package ee.itcollage.level3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteNumberTest {

    @Test
    public void absolute_makes_nr_absolute() {
        assertEquals(1, AbsoluteNumber.makeAbsolute(1));
        assertEquals(0, AbsoluteNumber.makeAbsolute(0));
        assertEquals(1, AbsoluteNumber.makeAbsolute(-1));
    }
}
