package lab5;

public class Vowel implements WordMembers {
    private char vowel;

    public Vowel(char vowel) {
        this.vowel = vowel;
    }


    @Override
    public String toString() {
        return vowel + "" ;
    }
}
