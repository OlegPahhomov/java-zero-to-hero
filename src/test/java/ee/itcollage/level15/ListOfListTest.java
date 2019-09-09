package ee.itcollage.level15;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfListTest {

    @Test
    public void findFirst20NumbersDividableBy7() {
        List<Integer> result = IntStream.iterate(7, i -> i + 7).limit(20).boxed().collect(Collectors.toList());
        Assert.assertEquals(result, ListOfList.findFirst20NumbersDividableBy7());
    }
}