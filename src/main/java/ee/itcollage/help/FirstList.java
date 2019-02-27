package ee.itcollage.help;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstList {

    public static void main(String[] args) {
        //creating
        List<Integer> numbers = new ArrayList<>();
        //adding
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //creating and adding v2
        List<Integer> numbers2 = Arrays.asList(1, 2, 3);
        //creating and adding v3
        List<Integer> numbers3 = Lists.newArrayList(1, 2, 3);
        //iterating
        //idea type fori and tab
        System.out.println("first iteration");
        for (int i = 0; i < numbers.size(); i++) {
            //type sout and tab
            Integer number = numbers.get(i);
            System.out.println(number);
        }
        //iterating 2
        //idea type iter and tab
        System.out.println("second iteration");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        //removing
        int firstElement = 0;
        numbers.remove(firstElement);

        System.out.println("third iteration");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
