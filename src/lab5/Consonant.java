package lab5;

public class Consonant  extends WordMembers{


    public Consonant(char consonant) {
        this.set(consonant);
    }


    @Override
    public String toString() {
        return this.get() + "" ;
    }
}

