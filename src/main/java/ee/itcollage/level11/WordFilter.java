package ee.itcollage.level11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().isNoun())
                .collect(Collectors.toList());
    }

    public Word getFirstVerb(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().isVerb())
                .findFirst()
                .orElse(null);
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        return words.stream()
                .filter(word -> word.getWordType().equals(type))
                .findFirst()
                .orElse(null);
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        return words.stream()
                .filter(word -> !word.getWordType().isNoun())
                .collect(Collectors.toList());
    }

    public List<String> getNounStrings(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().isNoun())
                .map(Word::getWord)
                .collect(Collectors.toList());
    }

    public String getFirstVerbString(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().isVerb())
                .map(Word::getWord)
                .findFirst()
                .orElse("");
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        return words.stream()
                .filter(word -> word.getWordType().equals(type))
                .map(Word::getWord)
                .findFirst()
                .orElse("");
    }
}
