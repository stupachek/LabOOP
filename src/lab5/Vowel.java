package lab5;

public class Vowel extends WordMembers {


    public Vowel(char vowel) {
        this.set(vowel);
    }


    @Override
    public String toString() {
        return this.get() + "" ;
    }
}
