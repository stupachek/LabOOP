package lab5;

public class Sentence {
    private final SentenceMembers[] sentenceMembers;
    public Sentence(String text) {
        String[] sentences = text.split("(?=\\p{Punct})| ");
        sentenceMembers = new SentenceMembers[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            String sent = sentences[i];
            sentenceMembers[i] = sent.matches("\\p{Punct}")
                    ? new Punctuation(sent.charAt(0))
                    : new Word(sent);
        }
    }
    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i=0; i< sentenceMembers.length-1; i++) {
            if (sentenceMembers[i+1]instanceof Punctuation) textString.append(sentenceMembers[i]);
            else textString.append(sentenceMembers[i]).append(" ");
        }
        textString.append(sentenceMembers[sentenceMembers.length-1]);
        return textString.toString();
    }

    public SentenceMembers get(int i){
        return sentenceMembers[i];
    }

    public int  length(){
        return sentenceMembers.length;
    }





}

