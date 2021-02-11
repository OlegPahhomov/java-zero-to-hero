package ee.itcollage.level11;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WordFilterTest {

    //todo 1 make tests pass

    private String sentence = "The quick brown fox jumps over the lazy dog and laughs";
    //todo you can read more about our sentence here: https://en.wikipedia.org/wiki/The_quick_brown_fox_jumps_over_the_lazy_dog
    private List<Word> words = List.of(
            new Word("the", Word.WordType.OTHER),
            new Word("quick", Word.WordType.ADJECTIVE),
            new Word("brown", Word.WordType.ADJECTIVE),
            new Word("fox", Word.WordType.NOUN),
            new Word("jumps", Word.WordType.VERB),
            new Word("over", Word.WordType.OTHER),
            new Word("the", Word.WordType.OTHER),
            new Word("lazy", Word.WordType.ADJECTIVE),
            new Word("dog", Word.WordType.NOUN),
            new Word("and", Word.WordType.OTHER),
            new Word("laughs", Word.WordType.VERB)
    );

    private WordFilter filter = new WordFilter();

    @Test
    public void getNouns() {
        List<Word> nouns = filter.getNouns(words);
        assertEquals(2, nouns.size());
    }

    @Test
    public void getFirstVerb() {
        Word firstVerb = filter.getFirstVerb(words);
        validateWord("jumps", Word.WordType.VERB, firstVerb);
    }

    @Test
    public void getFirstOfType() {
        Word adjective = filter.getFirstOfType(words, Word.WordType.ADJECTIVE);
        validateWord("quick", Word.WordType.ADJECTIVE, adjective);
        Word noun = filter.getFirstOfType(words, Word.WordType.NOUN);
        validateWord("fox", Word.WordType.NOUN, noun);
        Word other = filter.getFirstOfType(words, Word.WordType.OTHER);
        validateWord("the", Word.WordType.OTHER, other);
        Word verb = filter.getFirstOfType(words, Word.WordType.VERB);
        validateWord("jumps", Word.WordType.VERB, verb);
    }

    @Test
    public void getAllNotNouns() {
        List<Word> notNouns = filter.getAllNotNouns(words);
        List<String> words = notNouns.stream().map(Word::getWord).collect(Collectors.toList());
        assertFalse(words.contains("dog"));
    }

    @Test
    public void getNounStrings() {
        List<String> nounStrings = filter.getNounStrings(words);
        assertEquals(List.of("fox", "dog"), nounStrings);
    }

    @Test
    public void getFirstVerbString() {
        assertEquals("jumps", filter.getFirstVerbString(words));
    }

    @Test
    public void getFirstStringOfType() {
        String adjective = filter.getFirstStringOfType(words, Word.WordType.ADJECTIVE);
        assertEquals("quick", adjective);
        String noun = filter.getFirstStringOfType(words, Word.WordType.NOUN);
        assertEquals("fox", noun);
        String other = filter.getFirstStringOfType(words, Word.WordType.OTHER);
        assertEquals("the", other);
        String verb = filter.getFirstStringOfType(words, Word.WordType.VERB);
        assertEquals("jumps", verb);
    }

    private void validateWord(String name, Word.WordType type, Word actual) {
        assertEquals(name, actual.getWord());
        assertEquals(type, actual.getWordType());
    }
}
