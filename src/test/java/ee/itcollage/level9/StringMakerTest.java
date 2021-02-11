package ee.itcollage.level9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringMakerTest {

    @Test
    public void xStrings() {
        assertEquals("", StringMaker.make(":)", 0));
        assertEquals("", StringMaker.make(":P", -5));

        assertEquals("---", StringMaker.make("-", 3));
        assertEquals("------", StringMaker.make("--", 3));
        assertEquals(":D:D", StringMaker.make(":D", 2));

        assertEquals("            ", StringMaker.make(" ", 12));
    }

    @Test
    public void xyStrings() {
        assertEquals("", StringMaker.make("-", 0, "x", 0));
        assertEquals("--", StringMaker.make("-", 2, "x", 0));
        assertEquals("--", StringMaker.make("-", 2, "x", -2));
        assertEquals("xx", StringMaker.make("-", 0, "x", 2));
        assertEquals("xx", StringMaker.make("-", -2, "x", 2));
        assertEquals("--xx", StringMaker.make("-", 2, "x", 2));
        assertEquals(":P:P:):)", StringMaker.make(":P", 2, ":)", 2));
    }
}
