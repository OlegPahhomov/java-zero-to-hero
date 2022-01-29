package ee.itcollage.level14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MasterOfStreams {

    private static final List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static List<Integer> convertMe() {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 1) {
                result.add(num * 2);
            }
        }
        return result;
    }

    //TODO convert method convertMe using streams
    public static List<Integer> converted() {
        return null;
    }

    //TODO create map using stream, where words would be grouped up by their length
    public static Map<Integer, List<String>> mapWordsByLength(List<String> words)  {
        return null;
    }
}
