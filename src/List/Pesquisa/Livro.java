package List.Pesquisa;

public class Livro {
    private String titulos;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulos, String autor, int anoPublicacao) {
        this.titulos = titulos;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulos() {
        return titulos;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulos='" + titulos + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
