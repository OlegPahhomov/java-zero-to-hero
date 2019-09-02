package ee.itcollage.level9;

public class StringMaker {

    //todo fix tests
    /**
     * Gives you a text containing of x times of string c.
     * @param s the string to repeat
     * @param x how many times you want the string
     */
    public static String make(String s, int x) {
        String result = "";
        for (int i = 0; i < x; i++) {
            result += s;
        }
        return result;
    }

    /**
     * Gives you a text containing of x times of string c plus y times of string c.
     */
    public static String make(String s1, int x1, String s2, int x2) {
        return s1.repeat(Math.max(x1, 0)) + s2.repeat(Math.max(x2, 0));
    }
}
