package ee.itcollage.level13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.apache.commons.collections4.IterableUtils.isEmpty;

public class PalindromeWords {

    //todo write a program to analyze palindrome words
    // main method shows how to reverse a string
    // todo write tests for your code

    /**
     * palindrome is a word that is equal to itself reversed.
     * For example: radar (reversed radar) is a palindrome
     * cow (reversed woc) is not a palindrome
     */
    public AnalysisResult analyzePalindromes(List<String> strings) {
        if (isEmpty(strings)){
            return new AnalysisResult(new ArrayList<>(), new ArrayList<>());
        }
        List<String> palindrome = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();

        for (String string : strings) {
            if (string.equals(reversedString(string))) {
                palindrome.add(string);
            } else {
                otherWords.add(string);
            }
        }

        //v2
        Map<Boolean, List<String>> collect = strings.stream()
                .collect(Collectors.partitioningBy(string -> string.equals(reversedString(string))));
        new AnalysisResult(collect.get(true), collect.get(false));

        return new AnalysisResult(palindrome, otherWords);
    }

    public static void main(String[] args) {
        String palidrome = "radar";
        String reversedPalidrome = reversedString(palidrome);
        String other = "other";
        String otherReversed = reversedString(other);

        System.out.println(String.format("%s %s", palidrome, reversedPalidrome));
        System.out.println(String.format("%s %s", other, otherReversed));
    }

    private static String reversedString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}