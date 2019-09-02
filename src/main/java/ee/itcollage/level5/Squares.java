package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Squares {

    //todo fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 => 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers) {
        List<Integer> square = new ArrayList<>();
        for (Integer integer : integers) {
            square.add(integer * integer);
        }
        return square;
    }
}
