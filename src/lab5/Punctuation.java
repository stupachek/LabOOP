package lab5;

public class Punctuation implements SentenceMembers{
    private char symbol;

    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}
