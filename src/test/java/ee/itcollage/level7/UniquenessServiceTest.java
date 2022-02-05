package ee.itcollage.level7;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquenessServiceTest {

    //todo 2 fix tests

    @Test
    void nothing_happens_to_a_list_of_unique_elements() {
        List<Integer> initialList = List.of(1, 2, 3);
        List<Integer> duplicateFreeList = UniquenessService.uniqueNumbers(initialList);
        assertEquals(initialList, duplicateFreeList);
    }

    @Test
    void uniqueness_is_created_on_non_unique_elements() {
        List<Integer> initialList = List.of(1, 1, 1);
        List<Integer> duplicateFreeList = UniquenessService.uniqueNumbers(initialList);
        assertEquals(List.of(1), duplicateFreeList);
    }
}
