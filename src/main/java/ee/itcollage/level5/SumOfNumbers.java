package ee.itcollage.level5;

import java.util.List;

public class SumOfNumbers {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            //todo add gradle dependency for apache collectionutils and rewrite this condition with isNotEmpty
            return null;
        }
        return integerList.get(0);
    }

}
