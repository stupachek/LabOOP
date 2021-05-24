package lab5;

public class Consonant  implements WordMembers{
    private char consonant;

    public Consonant(char consonant) {
        this.consonant = consonant;
    }


    @Override
    public String toString() {
        return consonant + "" ;
    }
}

