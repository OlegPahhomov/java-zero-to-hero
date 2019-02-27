package ee.itcollage.help;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstStream {

    public static void main(String[] args) {
        //todo we will learn this in future lectures, added here for completeness sake

        List<Integer> ints = Arrays.asList(-2, -1, 0, 0, 0, 1, 2);
        System.out.println(ints);

        //collect back to new list
        List<Integer> collectedInts = ints.stream().collect(Collectors.toList());
        System.out.println(collectedInts);

        //collect back to new set
        Set<Integer> set = ints.stream().collect(Collectors.toSet());
        System.out.println(set);

        //filter negatives
        List<Integer> collect = ints.stream().filter(integer -> integer < 0).collect(Collectors.toList());
        System.out.println(collect);

        //map to squares
        List<Integer> squares = ints.stream().map(integer -> integer * integer).collect(Collectors.toList());
        System.out.println(squares);

        //create a map of value and square pares
        Map<Integer, Integer> map = ints.stream().distinct().collect(Collectors.toMap((integer -> integer), (integer -> integer * integer)));
        System.out.println(map);

        //first negative
        Optional<Integer> first = ints.stream().filter(integer -> integer < 0).findFirst();
        System.out.println(first);
    }
}
