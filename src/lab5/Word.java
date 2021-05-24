package lab5;

public  class Word implements SentenceMembers  {
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

    public WordMembers get(int i){
        return wordMembers[i];
    }


//    public int length(){
//        return wordMembers.length;
//    }

//    @Override
//    public int compareTo(Word word) {
//        if(word.get(1)<wordMembers[1].get()) {
//
//        }
    }



