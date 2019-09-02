package ee.itcollage.level3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsoluteNumberTest {

    @Test
    public void makeAbsolute() {
        assertEquals(1, AbsoluteNumber.makeAbsolute(1));
        assertEquals(1, AbsoluteNumber.makeAbsolute(-1));
    }
}