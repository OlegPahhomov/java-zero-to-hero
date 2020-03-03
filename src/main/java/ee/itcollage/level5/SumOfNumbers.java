package ee.itcollage.level5;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;
import static org.apache.commons.collections4.CollectionUtils.isNotEmpty;

public class SumOfNumbers {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (isEmpty(integerList)){
//        if (integerList == null || integerList.isEmpty()) {
            //todo add gradle dependency for apache collectionutils and rewrite this condition with isNotEmpty
            return null;
        }
        return integerList.get(0);
    }

}
