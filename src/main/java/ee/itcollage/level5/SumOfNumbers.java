package ee.itcollage.level5;

import java.util.List;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;

public class SumOfNumbers {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (isEmpty(integerList)) return null;
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }

}
