package ee.itcollage.level11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.NOUN))
                .collect(Collectors.toList());
    }

    public Word getFirstVerb(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.VERB))
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
                .filter(word -> !word.getWordType().equals(Word.WordType.NOUN))
                .collect(Collectors.toList());
    }

    public List<String> getNounStrings(List<Word> words){
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.NOUN))
                .map(Word::getWord)
                .collect(Collectors.toList());
    }

    public String getFirstVerbString(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.VERB))
                .map(Word::getWord)
                .findFirst()
                .orElse(null);
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        return words.stream()
                .filter(word -> word.getWordType().equals(type))
                .map(Word::getWord)
                .findFirst()
                .orElse(null);
    }
}
