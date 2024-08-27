package Set.PalavrasUnicas;

public class Palavras {
    private String palavra;

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavra='" + palavra + '\'' +
                '}';
    }

    public Palavras(String palavra) {
        this.palavra = palavra;
    }
}
