package ee.itcollage.level15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfList {

    private static final List<Integer> firstList = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
    private static final List<Integer> secondList = IntStream.rangeClosed(11, 100).boxed().collect(Collectors.toList());
    private static final List<Integer> thirdList = IntStream.rangeClosed(101, 1000).boxed().collect(Collectors.toList());

    private static final List<List<Integer>> numbers = List.of(firstList, secondList, thirdList);

    //Read method name to understand what to do. You are not allowed to use regular lists, use only list of list with name numbers.
    //Only streams are allowed
    //Read about Stream::flatmap()
    public static List<Integer> findFirst20NumbersDividableBy7() {
        return null;
    }
}
