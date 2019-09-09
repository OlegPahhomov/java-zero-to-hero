package ee.itcollage.level11;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        List<Word> nouns = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType().isNoun()){
                nouns.add(word);
            }
        }
        return nouns;
    }

    public Word getFirstVerb(List<Word> words) {
        for (Word word : words) {
            if (word.getWordType().isVerb()){
                return word;
            }
        }
        return null;
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        for (Word word : words) {
            if (word.getWordType().equals(type)){
                return word;
            }
        }
        return null;
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        return words;
    }

    public List<String> getNounStrings(List<Word> words){
        return new ArrayList<>();
    }

    public String getFirstVerbString(List<Word> words) {
        return "";
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        return "";
    }
}
