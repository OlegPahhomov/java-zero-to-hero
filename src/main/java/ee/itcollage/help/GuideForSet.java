package ee.itcollage.help;

import java.util.HashSet;
import java.util.Set;

public class GuideForSet {

    public static void main(String[] args) {
        //creating
        Set<Integer> numbers = new HashSet<>();
        //adding
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //more pro is to
        Set<Integer> numbers2 = Set.of(1, 2, 3);

        //foreach iteration
        //idea type iter and tab
        System.out.println("second iteration");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //there is no for-i because set is not ordered

        //removing
        //instead of removing elements what you don't want you should return a new list without the elements
        //it is a good practise and will save you from tricky bugs

        //you have been warned and acknowledge the risks
        int firstElement = 0;
        numbers.remove(firstElement);

        System.out.println("third iteration");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
