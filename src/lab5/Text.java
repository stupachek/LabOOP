package lab5;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

public class Text {
    private final Sentence[] sentences;

    public Text(String textString) {
        String[] sentenceStrings = textString.split("(?<=[?.!])\\s?");
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
// TODO: 24.05.2021 перенести  исполнительный метод в класс Word  доделать компаратор 
//    public String vowelSort(){
//        ArrayList<Word> arrayListWordVowel = arraySort();
//        Comparator<Word> anonymousSortByname = new Comparator<Word>(){
//            public int compare(Word f1,Word f2){
//                return f1.gets().compareTo(f2.gets());
//            }
//        };
//
//
//
//        return arrayListWordVowel.toString();
//    }


}