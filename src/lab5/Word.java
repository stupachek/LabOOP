package lab5;

public class Word implements SentenceMembers, Comparable<Word> {
    private final WordMembers[] wordMembers;

    public Word(String word) {
        String[] wordMemberLetters = word.split("");
        wordMembers = new WordMembers[wordMemberLetters.length];
        for (int i = 0; i < wordMemberLetters.length; i++) {
            String wordMemberLetter = wordMemberLetters[i];
            wordMembers[i] = wordMemberLetter.matches("[aAoOiIeEYyUu]")
                    ? new Vowel(wordMemberLetter.charAt(0))
                    : new Consonant(wordMemberLetter.charAt(0));
        }
    }


    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (WordMembers letter : wordMembers) {
            wordString.append(letter);
        }
        return wordString.toString();
    }

    public WordMembers get(int i) {
        return wordMembers[i];
    }
    public int length(){
        return wordMembers.length;
    }


    @Override
    public int compareTo(Word o) {
        if (o.length()<=1 ||this.length()<=1) {
            return this.length()-o.length();
        }
        if (o.get(1).get() < wordMembers[1].get()) {
            return 1;
        } else {
            return -1;
        }

    }
}



