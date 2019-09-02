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
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.print("Fizz");
            } else if (number % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(number);
            }
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("Example 2");
        for (Integer number : numbers) {
            String string = "";
            if (number % 3 == 0) string += "Fizz";
            if (number % 5 == 0) string += "Buzz";
            if (string.length() == 0) string += number;
            System.out.print(string);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("Example 3");
        for (Integer number : numbers) {
            String value;
            switch (number % 15) {
                case 3:
                case 6:
                case 9:
                case 12:  // divisible by 3, print Fizz
                    value = "Fizz";
                    break;
                case 5:
                case 10:  // divisible by 5, print Buzz
                    value = "Buzz";
                    break;
                case 0:  // divisible by 3 and by 5, print FizzBuzz
                    value = "FizzBuzz";
                    break;
                default:  // else print the number
                    value = Integer.toString(number);
            }
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("Example 4");
        for (Integer number : numbers) {
            String string = Optional.of(number)
                    .map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
                    .get();
            String result = !string.isEmpty() ? string : Integer.toString(number);
            System.out.print(result);
            System.out.print(" ");
        }
        System.out.println();

        // enterprised edition
        // https://github.com/up1/kata_fizzbuzz_ocp
    }
}
