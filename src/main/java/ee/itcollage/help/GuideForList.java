package ee.itcollage.help;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuideForList {

    public static void main(String[] args) {
        //creating
        List<Integer> numbers = new ArrayList<>();
        //adding
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //more pro is to
        List<Integer> numbers2 = List.of(1, 2, 3);
        //pre Java-11 it looked like
        List<Integer> numbers3 = Arrays.asList(1, 2, 3);

        //foreach iteration
        //idea type iter and tab
        System.out.println("first iteration");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //for-i iteration (prefer foreach/first one, use this only when i is necessary)
        //idea type fori and tab
        System.out.println("second iteration");
        for (int i = 0; i < numbers.size(); i++) {
            //type sout and tab
            Integer number = numbers.get(i);
            System.out.println(number);
        }

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
