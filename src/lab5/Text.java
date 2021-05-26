package lab5;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
//import java.util.Comparator;

public class Text {
    private final Sentence[] sentences;

    public Text(String textString) {
        String[] sentenceStrings = textString.trim().replaceAll(" +"," ").split("(?<=[?.!])\\s?");
        sentences = new Sentence[sentenceStrings.length];
        for (int i = 0; i < sentenceStrings.length; i++) {
            sentences[i] = new Sentence(sentenceStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder textStringBuilder = new StringBuilder();
        for (int i = 0; i < sentences.length - 1; i++) {
            textStringBuilder.append(sentences[i]).append(' ');
        }
        textStringBuilder.append(sentences[sentences.length - 1]);
        return textStringBuilder.toString();
    }

    private ArrayList<Word> arraySort() {
        ArrayList<Word> arrayListWordVowel = new ArrayList<>();
        for (Sentence sent : sentences) {
            for (int i = 0; i < sent.length(); i++) {
                if (sent.get(i) instanceof Word) {
                    if (((Word) sent.get(i)).get(0) instanceof Vowel) {
                        arrayListWordVowel.add(((Word) sent.get(i)));
                    }
                }
            }
        }
        return arrayListWordVowel;
    }

    public String sortedToString(){
        StringBuilder result=new StringBuilder();
        ArrayList<Word> arrayListWordVowel = arraySort();
        Collections.sort(arrayListWordVowel);
        for (Word word: arrayListWordVowel){
            result.append(word.toString()).append(" ");
        }
        return result.toString();

    }



}