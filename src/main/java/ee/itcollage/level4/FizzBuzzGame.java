package ee.itcollage.level4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzGame {

    //todo fizzbuzz is a drinking game
    // hope your version will be as fun
    // rules are as follows:
    // numbers 1-100
    // if it divides by 3 you see fizz
    // if it divides by 5 you see buzz
    // if it divides by 3 and 5 at the same time you say fizzbuzz
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        System.out.println("Example 1");
        for (Integer number : numbers) {
            //do your logic
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();
    }
}
