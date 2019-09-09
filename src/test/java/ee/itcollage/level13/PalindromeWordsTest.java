package ee.itcollage.level13;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PalindromeWordsTest {

    private static PalindromeWords palindromeWords = new PalindromeWords();

    @Test
    public void nulls() {
        AnalysisResult analysisResult = palindromeWords.analyzePalindromes(null);
        assertEquals(0, analysisResult.getOthers().size());
        assertEquals(0, analysisResult.getPalidromes().size());
    }

    @Test
    public void random_words() {
        AnalysisResult analysisResult = palindromeWords.analyzePalindromes(Arrays.asList("fly", "pie"));
        assertEquals(2, analysisResult.getOthers().size());
        assertEquals(0, analysisResult.getPalidromes().size());
    }

    @Test
    public void palindrome_words() {
        AnalysisResult analysisResult = palindromeWords.analyzePalindromes(Arrays.asList("radar", "madam"));
        assertEquals(0, analysisResult.getOthers().size());
        assertEquals(2, analysisResult.getPalidromes().size());
    }

    @Test
    public void mixed() {
        AnalysisResult analysisResult = palindromeWords.analyzePalindromes(Arrays.asList("fly", "pie", "radar", "madam"));
        assertEquals(2, analysisResult.getOthers().size());
        assertEquals(2, analysisResult.getPalidromes().size());
        assertEquals(Arrays.asList("radar", "madam"), analysisResult.getPalidromes());
    }
}