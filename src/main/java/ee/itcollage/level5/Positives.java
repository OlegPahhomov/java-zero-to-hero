package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Positives {

    //todo fix tests

    /**
     * returns only positives. zero is not positive
     * For example:
     * 1, -2, -3 => 1
     */
    public static List<Integer> analyze(List<Integer> integers) {
        List<Integer> positives = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer > 0) {
                positives.add(integer);
            }
        }
        return positives;
    }
}
