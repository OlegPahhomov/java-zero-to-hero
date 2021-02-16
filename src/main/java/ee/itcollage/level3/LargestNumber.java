package ee.itcollage.level3;

import java.util.stream.IntStream;

public class LargestNumber {

    //todo make tests work

    public static int pickLargest(int x1, int x2) {
        return Math.max(x1, x2);
    }

    public static int pickLargest(int x1, int x2, int x3) {
//        return IntStream.of(x1, x2, x3).max().getAsInt();
        return Math.max(Math.max(x1, x2), x3);
    }
}
