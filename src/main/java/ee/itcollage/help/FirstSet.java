package ee.itcollage.help;

import java.util.HashSet;
import java.util.Set;

public class FirstSet {

    public static void main(String[] args) {
        //creating
        Set<Integer> numbers = new HashSet<>();
        //adding
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        //iterating
        //idea type fori and tab
        System.out.println("first iteration is not allowed :/");
        //for (int i = 0; i < numbers.size(); i++) {
        //    //type sout and tab
        //    Integer number = numbers.get(i);
        //    System.out.println(number);
        //}
        //iterating 2
        //idea type iter and tab
        System.out.println("second iteration");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        //removing
        int element = 0;
        numbers.remove(element);

        System.out.println("third iteration");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
