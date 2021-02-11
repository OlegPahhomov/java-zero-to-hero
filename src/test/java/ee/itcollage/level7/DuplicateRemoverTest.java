package ee.itcollage.level7;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DuplicateRemoverTest {

    //todo 2 fix tests

    @Test
    public void nothing_happens_to_list_of_unique_elements() {
        List<Integer> initialList = Lists.newArrayList(1, 2, 3);
        List<Integer> duplicateFreeList = DuplicateRemover.removeDuplicates(initialList);
        assertEquals(initialList, duplicateFreeList);
    }

    @Test
    public void a_list_of_non_unique_elements_has_duplicates_removed() {
        List<Integer> initialList = Lists.newArrayList(1, 1, 1);
        List<Integer> duplicateFreeList = DuplicateRemover.removeDuplicates(initialList);
        assertEquals(List.of(1), duplicateFreeList);
    }
}
