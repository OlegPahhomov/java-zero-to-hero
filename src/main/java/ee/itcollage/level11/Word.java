package ee.itcollage.level11;

public class Word {

    private String word;
    private WordType wordType;

    enum WordType {
        NOUN, VERB, ADJECTIVE, OTHER;

        public boolean isNoun(){
            return this == NOUN;
        }

        public boolean isVerb(){
            return this == VERB;
        }

        public boolean isAdjective(){
            return this == ADJECTIVE;
        }

        public boolean isOther(){
            return this == OTHER;
        }
    }

    public Word(String word, WordType wordType) {
        this.word = word;
        this.wordType = wordType;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public WordType getWordType() {
        return wordType;
    }

    public void setWordType(WordType wordType) {
        this.wordType = wordType;
    }
}
