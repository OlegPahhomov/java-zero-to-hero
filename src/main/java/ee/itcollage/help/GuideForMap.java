package ee.itcollage.help;

import java.util.HashMap;
import java.util.Map;

public class GuideForMap {

    public static void main(String[] args) {
        //creating
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Julius Caesar");
        map.put(2, "Octavian");
        map.put(3, "Mark Anthony");

        //iterate keys
        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }

        //iterate values
        for (String value : map.values()) {
            System.out.println(value);
        }

        //iterate entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //removing
        map.remove(1);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
